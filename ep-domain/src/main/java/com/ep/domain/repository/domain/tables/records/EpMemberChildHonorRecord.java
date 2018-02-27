/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.tables.EpMemberChildHonor;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 孩子荣誉表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpMemberChildHonorRecord extends UpdatableRecordImpl<EpMemberChildHonorRecord> implements Record11<Long, Long, Long, Long, Long, String, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -1665643310;

    /**
     * Setter for <code>ep.ep_member_child_honor.id</code>. 主键
     */
    public EpMemberChildHonorRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.child_id</code>. 孩子id
     */
    public EpMemberChildHonorRecord setChildId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.child_id</code>. 孩子id
     */
    public Long getChildId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.ogn_id</code>. 机构_id
     */
    public EpMemberChildHonorRecord setOgnId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.ogn_id</code>. 机构_id
     */
    public Long getOgnId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.course_id</code>. 课程id
     */
    public EpMemberChildHonorRecord setCourseId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.course_id</code>. 课程id
     */
    public Long getCourseId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.class_id</code>. 班级id
     */
    public EpMemberChildHonorRecord setClassId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.class_id</code>. 班级id
     */
    public Long getClassId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.content</code>. 荣誉内容
     */
    public EpMemberChildHonorRecord setContent(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.content</code>. 荣誉内容
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.create_at</code>. 创建时间
     */
    public EpMemberChildHonorRecord setCreateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.update_at</code>. 更新时间
     */
    public EpMemberChildHonorRecord setUpdateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.remark</code>. 备注
     */
    public EpMemberChildHonorRecord setRemark(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.del_flag</code>. 删除标记
     */
    public EpMemberChildHonorRecord setDelFlag(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>ep.ep_member_child_honor.version</code>.
     */
    public EpMemberChildHonorRecord setVersion(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_member_child_honor.version</code>.
     */
    public Long getVersion() {
        return (Long) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, Long, Long, Long, String, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, Long, Long, Long, String, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.CHILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.OGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.VERSION;
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
        return getChildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getOgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value2(Long value) {
        setChildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value3(Long value) {
        setOgnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value4(Long value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value5(Long value) {
        setClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value6(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value7(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value8(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value10(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord value11(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildHonorRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, String value6, Timestamp value7, Timestamp value8, String value9, Boolean value10, Long value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpMemberChildHonorRecord
     */
    public EpMemberChildHonorRecord() {
        super(EpMemberChildHonor.EP_MEMBER_CHILD_HONOR);
    }

    /**
     * Create a detached, initialised EpMemberChildHonorRecord
     */
    public EpMemberChildHonorRecord(Long id, Long childId, Long ognId, Long courseId, Long classId, String content, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpMemberChildHonor.EP_MEMBER_CHILD_HONOR);

        set(0, id);
        set(1, childId);
        set(2, ognId);
        set(3, courseId);
        set(4, classId);
        set(5, content);
        set(6, createAt);
        set(7, updateAt);
        set(8, remark);
        set(9, delFlag);
        set(10, version);
    }
}
