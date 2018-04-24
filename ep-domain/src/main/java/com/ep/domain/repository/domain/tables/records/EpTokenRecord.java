/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpTokenType;
import com.ep.domain.repository.domain.tables.EpToken;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * token表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpTokenRecord extends UpdatableRecordImpl<EpTokenRecord> implements Record13<Long, Long, EpTokenType, String, String, Long, Timestamp, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -807913376;

    /**
     * Create a detached EpTokenRecord
     */
    public EpTokenRecord() {
        super(EpToken.EP_TOKEN);
    }

    /**
     * Create a detached, initialised EpTokenRecord
     */
    public EpTokenRecord(Long id, Long mobile, EpTokenType type, String role, String lastAccessIp, Long ognId, Timestamp expireTime, String code, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpToken.EP_TOKEN);

        set(0, id);
        set(1, mobile);
        set(2, type);
        set(3, role);
        set(4, lastAccessIp);
        set(5, ognId);
        set(6, expireTime);
        set(7, code);
        set(8, createAt);
        set(9, updateAt);
        set(10, remark);
        set(11, delFlag);
        set(12, version);
    }

    /**
     * Getter for <code>ep.ep_token.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_token.id</code>. 主键
     */
    public EpTokenRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.mobile</code>. 手机号
     */
    public Long getMobile() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_token.mobile</code>. 手机号
     */
    public EpTokenRecord setMobile(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.type</code>. 类型：会员；机构账户
     */
    public EpTokenType getType() {
        return (EpTokenType) get(2);
    }

    /**
     * Setter for <code>ep.ep_token.type</code>. 类型：会员；机构账户
     */
    public EpTokenRecord setType(EpTokenType value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.role</code>. 角色
     */
    public String getRole() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_token.role</code>. 角色
     */
    public EpTokenRecord setRole(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.last_access_ip</code>. 最近一次的访问ip
     */
    public String getLastAccessIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ep.ep_token.last_access_ip</code>. 最近一次的访问ip
     */
    public EpTokenRecord setLastAccessIp(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.ogn_id</code>. 机构id
     */
    public Long getOgnId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>ep.ep_token.ogn_id</code>. 机构id
     */
    public EpTokenRecord setOgnId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.expire_time</code>. 过期时间
     */
    public Timestamp getExpireTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ep.ep_token.expire_time</code>. 过期时间
     */
    public EpTokenRecord setExpireTime(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.code</code>. token串
     */
    public String getCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ep.ep_token.code</code>. token串
     */
    public EpTokenRecord setCode(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ep.ep_token.create_at</code>. 创建时间
     */
    public EpTokenRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ep.ep_token.update_at</code>. 更新时间
     */
    public EpTokenRecord setUpdateAt(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ep.ep_token.remark</code>. 备注
     */
    public EpTokenRecord setRemark(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_token.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ep.ep_token.del_flag</code>. 删除标记
     */
    public EpTokenRecord setDelFlag(Boolean value) {
        set(11, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ep.ep_token.version</code>.
     */
    public Long getVersion() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ep.ep_token.version</code>.
     */
    public EpTokenRecord setVersion(Long value) {
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
    public Row13<Long, Long, EpTokenType, String, String, Long, Timestamp, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, EpTokenType, String, String, Long, Timestamp, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpToken.EP_TOKEN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpToken.EP_TOKEN.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpTokenType> field3() {
        return EpToken.EP_TOKEN.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpToken.EP_TOKEN.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EpToken.EP_TOKEN.LAST_ACCESS_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return EpToken.EP_TOKEN.OGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EpToken.EP_TOKEN.EXPIRE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EpToken.EP_TOKEN.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EpToken.EP_TOKEN.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return EpToken.EP_TOKEN.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EpToken.EP_TOKEN.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return EpToken.EP_TOKEN.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return EpToken.EP_TOKEN.VERSION;
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
    public EpTokenType value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastAccessIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getOgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getExpireTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCode();
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
    public EpTokenRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value2(Long value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value3(EpTokenType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value4(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value5(String value) {
        setLastAccessIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value6(Long value) {
        setOgnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value7(Timestamp value) {
        setExpireTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value8(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value11(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord value12(Boolean value) {
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
    public EpTokenRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpTokenRecord values(Long value1, Long value2, EpTokenType value3, String value4, String value5, Long value6, Timestamp value7, String value8, Timestamp value9, Timestamp value10, String value11, Boolean value12, Long value13) {
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