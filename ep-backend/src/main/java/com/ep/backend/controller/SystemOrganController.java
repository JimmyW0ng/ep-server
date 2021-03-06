package com.ep.backend.controller;

import com.ep.common.tool.BeanTools;
import com.ep.common.tool.StringTools;
import com.ep.domain.component.ConstantRegionComponent;
import com.ep.domain.constant.BizConstant;
import com.ep.domain.pojo.ResultDo;
import com.ep.domain.pojo.bo.SystemOrganBo;
import com.ep.domain.pojo.dto.FileDto;
import com.ep.domain.pojo.po.EpConstantRegionPo;
import com.ep.domain.pojo.po.EpFilePo;
import com.ep.domain.pojo.po.EpOrganConfigPo;
import com.ep.domain.pojo.po.EpOrganPo;
import com.ep.domain.repository.domain.enums.EpConstantRegionRegionType;
import com.ep.domain.service.FileService;
import com.ep.domain.service.OrganConfigService;
import com.ep.domain.service.OrganService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import static com.ep.domain.repository.domain.Ep.EP;

/**
 * @Description: 后台商家机构控制器
 * @Author: CC.F
 * @Date: 11:19 2018/1/29
 */
@Slf4j
@Controller
@RequestMapping("auth/systemOrgan")
public class SystemOrganController extends BackendController {

    @Autowired
    private OrganService organService;
    @Autowired
    private ConstantRegionComponent constantRegionComponent;
    @Autowired
    private FileService fileService;
    @Autowired
    private OrganConfigService organConfigService;


    @GetMapping("index")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    public String index(Model model,
                        @PageableDefault(sort = "id", direction = Sort.Direction.DESC) Pageable pageable,
                        @RequestParam(value = "ognName", required = false) String ognName,
                        @RequestParam(value = "crStartTime", required = false) Timestamp crStartTime,
                        @RequestParam(value = "crEndTime", required = false) Timestamp crEndTime
    ) {
        Map<String, Object> searchMap = Maps.newHashMap();
        Collection<Condition> conditions = Lists.newArrayList();
        if (StringTools.isNotBlank(ognName)) {
            conditions.add(EP.EP_ORGAN.OGN_NAME.like("%" + ognName + "%"));
        }
        searchMap.put("ognName", ognName);
        if (null != crStartTime) {
            conditions.add(EP.EP_ORGAN.CREATE_AT.greaterOrEqual(crStartTime));
        }
        searchMap.put("crStartTime", crStartTime);
        if (null != crEndTime) {
            conditions.add(EP.EP_ORGAN.CREATE_AT.lessOrEqual(crEndTime));
        }
        searchMap.put("crEndTime", crEndTime);
        conditions.add(EP.EP_ORGAN.DEL_FLAG.eq(false));
        Page<EpOrganPo> page = organService.findByPageAndCondition(pageable, conditions);
        model.addAttribute("page", page);
        model.addAttribute("searchMap", searchMap);
        return "systemOrgan/index";
    }

    /**
     * 注册初始化
     *
     * @param model
     * @return
     */
    @GetMapping("createInit")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    public String createInit(Model model
    ) {
        model.addAttribute("organBo", new SystemOrganBo());
        model.addAttribute("province", constantRegionComponent.getMapByType(EpConstantRegionRegionType.province));
        model.addAttribute("district", null);
        model.addAttribute("city", null);
        return "systemOrgan/form";
    }

    /**
     * 根据省获取市
     *
     * @param model
     * @return
     */
    @GetMapping("getCityByProvince/{provinceId}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo<Map<Long, String>> getCityByProvince(Model model, @PathVariable("provinceId") Long provinceId
    ) {
        ResultDo<Map<Long, String>> resultDo = ResultDo.build();
        resultDo.setResult(constantRegionComponent.getMapByParentId(provinceId));
        return resultDo;
    }

    /**
     * 根据市获取区
     *
     * @param
     * @return
     */
    @GetMapping("getDistrictByCity/{cityId}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo<Map<Long, String>> getDistrictByCity(@PathVariable("cityId") Long cityId
    ) {
        ResultDo<Map<Long, String>> resultDo = ResultDo.build();
        resultDo.setResult(constantRegionComponent.getMapByParentId(cityId));
        return resultDo;
    }

    /**
     * 新增机构
     *
     * @param bo
     * @return
     */
    @PostMapping("create")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo create(SystemOrganBo bo) {
        return organService.createSystemOrgan(bo);
    }


    /**
     * 修改机构
     *
     * @param bo
     * @return
     */
    @PostMapping("update")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo update(SystemOrganBo bo) {
        return organService.updateSystemOrgan(bo);
    }

    /**
     * 修改机构初始化
     *
     * @param model
     * @param id
     * @return
     */
    @GetMapping("updateInit/{id}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    public String updateInit(Model model, @PathVariable("id") Long id
    ) {
        EpOrganPo po = organService.getById(id).get();
        EpConstantRegionPo constantRegionPoDistrict = constantRegionComponent.getById(po.getOgnRegion());
        Long cityId = constantRegionPoDistrict.getParentId();
        EpConstantRegionPo constantRegionPoCity = constantRegionComponent.getById(cityId);
        Long provinceId = constantRegionPoCity.getParentId();
        model.addAttribute("district", constantRegionComponent.getMapByParentId(cityId));
        model.addAttribute("districtId", constantRegionPoDistrict.getId());
        model.addAttribute("city", constantRegionComponent.getMapByParentId(provinceId));
        model.addAttribute("cityId", cityId);
        model.addAttribute("province", constantRegionComponent.getMapByType(EpConstantRegionRegionType.province));
        model.addAttribute("provinceId", provinceId);
        //机构配置
        Optional<EpOrganConfigPo> organConfigOptional = organConfigService.getByOgnId(id);
        SystemOrganBo bo = new SystemOrganBo();
        BeanTools.copyPropertiesIgnoreNull(po, bo);
        if (organConfigOptional.isPresent()) {
            bo.setSupportTag(organConfigOptional.get().getSupportTag());
            bo.setPrivateFlag(organConfigOptional.get().getPrivateFlag());
            bo.setWechatPayFlag(organConfigOptional.get().getWechatPayFlag());
        }
        model.addAttribute("organBo", bo);
        //主图
        Optional<EpFilePo> mainpicImgOptional = organService.getOgnMainpic(id);
        if (mainpicImgOptional.isPresent()) {
            model.addAttribute("mainpicImgUrl", mainpicImgOptional.get().getFileUrl());
        }
        //logo
        Optional<EpFilePo> logoImgOptional = organService.getOgnLogo(id);
        if (logoImgOptional.isPresent()) {
            model.addAttribute("logoImgUrl", logoImgOptional.get().getFileUrl());
        }
        return "systemOrgan/form";
    }

    /**
     * 查看机构
     *
     * @param model
     * @param id
     * @return
     */
    @GetMapping("view/{id}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    public String view(Model model, @PathVariable("id") Long id
    ) {
        EpOrganPo po = organService.getById(id).get();
        //区
        EpConstantRegionPo constantRegionPoDistrict = constantRegionComponent.getById(po.getOgnRegion());
        model.addAttribute("district", constantRegionPoDistrict.getRegionName());
        Long cityId = constantRegionPoDistrict.getParentId();
        //市
        EpConstantRegionPo constantRegionPoCity = constantRegionComponent.getById(cityId);
        model.addAttribute("city", constantRegionPoCity.getRegionName());
        Long provinceId = constantRegionPoCity.getParentId();
        //省
        EpConstantRegionPo constantRegionPoProvince = constantRegionComponent.getById(provinceId);
        model.addAttribute("province", constantRegionPoProvince.getRegionName());
        //机构配置
        Optional<EpOrganConfigPo> organConfigOptional = organConfigService.getByOgnId(id);
        SystemOrganBo bo = new SystemOrganBo();
        BeanTools.copyPropertiesIgnoreNull(po, bo);
        if (organConfigOptional.isPresent()) {
            bo.setSupportTag(organConfigOptional.get().getSupportTag());
            bo.setPrivateFlag(organConfigOptional.get().getPrivateFlag());
            bo.setWechatPayFlag(organConfigOptional.get().getWechatPayFlag());
        }
        model.addAttribute("organBo", bo);
        //主图
        Optional<EpFilePo> mainpicImgOptional = organService.getOgnMainpic(id);
        if (mainpicImgOptional.isPresent()) {
            model.addAttribute("mainpicImgUrl", mainpicImgOptional.get().getFileUrl());
        }
        //logo
        Optional<EpFilePo> logoImgOptional = organService.getOgnLogo(id);
        if (logoImgOptional.isPresent()) {
            model.addAttribute("logoImgUrl", logoImgOptional.get().getFileUrl());
        }
        return "systemOrgan/view";
    }

    /**
     * 冻结机构
     *
     * @param id
     * @return
     */
    @GetMapping("freeze/{id}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo freeze(@PathVariable("id") Long id
    ) {
        return organService.freezeById(id);
    }

    /**
     * 解冻机构
     *
     * @param id
     * @return
     */
    @GetMapping("unfreeze/{id}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo unfreeze(@PathVariable("id") Long id
    ) {
        return organService.unfreezeById(id);
    }

    /**
     * 上传商家主图
     *
     * @param file
     * @return
     */
    @PostMapping("uploadMainpic")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo uploadMainpic(@RequestParam("file") MultipartFile file) throws Exception {
        return fileService.addFileByBizType(file.getName(), file.getBytes(), BizConstant.FILE_BIZ_TYPE_CODE_ORGAN_MAIN_PIC, null);

    }

    /**
     * 上传商家logo
     *
     * @param file
     * @return
     */
    @PostMapping("uploadLogo")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo<FileDto> uploadLogo(@RequestParam("file") MultipartFile file) throws Exception {
        return fileService.addFileByBizType(file.getName(), file.getBytes(), BizConstant.FILE_BIZ_TYPE_CODE_ORGAN_LOGO, null);

    }


    /**
     * 机构下线
     *
     * @param id
     * @return
     */
    @GetMapping("offline/{id}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo offline(@PathVariable("id") Long id) {
        return organService.offlineById(id);
    }

    /**
     * 机构上线
     *
     * @param id
     * @return
     */
    @GetMapping("online/{id}")
    @PreAuthorize("hasAnyAuthority('platform:organ:index')")
    @ResponseBody
    public ResultDo onlineById(@PathVariable("id") Long id) {
        return organService.onlineById(id);
    }

}
