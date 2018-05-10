/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpOrderPayStatus;
import com.ep.domain.repository.domain.enums.EpOrderPayType;
import com.ep.domain.repository.domain.enums.EpOrderStatus;
import com.ep.domain.repository.domain.tables.EpOrder;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class EpOrderRecord extends UpdatableRecordImpl<EpOrderRecord> implements Record18<Long, Long, Long, Long, Long, Long, BigDecimal, EpOrderStatus, EpOrderPayType, EpOrderPayStatus, Timestamp, Timestamp, BigDecimal, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -204073224;

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
     * Getter for <code>ep.ep_order.class_id</code>. 班次id
     */
    public Long getClassId() {
        return (Long) get(5);
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
     * Setter for <code>ep.ep_order.status</code>. 订单状态：保存；成功；已开班；结束；拒绝；取消；
     */
    public EpOrderRecord setStatus(EpOrderStatus value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.status</code>. 订单状态：保存；成功；已开班；结束；拒绝；取消；
     */
    public EpOrderStatus getStatus() {
        return (EpOrderStatus) get(7);
    }

    /**
     * Setter for <code>ep.ep_order.pay_type</code>. 支付类型
     */
    public EpOrderRecord setPayType(EpOrderPayType value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.pay_type</code>. 支付类型
     */
    public EpOrderPayType getPayType() {
        return (EpOrderPayType) get(8);
    }

    /**
     * Setter for <code>ep.ep_order.pay_status</code>. 支付状态：已支付；退款申请中；退款完成；
     */
    public EpOrderRecord setPayStatus(EpOrderPayStatus value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.pay_status</code>. 支付状态：已支付；退款申请中；退款完成；
     */
    public EpOrderPayStatus getPayStatus() {
        return (EpOrderPayStatus) get(9);
    }

    /**
     * Setter for <code>ep.ep_order.auth_time</code>. 机构审核订单时间
     */
    public EpOrderRecord setAuthTime(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.auth_time</code>. 机构审核订单时间
     */
    public Timestamp getAuthTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ep.ep_order.cancel_time</code>. 订单取消时间
     */
    public EpOrderRecord setCancelTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.cancel_time</code>. 订单取消时间
     */
    public Timestamp getCancelTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ep.ep_order.refund_amount</code>. 退款金额
     */
    public EpOrderRecord setRefundAmount(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.refund_amount</code>. 退款金额
     */
    public BigDecimal getRefundAmount() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>ep.ep_order.create_at</code>. 创建时间
     */
    public EpOrderRecord setCreateAt(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>ep.ep_order.update_at</code>. 更新时间
     */
    public EpOrderRecord setUpdateAt(Timestamp value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>ep.ep_order.remark</code>. 备注
     */
    public EpOrderRecord setRemark(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ep.ep_order.del_flag</code>. 删除标记
     */
    public EpOrderRecord setDelFlag(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>ep.ep_order.version</code>.
     */
    public EpOrderRecord setVersion(Long value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_order.version</code>.
     */
    public Long getVersion() {
        return (Long) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, Long, Long, Long, Long, BigDecimal, EpOrderStatus, EpOrderPayType, EpOrderPayStatus, Timestamp, Timestamp, BigDecimal, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, Long, Long, Long, Long, Long, BigDecimal, EpOrderStatus, EpOrderPayType, EpOrderPayStatus, Timestamp, Timestamp, BigDecimal, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row18) super.valuesRow();
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
    public Field<EpOrderPayType> field9() {
        return EpOrder.EP_ORDER.PAY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpOrderPayStatus> field10() {
        return EpOrder.EP_ORDER.PAY_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return EpOrder.EP_ORDER.AUTH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return EpOrder.EP_ORDER.CANCEL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return EpOrder.EP_ORDER.REFUND_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return EpOrder.EP_ORDER.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return EpOrder.EP_ORDER.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return EpOrder.EP_ORDER.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return EpOrder.EP_ORDER.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field18() {
        return EpOrder.EP_ORDER.VERSION;
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
    public EpOrderPayType value9() {
        return getPayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderPayStatus value10() {
        return getPayStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getAuthTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCancelTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getRefundAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value18() {
        return getVersion();
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
    public EpOrderRecord value9(EpOrderPayType value) {
        setPayType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value10(EpOrderPayStatus value) {
        setPayStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value11(Timestamp value) {
        setAuthTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value12(Timestamp value) {
        setCancelTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value13(BigDecimal value) {
        setRefundAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value14(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value15(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value16(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value17(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord value18(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrderRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Long value6, BigDecimal value7, EpOrderStatus value8, EpOrderPayType value9, EpOrderPayStatus value10, Timestamp value11, Timestamp value12, BigDecimal value13, Timestamp value14, Timestamp value15, String value16, Boolean value17, Long value18) {
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
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpOrderRecord
     */
    public EpOrderRecord() {
        super(EpOrder.EP_ORDER);
    }

    /**
     * Create a detached, initialised EpOrderRecord
     */
    public EpOrderRecord(Long id, Long memberId, Long childId, Long ognId, Long courseId, Long classId, BigDecimal prize, EpOrderStatus status, EpOrderPayType payType, EpOrderPayStatus payStatus, Timestamp authTime, Timestamp cancelTime, BigDecimal refundAmount, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpOrder.EP_ORDER);

        set(0, id);
        set(1, memberId);
        set(2, childId);
        set(3, ognId);
        set(4, courseId);
        set(5, classId);
        set(6, prize);
        set(7, status);
        set(8, payType);
        set(9, payStatus);
        set(10, authTime);
        set(11, cancelTime);
        set(12, refundAmount);
        set(13, createAt);
        set(14, updateAt);
        set(15, remark);
        set(16, delFlag);
        set(17, version);
    }
}
