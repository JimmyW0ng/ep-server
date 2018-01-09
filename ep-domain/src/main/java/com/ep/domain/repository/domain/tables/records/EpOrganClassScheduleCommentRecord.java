/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpOrganClassScheduleCommentCommentType;
import com.ep.domain.repository.domain.tables.EpOrganClassScheduleComment;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 机构行程评论表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpOrganClassScheduleCommentRecord extends UpdatableRecordImpl<EpOrganClassScheduleCommentRecord> implements Record12<Long, Long, Long, EpOrganClassScheduleCommentCommentType, String, Long, Long, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = 645418215;

    /**
     * Create a detached EpOrganClassScheduleCommentRecord
     */
    public EpOrganClassScheduleCommentRecord() {
        super(EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT);
    }

    /**
     * Create a detached, initialised EpOrganClassScheduleCommentRecord
     */
    public EpOrganClassScheduleCommentRecord(Long id, Long pId, Long classScheduleId, EpOrganClassScheduleCommentCommentType commentType, String content, Long launchMemberId, Long replyMemberId, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT);

        set(0, id);
        set(1, pId);
        set(2, classScheduleId);
        set(3, commentType);
        set(4, content);
        set(5, launchMemberId);
        set(6, replyMemberId);
        set(7, createAt);
        set(8, updateAt);
        set(9, remark);
        set(10, delFlag);
        set(11, version);
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.id</code>. 主键
     */
    public EpOrganClassScheduleCommentRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.p_id</code>. 父级id（发起评论没有父级id，回复评论存放被回复的评论记录id）
     */
    public Long getPId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.p_id</code>. 父级id（发起评论没有父级id，回复评论存放被回复的评论记录id）
     */
    public EpOrganClassScheduleCommentRecord setPId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.class_schedule_id</code>. 行程id
     */
    public Long getClassScheduleId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.class_schedule_id</code>. 行程id
     */
    public EpOrganClassScheduleCommentRecord setClassScheduleId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.comment_type</code>. 评论类型: 评论；回复
     */
    public EpOrganClassScheduleCommentCommentType getCommentType() {
        return (EpOrganClassScheduleCommentCommentType) get(3);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.comment_type</code>. 评论类型: 评论；回复
     */
    public EpOrganClassScheduleCommentRecord setCommentType(EpOrganClassScheduleCommentCommentType value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.content</code>. 评论内容
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.content</code>. 评论内容
     */
    public EpOrganClassScheduleCommentRecord setContent(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.launch_member_id</code>. 发起评论者id
     */
    public Long getLaunchMemberId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.launch_member_id</code>. 发起评论者id
     */
    public EpOrganClassScheduleCommentRecord setLaunchMemberId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.reply_member_id</code>. 回复评论者id
     */
    public Long getReplyMemberId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.reply_member_id</code>. 回复评论者id
     */
    public EpOrganClassScheduleCommentRecord setReplyMemberId(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.create_at</code>. 创建时间
     */
    public EpOrganClassScheduleCommentRecord setCreateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.update_at</code>. 更新时间
     */
    public EpOrganClassScheduleCommentRecord setUpdateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.remark</code>. 备注
     */
    public EpOrganClassScheduleCommentRecord setRemark(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.del_flag</code>. 删除标记
     */
    public EpOrganClassScheduleCommentRecord setDelFlag(Boolean value) {
        set(10, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ep.ep_organ_class_schedule_comment.version</code>.
     */
    public Long getVersion() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ep.ep_organ_class_schedule_comment.version</code>.
     */
    public EpOrganClassScheduleCommentRecord setVersion(Long value) {
        set(11, value);
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
    public Row12<Long, Long, Long, EpOrganClassScheduleCommentCommentType, String, Long, Long, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, Long, EpOrganClassScheduleCommentCommentType, String, Long, Long, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.P_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.CLASS_SCHEDULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpOrganClassScheduleCommentCommentType> field4() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.COMMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.LAUNCH_MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.REPLY_MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return EpOrganClassScheduleComment.EP_ORGAN_CLASS_SCHEDULE_COMMENT.VERSION;
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
        return getPId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getClassScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentCommentType value4() {
        return getCommentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getLaunchMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getReplyMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value2(Long value) {
        setPId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value3(Long value) {
        setClassScheduleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value4(EpOrganClassScheduleCommentCommentType value) {
        setCommentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value6(Long value) {
        setLaunchMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value7(Long value) {
        setReplyMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value8(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value9(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value10(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord value11(Boolean value) {
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
    public EpOrganClassScheduleCommentRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleCommentRecord values(Long value1, Long value2, Long value3, EpOrganClassScheduleCommentCommentType value4, String value5, Long value6, Long value7, Timestamp value8, Timestamp value9, String value10, Boolean value11, Long value12) {
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
        return this;
    }
}