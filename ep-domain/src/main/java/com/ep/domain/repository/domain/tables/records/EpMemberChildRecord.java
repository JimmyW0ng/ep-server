/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpMemberChildChildSex;
import com.ep.domain.repository.domain.tables.EpMemberChild;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 孩子信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpMemberChildRecord extends UpdatableRecordImpl<EpMemberChildRecord> implements Record16<Long, Long, String, String, EpMemberChildChildSex, Timestamp, String, String, String, String, Timestamp, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -1316448510;

    /**
     * Create a detached EpMemberChildRecord
     */
    public EpMemberChildRecord() {
        super(EpMemberChild.EP_MEMBER_CHILD);
    }

    /**
     * Create a detached, initialised EpMemberChildRecord
     */
    public EpMemberChildRecord(Long id, Long memberId, String childNickName, String childTrueName, EpMemberChildChildSex childSex, Timestamp childBirthday, String childIdentity, String currentSchool, String currentClass, String relationship, Timestamp showAt, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpMemberChild.EP_MEMBER_CHILD);

        set(0, id);
        set(1, memberId);
        set(2, childNickName);
        set(3, childTrueName);
        set(4, childSex);
        set(5, childBirthday);
        set(6, childIdentity);
        set(7, currentSchool);
        set(8, currentClass);
        set(9, relationship);
        set(10, showAt);
        set(11, createAt);
        set(12, updateAt);
        set(13, remark);
        set(14, delFlag);
        set(15, version);
    }

    /**
     * Getter for <code>ep.ep_member_child.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_member_child.id</code>. 主键
     */
    public EpMemberChildRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.member_id</code>. 会员id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_member_child.member_id</code>. 会员id
     */
    public EpMemberChildRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.child_nick_name</code>. 昵称
     */
    public String getChildNickName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_member_child.child_nick_name</code>. 昵称
     */
    public EpMemberChildRecord setChildNickName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.child_true_name</code>. 真实姓名
     */
    public String getChildTrueName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_member_child.child_true_name</code>. 真实姓名
     */
    public EpMemberChildRecord setChildTrueName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.child_sex</code>. 性别
     */
    public EpMemberChildChildSex getChildSex() {
        return (EpMemberChildChildSex) get(4);
    }

    /**
     * Setter for <code>ep.ep_member_child.child_sex</code>. 性别
     */
    public EpMemberChildRecord setChildSex(EpMemberChildChildSex value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.child_birthday</code>. 生日
     */
    public Timestamp getChildBirthday() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ep.ep_member_child.child_birthday</code>. 生日
     */
    public EpMemberChildRecord setChildBirthday(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.child_identity</code>. 身份证号
     */
    public String getChildIdentity() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ep.ep_member_child.child_identity</code>. 身份证号
     */
    public EpMemberChildRecord setChildIdentity(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.current_school</code>. 当前就读学校
     */
    public String getCurrentSchool() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ep.ep_member_child.current_school</code>. 当前就读学校
     */
    public EpMemberChildRecord setCurrentSchool(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.current_class</code>. 所在班级
     */
    public String getCurrentClass() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ep.ep_member_child.current_class</code>. 所在班级
     */
    public EpMemberChildRecord setCurrentClass(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.relationship</code>. 关系
     */
    public String getRelationship() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ep.ep_member_child.relationship</code>. 关系
     */
    public EpMemberChildRecord setRelationship(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.show_at</code>. 展示时间
     */
    public Timestamp getShowAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ep.ep_member_child.show_at</code>. 展示时间
     */
    public EpMemberChildRecord setShowAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ep.ep_member_child.create_at</code>. 创建时间
     */
    public EpMemberChildRecord setCreateAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>ep.ep_member_child.update_at</code>. 更新时间
     */
    public EpMemberChildRecord setUpdateAt(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ep.ep_member_child.remark</code>. 备注
     */
    public EpMemberChildRecord setRemark(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>ep.ep_member_child.del_flag</code>. 删除标记
     */
    public EpMemberChildRecord setDelFlag(Boolean value) {
        set(14, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ep.ep_member_child.version</code>.
     */
    public Long getVersion() {
        return (Long) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ep.ep_member_child.version</code>.
     */
    public EpMemberChildRecord setVersion(Long value) {
        set(15, value);
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
    public Row16<Long, Long, String, String, EpMemberChildChildSex, Timestamp, String, String, String, String, Timestamp, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Long, String, String, EpMemberChildChildSex, Timestamp, String, String, String, String, Timestamp, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpMemberChild.EP_MEMBER_CHILD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpMemberChild.EP_MEMBER_CHILD.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpMemberChild.EP_MEMBER_CHILD.CHILD_NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpMemberChild.EP_MEMBER_CHILD.CHILD_TRUE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpMemberChildChildSex> field5() {
        return EpMemberChild.EP_MEMBER_CHILD.CHILD_SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return EpMemberChild.EP_MEMBER_CHILD.CHILD_BIRTHDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EpMemberChild.EP_MEMBER_CHILD.CHILD_IDENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EpMemberChild.EP_MEMBER_CHILD.CURRENT_SCHOOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EpMemberChild.EP_MEMBER_CHILD.CURRENT_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EpMemberChild.EP_MEMBER_CHILD.RELATIONSHIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return EpMemberChild.EP_MEMBER_CHILD.SHOW_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return EpMemberChild.EP_MEMBER_CHILD.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return EpMemberChild.EP_MEMBER_CHILD.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return EpMemberChild.EP_MEMBER_CHILD.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return EpMemberChild.EP_MEMBER_CHILD.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field16() {
        return EpMemberChild.EP_MEMBER_CHILD.VERSION;
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
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getChildNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getChildTrueName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildChildSex value5() {
        return getChildSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getChildBirthday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getChildIdentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCurrentSchool();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCurrentClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRelationship();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getShowAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value16() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value3(String value) {
        setChildNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value4(String value) {
        setChildTrueName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value5(EpMemberChildChildSex value) {
        setChildSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value6(Timestamp value) {
        setChildBirthday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value7(String value) {
        setChildIdentity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value8(String value) {
        setCurrentSchool(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value9(String value) {
        setCurrentClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value10(String value) {
        setRelationship(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value11(Timestamp value) {
        setShowAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value12(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value13(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value14(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord value15(Boolean value) {
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
    public EpMemberChildRecord value16(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildRecord values(Long value1, Long value2, String value3, String value4, EpMemberChildChildSex value5, Timestamp value6, String value7, String value8, String value9, String value10, Timestamp value11, Timestamp value12, Timestamp value13, String value14, Boolean value15, Long value16) {
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
        value16(value16);
        return this;
    }
}
