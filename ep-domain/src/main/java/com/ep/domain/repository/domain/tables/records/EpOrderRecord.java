/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpOrderStatus;
import com.ep.domain.repository.domain.tables.EpOrder;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrderRecord extends UpdatableRecordImpl<EpOrderRecord> implements Record15<Long, Long, Long, Long, Long, Long, BigDecimal, EpOrderStatus, Timestamp, Timestamp, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = 2050352968;

    /**
     * Setter for <code>ep.ep_order.id</code>. 主键
     */
    public EpOrderRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_order.member_id</code>. 会员id
     */
    public EpOrderRecord setMemberId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.member_id</code>. 会员id
     */
    public Long getMemberId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_order.child_id</code>. 孩子id
     */
    public EpOrderRecord setChildId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.child_id</code>. 孩子id
     */
    public Long getChildId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>ep.ep_order.ogn_id</code>. 机构id
     */
    public EpOrderRecord setOgnId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.ogn_id</code>. 机构id
     */
    public Long getOgnId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>ep.ep_order.course_id</code>. 课程id
     */
    public EpOrderRecord setCourseId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.course_id</code>. 课程id
     */
    public Long getCourseId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>ep.ep_order.class_id</code>. 班次id
     */
    public EpOrderRecord setClassId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Create a detached EpOrderRecord
     */
    public EpOrderRecord() {
        super(EpOrder.EP_ORDER);
    }

    /**
     * Setter for <code>ep.ep_order.prize</code>. 价格
     */
    public EpOrderRecord setPrize(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.prize</code>. 价格
     */
    public BigDecimal getPrize() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ep.ep_order.status</code>. 订单状态:保存；成功；已开班；结束；拒绝；取消；
     */
    public EpOrderRecord setStatus(EpOrderStatus value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.status</code>. 订单状态:保存；成功；已开班；结束；拒绝；取消；
     */
    public EpOrderStatus getStatus() {
        return (EpOrderStatus) get(7);
    }

    /**
     * Setter for <code>ep.ep_order.auth_time</code>. 机构审核订单时间
     */
    public EpOrderRecord setAuthTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.auth_time</code>. 机构审核订单时间
     */
    public Timestamp getAuthTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ep.ep_order.cancel_time</code>. 订单取消时间
     */
    public EpOrderRecord setCancelTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.cancel_time</code>. 订单取消时间
     */
    public Timestamp getCancelTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ep.ep_order.create_at</code>. 创建时间
     */
    public EpOrderRecord setCreateAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ep.ep_order.update_at</code>. 更新时间
     */
    public EpOrderRecord setUpdateAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Create a detached, initialised EpOrderRecord
     */
    public EpOrderRecord(Long id, Long memberId, Long childId, Long ognId, Long courseId, Long classId, BigDecimal prize, EpOrderStatus status, Timestamp authTime, Timestamp cancelTime, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpOrder.EP_ORDER);

        set(0, id);
        set(1, memberId);
        set(2, childId);
        set(3, ognId);
        set(4, courseId);
        set(5, classId);
        set(6, prize);
        set(7, status);
        set(8, authTime);
        set(9, cancelTime);
        set(10, createAt);
        set(11, updateAt);
        set(12, remark);
        set(13, delFlag);
        set(14, version);
    }

    /**
     * Getter for <code>ep.ep_order.class_id</code>. 班次id
     */
    public Long getClassId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>ep.ep_order.del_flag</code>. 删除标记
     */
    public EpOrderRecord setDelFlag(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(13);
    }

    /**
     * Getter for <code>ep.ep_order.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ep.ep_order.remark</code>. 备注
     */
    public EpOrderRecord setRemark(String value) {
        set(12, value);
        return this;
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ep.ep_order.version</code>.
     */
    public Long getVersion() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>ep.ep_order.version</code>.
     */
    public EpOrderRecord setVersion(Long value) {
        set(14, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpOrder.EP_ORDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpOrder.EP_ORDER.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EpOrder.EP_ORDER.CHILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return EpOrder.EP_ORDER.OGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return EpOrder.EP_ORDER.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return EpOrder.EP_ORDER.CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return EpOrder.EP_ORDER.PRIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpOrderStatus> field8() {
        return EpOrder.EP_ORDER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EpOrder.EP_ORDER.AUTH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return EpOrder.EP_ORDER.CANCEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return EpOrder.EP_ORDER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return EpOrder.EP_ORDER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return EpOrder.EP_ORDER.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, Long, Long, Long, Long, BigDecimal, EpOrderStatus, Timestamp, Timestamp, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Long, Long, Long, Long, Long, BigDecimal, EpOrderStatus, Timestamp, Timestamp, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row15) super.valuesRow();
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
    public Long value3() {
        return getChildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getOgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPrize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderStatus value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getAuthTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCancelTime();
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
    public Field<Boolean> field14() {
        return EpOrder.EP_ORDER.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return EpOrder.EP_ORDER.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value2(Long value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value3(Long value) {
        setChildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value4(Long value) {
        setOgnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value5(Long value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value6(Long value) {
        setClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value7(BigDecimal value) {
        setPrize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value8(EpOrderStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value9(Timestamp value) {
        setAuthTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value10(Timestamp value) {
        setCancelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value11(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value12(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value13(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value14(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value15(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Long value6, BigDecimal value7, EpOrderStatus value8, Timestamp value9, Timestamp value10, Timestamp value11, Timestamp value12, String value13, Boolean value14, Long value15) {
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

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
}
