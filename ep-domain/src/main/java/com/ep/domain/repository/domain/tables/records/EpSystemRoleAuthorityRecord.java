/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.tables.EpSystemRoleAuthority;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 角色权限表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpSystemRoleAuthorityRecord extends UpdatableRecordImpl<EpSystemRoleAuthorityRecord> implements Record8<Long, Long, Long, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -154986307;

    /**
     * Setter for <code>ep.ep_system_role_authority.id</code>. 主键
     */
    public EpSystemRoleAuthorityRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_system_role_authority.role_id</code>. 角色id
     */
    public EpSystemRoleAuthorityRecord setRoleId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.role_id</code>. 角色id
     */
    public Long getRoleId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_system_role_authority.menu_id</code>. 菜单id
     */
    public EpSystemRoleAuthorityRecord setMenuId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.menu_id</code>. 菜单id
     */
    public Long getMenuId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>ep.ep_system_role_authority.create_at</code>. 创建时间
     */
    public EpSystemRoleAuthorityRecord setCreateAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>ep.ep_system_role_authority.update_at</code>. 更新时间
     */
    public EpSystemRoleAuthorityRecord setUpdateAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ep.ep_system_role_authority.remark</code>. 备注信息
     */
    public EpSystemRoleAuthorityRecord setRemark(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.remark</code>. 备注信息
     */
    public String getRemark() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ep.ep_system_role_authority.del_flag</code>. 删除标记
     */
    public EpSystemRoleAuthorityRecord setDelFlag(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>ep.ep_system_role_authority.version</code>.
     */
    public EpSystemRoleAuthorityRecord setVersion(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_role_authority.version</code>.
     */
    public Long getVersion() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.MENU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.VERSION;
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
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value2(Long value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value3(Long value) {
        setMenuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value4(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value5(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value6(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value7(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord value8(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemRoleAuthorityRecord values(Long value1, Long value2, Long value3, Timestamp value4, Timestamp value5, String value6, Boolean value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpSystemRoleAuthorityRecord
     */
    public EpSystemRoleAuthorityRecord() {
        super(EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY);
    }

    /**
     * Create a detached, initialised EpSystemRoleAuthorityRecord
     */
    public EpSystemRoleAuthorityRecord(Long id, Long roleId, Long menuId, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY);

        set(0, id);
        set(1, roleId);
        set(2, menuId);
        set(3, createAt);
        set(4, updateAt);
        set(5, remark);
        set(6, delFlag);
        set(7, version);
    }
}
