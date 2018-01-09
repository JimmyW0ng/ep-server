/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpSystemMenuMenuType;
import com.ep.domain.repository.domain.enums.EpSystemMenuStatus;
import com.ep.domain.repository.domain.enums.EpSystemMenuTarget;
import com.ep.domain.repository.domain.tables.EpSystemMenu;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 菜单表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpSystemMenuRecord extends UpdatableRecordImpl<EpSystemMenuRecord> implements Record15<Long, Long, EpSystemMenuTarget, EpSystemMenuMenuType, String, String, String, Integer, EpSystemMenuStatus, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -672555051;

    /**
     * Create a detached EpSystemMenuRecord
     */
    public EpSystemMenuRecord() {
        super(EpSystemMenu.EP_SYSTEM_MENU);
    }

    /**
     * Create a detached, initialised EpSystemMenuRecord
     */
    public EpSystemMenuRecord(Long id, Long parentId, EpSystemMenuTarget target, EpSystemMenuMenuType menuType, String menuName, String href, String icon, Integer sort, EpSystemMenuStatus status, String permission, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpSystemMenu.EP_SYSTEM_MENU);

        set(0, id);
        set(1, parentId);
        set(2, target);
        set(3, menuType);
        set(4, menuName);
        set(5, href);
        set(6, icon);
        set(7, sort);
        set(8, status);
        set(9, permission);
        set(10, createAt);
        set(11, updateAt);
        set(12, remark);
        set(13, delFlag);
        set(14, version);
    }

    /**
     * Getter for <code>ep.ep_system_menu.id</code>. 编号
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_system_menu.id</code>. 编号
     */
    public EpSystemMenuRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.parent_id</code>. 父级编号
     */
    public Long getParentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_system_menu.parent_id</code>. 父级编号
     */
    public EpSystemMenuRecord setParentId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.target</code>. 目标：前台，商户后台，系统后台
     */
    public EpSystemMenuTarget getTarget() {
        return (EpSystemMenuTarget) get(2);
    }

    /**
     * Setter for <code>ep.ep_system_menu.target</code>. 目标：前台，商户后台，系统后台
     */
    public EpSystemMenuRecord setTarget(EpSystemMenuTarget value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.menu_type</code>. 菜单类型：分组，动作
     */
    public EpSystemMenuMenuType getMenuType() {
        return (EpSystemMenuMenuType) get(3);
    }

    /**
     * Setter for <code>ep.ep_system_menu.menu_type</code>. 菜单类型：分组，动作
     */
    public EpSystemMenuRecord setMenuType(EpSystemMenuMenuType value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.menu_name</code>. 菜单名称
     */
    public String getMenuName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ep.ep_system_menu.menu_name</code>. 菜单名称
     */
    public EpSystemMenuRecord setMenuName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.href</code>. 链接
     */
    public String getHref() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ep.ep_system_menu.href</code>. 链接
     */
    public EpSystemMenuRecord setHref(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.icon</code>. 图标
     */
    public String getIcon() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ep.ep_system_menu.icon</code>. 图标
     */
    public EpSystemMenuRecord setIcon(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.sort</code>. 排序（升序）
     */
    public Integer getSort() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ep.ep_system_menu.sort</code>. 排序（升序）
     */
    public EpSystemMenuRecord setSort(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.status</code>. 状态
     */
    public EpSystemMenuStatus getStatus() {
        return (EpSystemMenuStatus) get(8);
    }

    /**
     * Setter for <code>ep.ep_system_menu.status</code>. 状态
     */
    public EpSystemMenuRecord setStatus(EpSystemMenuStatus value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.permission</code>. 权限标识
     */
    public String getPermission() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ep.ep_system_menu.permission</code>. 权限标识
     */
    public EpSystemMenuRecord setPermission(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ep.ep_system_menu.create_at</code>. 创建时间
     */
    public EpSystemMenuRecord setCreateAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ep.ep_system_menu.update_at</code>. 更新时间
     */
    public EpSystemMenuRecord setUpdateAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.remark</code>. 备注信息
     */
    public String getRemark() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ep.ep_system_menu.remark</code>. 备注信息
     */
    public EpSystemMenuRecord setRemark(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_menu.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>ep.ep_system_menu.del_flag</code>. 删除标记
     */
    public EpSystemMenuRecord setDelFlag(Boolean value) {
        set(13, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ep.ep_system_menu.version</code>.
     */
    public Long getVersion() {
        return (Long) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ep.ep_system_menu.version</code>.
     */
    public EpSystemMenuRecord setVersion(Long value) {
        set(14, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, EpSystemMenuTarget, EpSystemMenuMenuType, String, String, String, Integer, EpSystemMenuStatus, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, EpSystemMenuTarget, EpSystemMenuMenuType, String, String, String, Integer, EpSystemMenuStatus, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpSystemMenu.EP_SYSTEM_MENU.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpSystemMenu.EP_SYSTEM_MENU.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpSystemMenuTarget> field3() {
        return EpSystemMenu.EP_SYSTEM_MENU.TARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpSystemMenuMenuType> field4() {
        return EpSystemMenu.EP_SYSTEM_MENU.MENU_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EpSystemMenu.EP_SYSTEM_MENU.MENU_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EpSystemMenu.EP_SYSTEM_MENU.HREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EpSystemMenu.EP_SYSTEM_MENU.ICON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return EpSystemMenu.EP_SYSTEM_MENU.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpSystemMenuStatus> field9() {
        return EpSystemMenu.EP_SYSTEM_MENU.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EpSystemMenu.EP_SYSTEM_MENU.PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return EpSystemMenu.EP_SYSTEM_MENU.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return EpSystemMenu.EP_SYSTEM_MENU.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return EpSystemMenu.EP_SYSTEM_MENU.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return EpSystemMenu.EP_SYSTEM_MENU.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return EpSystemMenu.EP_SYSTEM_MENU.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuTarget value3() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuMenuType value4() {
        return getMenuType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMenuName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuStatus value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPermission();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value2(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value3(EpSystemMenuTarget value) {
        setTarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value4(EpSystemMenuMenuType value) {
        setMenuType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value5(String value) {
        setMenuName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value6(String value) {
        setHref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value7(String value) {
        setIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value8(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value9(EpSystemMenuStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value10(String value) {
        setPermission(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value11(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value12(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value13(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value14(Boolean value) {
        setDelFlag(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord value15(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenuRecord values(Long value1, Long value2, EpSystemMenuTarget value3, EpSystemMenuMenuType value4, String value5, String value6, String value7, Integer value8, EpSystemMenuStatus value9, String value10, Timestamp value11, Timestamp value12, String value13, Boolean value14, Long value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }
}