/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpSystemUserStatus;
import com.ep.domain.repository.domain.tables.EpSystemUser;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 平台用户表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpSystemUserRecord extends UpdatableRecordImpl<EpSystemUserRecord> implements Record13<Long, Long, String, String, String, String, String, EpSystemUserStatus, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -1237064709;

    /**
     * Create a detached EpSystemUserRecord
     */
    public EpSystemUserRecord() {
        super(EpSystemUser.EP_SYSTEM_USER);
    }

    /**
     * Create a detached, initialised EpSystemUserRecord
     */
    public EpSystemUserRecord(Long id, Long mobile, String userName, String salt, String password, String role, String email, EpSystemUserStatus status, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpSystemUser.EP_SYSTEM_USER);

        set(0, id);
        set(1, mobile);
        set(2, userName);
        set(3, salt);
        set(4, password);
        set(5, role);
        set(6, email);
        set(7, status);
        set(8, createAt);
        set(9, updateAt);
        set(10, remark);
        set(11, delFlag);
        set(12, version);
    }

    /**
     * Getter for <code>ep.ep_system_user.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_system_user.id</code>. 主键
     */
    public EpSystemUserRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.mobile</code>. 手机号
     */
    public Long getMobile() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_system_user.mobile</code>. 手机号
     */
    public EpSystemUserRecord setMobile(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.user_name</code>. 用户名
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_system_user.user_name</code>. 用户名
     */
    public EpSystemUserRecord setUserName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.salt</code>. 盐
     */
    public String getSalt() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_system_user.salt</code>. 盐
     */
    public EpSystemUserRecord setSalt(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ep.ep_system_user.password</code>. 密码
     */
    public EpSystemUserRecord setPassword(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.role</code>. 角色
     */
    public String getRole() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ep.ep_system_user.role</code>. 角色
     */
    public EpSystemUserRecord setRole(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ep.ep_system_user.email</code>. 邮箱
     */
    public EpSystemUserRecord setEmail(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.status</code>. 状态：正常；已冻结；已注销；
     */
    public EpSystemUserStatus getStatus() {
        return (EpSystemUserStatus) get(7);
    }

    /**
     * Setter for <code>ep.ep_system_user.status</code>. 状态：正常；已冻结；已注销；
     */
    public EpSystemUserRecord setStatus(EpSystemUserStatus value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ep.ep_system_user.create_at</code>. 创建时间
     */
    public EpSystemUserRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ep.ep_system_user.update_at</code>. 更新时间
     */
    public EpSystemUserRecord setUpdateAt(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ep.ep_system_user.remark</code>. 备注
     */
    public EpSystemUserRecord setRemark(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_user.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ep.ep_system_user.del_flag</code>. 删除标记
     */
    public EpSystemUserRecord setDelFlag(Boolean value) {
        set(11, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ep.ep_system_user.version</code>.
     */
    public Long getVersion() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ep.ep_system_user.version</code>.
     */
    public EpSystemUserRecord setVersion(Long value) {
        set(12, value);
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
    public Row13<Long, Long, String, String, String, String, String, EpSystemUserStatus, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, String, String, String, String, EpSystemUserStatus, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpSystemUser.EP_SYSTEM_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpSystemUser.EP_SYSTEM_USER.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpSystemUser.EP_SYSTEM_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpSystemUser.EP_SYSTEM_USER.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EpSystemUser.EP_SYSTEM_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EpSystemUser.EP_SYSTEM_USER.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EpSystemUser.EP_SYSTEM_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpSystemUserStatus> field8() {
        return EpSystemUser.EP_SYSTEM_USER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EpSystemUser.EP_SYSTEM_USER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return EpSystemUser.EP_SYSTEM_USER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EpSystemUser.EP_SYSTEM_USER.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return EpSystemUser.EP_SYSTEM_USER.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return EpSystemUser.EP_SYSTEM_USER.VERSION;
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
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserStatus value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value2(Long value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value3(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value4(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value5(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value6(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value7(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value8(EpSystemUserStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value11(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord value12(Boolean value) {
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
    public EpSystemUserRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUserRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, EpSystemUserStatus value8, Timestamp value9, Timestamp value10, String value11, Boolean value12, Long value13) {
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
        return this;
    }
}
