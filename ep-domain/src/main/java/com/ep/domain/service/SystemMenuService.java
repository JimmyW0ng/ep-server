package com.ep.domain.service;

import com.ep.common.tool.StringTools;
import com.ep.domain.constant.BizConstant;
import com.ep.domain.constant.MessageCode;
import com.ep.domain.pojo.ResultDo;
import com.ep.domain.pojo.bo.SystemMenuBo;
import com.ep.domain.pojo.po.EpSystemMenuPo;
import com.ep.domain.repository.SystemMenuRepository;
import com.ep.domain.repository.SystemRoleAuthorityRepository;
import com.ep.domain.repository.domain.enums.EpSystemUserType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 菜单服务类
 * @Author: J.W
 * @Date: 上午9:30 2018/1/14
 */
@Slf4j
@Service
public class SystemMenuService {
    @Autowired
    private SystemMenuRepository systemMenuRepository;
    @Autowired
    private SystemRoleAuthorityRepository systemRoleAuthorityRepository;

    public EpSystemMenuPo getById(Long id) {
        return systemMenuRepository.findById(id);

    }

    public List<EpSystemMenuPo> getAllByUserType(EpSystemUserType type) {
        return systemMenuRepository.getAllByUserType(type);
    }

    public List<SystemMenuBo> getLeftMenuByUserType(EpSystemUserType type) {
        List<SystemMenuBo> list = null;
        if(type.equals(EpSystemUserType.platform)){
            list = systemMenuRepository.getAllMenu(BizConstant.ADMIN_MENU_PARENT_ID);
        }else{
            list = systemMenuRepository.getAllMenu(BizConstant.BACKEND_MENU_PARENT_ID);
        }

        list.forEach(p -> {
            p.setChildList(systemMenuRepository.getAllMenu(p.getId()));
        });
        return list;
    }

    /**
     * 新增菜单
     *
     * @param po
     * @return
     */
    public ResultDo createMenu(EpSystemMenuPo po) {
        log.info("[菜单]新增菜单开始，菜单对象={}。", po);
        if (null == po.getParentId() || null == po.getTarget()
                || null == po.getTarget() || null == po.getMenuType()
                || StringTools.isBlank(po.getMenuName()) || null == po.getSort()
                || StringTools.isBlank(po.getPermission())) {
            log.error("[菜单]新增菜单失败。请求参数异常。");
            return ResultDo.build(MessageCode.ERROR_SYSTEM_PARAM_FORMAT);
        }
        systemMenuRepository.insert(po);
        return ResultDo.build();
    }

    /**
     * 更新菜单
     *
     * @param po
     * @return
     */
    public ResultDo updateMenu(EpSystemMenuPo po) {
        log.info("[菜单]修改菜单开始，菜单对象={}。", po);
        if (null == po.getId() || null == po.getParentId() || null == po.getMenuType()
                || StringTools.isBlank(po.getMenuName()) || null == po.getSort()
                || StringTools.isBlank(po.getPermission())) {
            log.error("[菜单]修改菜单失败。请求参数异常。");
            return ResultDo.build(MessageCode.ERROR_SYSTEM_PARAM_FORMAT);
        }
        if (systemMenuRepository.updatePo(po) == BizConstant.DB_NUM_ONE) {
            log.info("[菜单]修改菜单成功。id={}。", po.getId());
            return ResultDo.build();
        } else {
            log.error("[菜单]修改菜单失败。id={}。", po.getId());
            return ResultDo.build(MessageCode.ERROR_OPERATE_FAIL);
        }
    }

    /**
     * 删除菜单
     *
     * @param ids
     */
    @Transactional(rollbackFor = Exception.class)
    public void deleteMenu(List<Long> ids) {
        log.info("[菜单]删除菜单开始。删除菜单ids={}。", ids);
        //逻辑删除 菜单表 记录
        systemMenuRepository.deleteLogicByIds(ids);
        //物理删除 角色权限表 记录
        systemRoleAuthorityRepository.deletePhysicByMenuIds(ids);
        log.info("[菜单]删除菜单成功。删除菜单ids={}。", ids);
    }
}
