/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpOrganClassScheduleScheduleStatus;
import com.ep.domain.repository.domain.tables.EpOrganClassSchedule;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 机构行程信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrganClassScheduleRecord extends UpdatableRecordImpl<EpOrganClassScheduleRecord> implements Record10<Long, Long, Long, Long, EpOrganClassScheduleScheduleStatus, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -233678347;

    /**
     * Setter for <code>ep.ep_organ_class_schedule.id</code>. 主键
     */
    public EpOrganClassScheduleRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.class_id</code>. 班级id
     */
    public EpOrganClassScheduleRecord setClassId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.class_id</code>. 班级id
     */
    public Long getClassId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.class_catelog_id</code>. 班次课程内容目录id
     */
    public EpOrganClassScheduleRecord setClassCatelogId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.class_catelog_id</code>. 班次课程内容目录id
     */
    public Long getClassCatelogId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.child_id</code>. 孩子id
     */
    public EpOrganClassScheduleRecord setChildId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.child_id</code>. 孩子id
     */
    public Long getChildId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.schedule_status</code>. 行程状态：带开课；正常；迟到；缺席；请假
     */
    public EpOrganClassScheduleRecord setScheduleStatus(EpOrganClassScheduleScheduleStatus value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.schedule_status</code>. 行程状态：带开课；正常；迟到；缺席；请假
     */
    public EpOrganClassScheduleScheduleStatus getScheduleStatus() {
        return (EpOrganClassScheduleScheduleStatus) get(4);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.create_at</code>. 创建时间
     */
    public EpOrganClassScheduleRecord setCreateAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.update_at</code>. 更新时间
     */
    public EpOrganClassScheduleRecord setUpdateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.remark</code>. 备注
     */
    public EpOrganClassScheduleRecord setRemark(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.del_flag</code>. 删除标记
     */
    public EpOrganClassScheduleRecord setDelFlag(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule.version</code>.
     */
    public EpOrganClassScheduleRecord setVersion(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule.version</code>.
     */
    public Long getVersion() {
        return (Long) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Long, EpOrganClassScheduleScheduleStatus, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, Long, EpOrganClassScheduleScheduleStatus, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.CLASS_CATELOG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.CHILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpOrganClassScheduleScheduleStatus> field5() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.SCHEDULE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.VERSION;
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
        return getClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getClassCatelogId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getChildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleScheduleStatus value5() {
        return getScheduleStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value2(Long value) {
        setClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value3(Long value) {
        setClassCatelogId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value4(Long value) {
        setChildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value5(EpOrganClassScheduleScheduleStatus value) {
        setScheduleStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value6(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value7(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value8(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value9(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord value10(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleRecord values(Long value1, Long value2, Long value3, Long value4, EpOrganClassScheduleScheduleStatus value5, Timestamp value6, Timestamp value7, String value8, Boolean value9, Long value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpOrganClassScheduleRecord
     */
    public EpOrganClassScheduleRecord() {
        super(EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE);
    }

    /**
     * Create a detached, initialised EpOrganClassScheduleRecord
     */
    public EpOrganClassScheduleRecord(Long id, Long classId, Long classCatelogId, Long childId, EpOrganClassScheduleScheduleStatus scheduleStatus, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE);

        set(0, id);
        set(1, classId);
        set(2, classCatelogId);
        set(3, childId);
        set(4, scheduleStatus);
        set(5, createAt);
        set(6, updateAt);
        set(7, remark);
        set(8, delFlag);
        set(9, version);
    }
}
