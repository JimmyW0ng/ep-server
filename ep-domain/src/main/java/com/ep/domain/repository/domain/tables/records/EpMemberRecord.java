/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpMemberSex;
import com.ep.domain.repository.domain.enums.EpMemberStatus;
import com.ep.domain.repository.domain.enums.EpMemberType;
import com.ep.domain.repository.domain.tables.EpMember;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 会员信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpMemberRecord extends UpdatableRecordImpl<EpMemberRecord> implements Record13<Long, Long, String, String, EpMemberSex, String, EpMemberStatus, EpMemberType, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = 1993842369;

    /**
     * Setter for <code>ep.ep_member.id</code>. 主键
     */
    public EpMemberRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_member.mobile</code>. 手机号
     */
    public EpMemberRecord setMobile(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.mobile</code>. 手机号
     */
    public Long getMobile() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_member.nick_name</code>. 昵称
     */
    public EpMemberRecord setNickName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.nick_name</code>. 昵称
     */
    public String getNickName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_member.true_name</code>. 真实姓名
     */
    public EpMemberRecord setTrueName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.true_name</code>. 真实姓名
     */
    public String getTrueName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_member.sex</code>. 性别
     */
    public EpMemberRecord setSex(EpMemberSex value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.sex</code>. 性别
     */
    public EpMemberSex getSex() {
        return (EpMemberSex) get(4);
    }

    /**
     * Setter for <code>ep.ep_member.email</code>. 邮箱
     */
    public EpMemberRecord setEmail(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.email</code>. 邮箱
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ep.ep_member.status</code>. 状态：正常；已冻结；已注销；
     */
    public EpMemberRecord setStatus(EpMemberStatus value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.status</code>. 状态：正常；已冻结；已注销；
     */
    public EpMemberStatus getStatus() {
        return (EpMemberStatus) get(6);
    }

    /**
     * Setter for <code>ep.ep_member.type</code>. 类型：会员；机构账户
     */
    public EpMemberRecord setType(EpMemberType value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.type</code>. 类型：会员；机构账户
     */
    public EpMemberType getType() {
        return (EpMemberType) get(7);
    }

    /**
     * Setter for <code>ep.ep_member.create_at</code>. 创建时间
     */
    public EpMemberRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ep.ep_member.update_at</code>. 更新时间
     */
    public EpMemberRecord setUpdateAt(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ep.ep_member.remark</code>. 备注
     */
    public EpMemberRecord setRemark(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ep.ep_member.del_flag</code>. 删除标志
     */
    public EpMemberRecord setDelFlag(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ep.ep_member.version</code>.
     */
    public EpMemberRecord setVersion(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member.version</code>.
     */
    public Long getVersion() {
        return (Long) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, String, EpMemberSex, String, EpMemberStatus, EpMemberType, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, String, EpMemberSex, String, EpMemberStatus, EpMemberType, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpMember.EP_MEMBER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpMember.EP_MEMBER.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpMember.EP_MEMBER.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpMember.EP_MEMBER.TRUE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpMemberSex> field5() {
        return EpMember.EP_MEMBER.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EpMember.EP_MEMBER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpMemberStatus> field7() {
        return EpMember.EP_MEMBER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpMemberType> field8() {
        return EpMember.EP_MEMBER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EpMember.EP_MEMBER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return EpMember.EP_MEMBER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EpMember.EP_MEMBER.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return EpMember.EP_MEMBER.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return EpMember.EP_MEMBER.VERSION;
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
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTrueName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberSex value5() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberStatus value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberType value8() {
        return getType();
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
    public EpMemberRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value2(Long value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value3(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value4(String value) {
        setTrueName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value5(EpMemberSex value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value7(EpMemberStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value8(EpMemberType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value10(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value11(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value12(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberRecord values(Long value1, Long value2, String value3, String value4, EpMemberSex value5, String value6, EpMemberStatus value7, EpMemberType value8, Timestamp value9, Timestamp value10, String value11, Boolean value12, Long value13) {
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpMemberRecord
     */
    public EpMemberRecord() {
        super(EpMember.EP_MEMBER);
    }

    /**
     * Create a detached, initialised EpMemberRecord
     */
    public EpMemberRecord(Long id, Long mobile, String nickName, String trueName, EpMemberSex sex, String email, EpMemberStatus status, EpMemberType type, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpMember.EP_MEMBER);

        set(0, id);
        set(1, mobile);
        set(2, nickName);
        set(3, trueName);
        set(4, sex);
        set(5, email);
        set(6, status);
        set(7, type);
        set(8, createAt);
        set(9, updateAt);
        set(10, remark);
        set(11, delFlag);
        set(12, version);
    }
}
