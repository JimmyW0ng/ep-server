package com.ep.backend.controller;

import com.ep.common.tool.CryptTools;
import com.ep.common.tool.DateTools;
import com.ep.domain.constant.BizConstant;
import com.ep.domain.pojo.ResultDo;
import com.ep.domain.pojo.bo.HomeClassCommentBo;
import com.ep.domain.pojo.bo.HomeMemberChildReplyBo;
import com.ep.domain.pojo.bo.SystemMenuBo;
import com.ep.domain.pojo.po.EpFilePo;
import com.ep.domain.pojo.po.EpOrganPo;
import com.ep.domain.pojo.po.EpSystemRolePo;
import com.ep.domain.pojo.po.EpSystemUserPo;
import com.ep.domain.repository.domain.enums.EpOrganCourseCourseStatus;
import com.ep.domain.service.*;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.security.GeneralSecurityException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Description: 首页控制基类
 * @Author: FCC
 * @Date: 下午4:55 2018/1/21
 */
@Controller
@RequestMapping("auth")
public class IndexController extends BackendController {
    @Autowired
    private SystemMenuService systemMenuService;
    @Autowired
    private SystemUserService systemUserService;
    @Autowired
    private SystemUserRoleService systemUserRoleService;
    @Autowired
    private SystemRoleService systemRoleService;
    @Autowired
    private OrganService organService;
    @Autowired
    private OrderService orderervice;
    @Autowired
    private OrganCourseService organCourseService;
    @Autowired
    private MemberChildCommentService memberChildCommentService;
    @Autowired
    private OrganClassCommentService organClassCommentService;


    /**
     * 登录成功后布局页
     *
     * @param model
     * @return
     */
    @GetMapping("/index")
    public String index(Model model) {
        EpSystemUserPo currentUser = getCurrentUser().get();
        List<Long> roleIds = systemUserRoleService.getRoleIdsByUserId(currentUser.getId());
        List<SystemMenuBo> leftMenu = systemMenuService.getLeftMenuByUserType(currentUser.getType(), roleIds);
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("leftMenu", leftMenu);
        if (currentUser.getOgnId() != null) {
            //logo
            Optional<EpFilePo> logoImgOptional = organService.getOgnLogo(currentUser.getOgnId());
            if (logoImgOptional.isPresent()) {
                model.addAttribute("logoImgUrl", logoImgOptional.get().getFileUrl());
            }
        }
        return "layout/default";
    }

    /**
     * 登录成功后ifeame首页
     *
     * @return
     */
    @GetMapping("/homePage")
    public String homePage(Model model) {
        Long ognId = super.getCurrentUserOgnId();
        if (ognId == null) {
            return "index";
        }
        long countOrder = orderervice.countSaveOrder(ognId);
        //未处理订单
        model.addAttribute("saveOrderCount", new DecimalFormat("###,###").format(countOrder));
        int onlineCount = organCourseService.findByOgnIdAndStatus(ognId, EpOrganCourseCourseStatus.online).size();
        //上线中产品数
        model.addAttribute("onlineCount", new DecimalFormat("###,###").format(onlineCount));
        Optional<EpOrganPo> organOptional = organService.getById(ognId);
        //报名人数
        model.addAttribute("totalParticipate", organOptional.isPresent() ?
                new DecimalFormat("###,###").format(organOptional.get().getTotalParticipate()) : 0);
        //综合得分
        model.addAttribute("togetherScore", organOptional.isPresent() ?
                new DecimalFormat("###,###").format(organOptional.get().getTogetherScore()) : 0);
        //新回复
        List<HomeMemberChildReplyBo> homeReplys = memberChildCommentService.findHomeReply(ognId, BizConstant.OGN_HOME_REPLY_SIZE);
        homeReplys.forEach(p -> {
            p.setReplyFromNow(DateTools.getFromNow(p.getReplyCreateAt()));
            p.setLaunchFromNow(DateTools.getFromNow(p.getLaunchCreateAt()));
        });
        model.addAttribute("homeReplys", homeReplys);
        //精选评价
        List<HomeClassCommentBo> homeClassComments = organClassCommentService.findHomeComment(ognId, BizConstant.OGN_HOME_COMMENT_SIZE);
        model.addAttribute("homeClassComments", homeClassComments);
        Map<String, Object> resultMap = orderervice.homeOrderChart(ognId, BizConstant.OGN_HOME_MONTH_SIZE, BizConstant.OGN_HOME_RECENTLY_DAYS);
        //最近6个月内报名数
        model.addAttribute("saveOrderCounts", resultMap.get("saveOrderCounts"));
        //最近6个月内报名成功数
        model.addAttribute("successOrderCounts", resultMap.get("successOrderCounts"));
        List<String> monthStrs = Lists.newArrayList();

        for (int i = 0; i < BizConstant.OGN_HOME_MONTH_SIZE; i++) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(DateTools.getCurrentDate());
            cal.add(Calendar.MONTH, -(BizConstant.OGN_HOME_MONTH_SIZE - BizConstant.DB_NUM_ONE - i));
            monthStrs.add(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + BizConstant.DB_NUM_ONE) + "月");
        }
        //最近6个月
        model.addAttribute("monthStrs", monthStrs);
        //机构所有订单数
        model.addAttribute("allOrderCount", new DecimalFormat("###,###").format((long) resultMap.get("allOrderCount")));
        //机构最近几天内的订单数
        model.addAttribute("ordersRecentlyCount", new DecimalFormat("###,###").format((long) resultMap.get("ordersRecentlyCount")));
        //机构最近几天内的订单销售额
        model.addAttribute("orderPrizeSum", new DecimalFormat("###,###.##").format(
                (BigDecimal) resultMap.get("orderPrizeSum") == null ? BigDecimal.ZERO : resultMap.get("orderPrizeSum")));
        return "merchantIndex";
    }


    /**
     * 个人查看
     *
     * @param model
     * @return
     */
    @GetMapping("/settingView")
    public String settingView(Model model) throws GeneralSecurityException {
        EpSystemUserPo systemUserPo = super.getCurrentUser().get();
        systemUserPo.setPassword(CryptTools.aesDecrypt(systemUserPo.getPassword(), systemUserPo.getSalt()));

        model.addAttribute("systemUserPo", systemUserPo);
        List<Long> roleIds = systemUserRoleService.getRoleIdsByUserId(systemUserPo.getId());
        List<EpSystemRolePo> lists = systemRoleService.getAllRoleByUserType(systemUserPo.getType());
        model.addAttribute("roleList", lists);
        model.addAttribute("roleIds", roleIds);
        return "systemUser/settingView";

    }

    /**
     * 个人设置初始化
     *
     * @param model
     * @return
     */
    @GetMapping("/settingEdit")
    public String settingEdit(Model model) {
        EpSystemUserPo systemUserPo = super.getCurrentUser().get();

        model.addAttribute("systemUserPo", systemUserPo);
        model.addAttribute("wechatXcxOrganUrl", String.format(BizConstant.WECHAT_XCX_ORGAN_URL, systemUserPo.getOgnId()));
        return "systemUser/settingForm";
    }

    /**
     * 个人设置修改密码
     *
     * @param oldPsd
     * @param password
     * @return
     * @throws GeneralSecurityException
     */
    @PostMapping("updatePsd")
    @ResponseBody
    public ResultDo updatePsd(@RequestParam(value = "oldPsd") String oldPsd,
                              @RequestParam(value = "password") String password) throws GeneralSecurityException {
        EpSystemUserPo systemUserPo = super.getCurrentUser().get();
        return systemUserService.updatePassword(systemUserPo.getId(), oldPsd, password);
    }


}
