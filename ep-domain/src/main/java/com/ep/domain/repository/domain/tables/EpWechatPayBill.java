/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.tables.records.EpWechatPayBillRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 微信支付对账表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpWechatPayBill extends TableImpl<EpWechatPayBillRecord> {

    /**
     * The reference instance of <code>ep.ep_wechat_pay_bill</code>
     */
    public static final EpWechatPayBill EP_WECHAT_PAY_BILL = new EpWechatPayBill();
    private static final long serialVersionUID = 207405567;
    /**
     * The column <code>ep.ep_wechat_pay_bill.id</code>. 主键
     */
    public final TableField<EpWechatPayBillRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_wechat_pay_bill.bill_date</code>. 对账日期
     */
    public final TableField<EpWechatPayBillRecord, Integer> BILL_DATE = createField("bill_date", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "对账日期");
    /**
     * The column <code>ep.ep_wechat_pay_bill.total_num</code>. 总交易单数
     */
    public final TableField<EpWechatPayBillRecord, Integer> TOTAL_NUM = createField("total_num", org.jooq.impl.SQLDataType.INTEGER, this, "总交易单数");
    /**
     * The column <code>ep.ep_wechat_pay_bill.total_amount</code>. 总交易额
     */
    public final TableField<EpWechatPayBillRecord, BigDecimal> TOTAL_AMOUNT = createField("total_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(14, 6), this, "总交易额");
    /**
     * The column <code>ep.ep_wechat_pay_bill.total_refund_amount</code>. 总退款金额
     */
    public final TableField<EpWechatPayBillRecord, BigDecimal> TOTAL_REFUND_AMOUNT = createField("total_refund_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(14, 6), this, "总退款金额");
    /**
     * The column <code>ep.ep_wechat_pay_bill.total_coupon_refund_amount</code>. 总代金券或立减优惠退款金额
     */
    public final TableField<EpWechatPayBillRecord, BigDecimal> TOTAL_COUPON_REFUND_AMOUNT = createField("total_coupon_refund_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(14, 6), this, "总代金券或立减优惠退款金额");
    /**
     * The column <code>ep.ep_wechat_pay_bill.total_poundage</code>. 总手续费
     */
    public final TableField<EpWechatPayBillRecord, BigDecimal> TOTAL_POUNDAGE = createField("total_poundage", org.jooq.impl.SQLDataType.DECIMAL.precision(14, 6), this, "总手续费");
    /**
     * The column <code>ep.ep_wechat_pay_bill.return_code</code>.
     */
    public final TableField<EpWechatPayBillRecord, String> RETURN_CODE = createField("return_code", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");
    /**
     * The column <code>ep.ep_wechat_pay_bill.return_msg</code>.
     */
    public final TableField<EpWechatPayBillRecord, String> RETURN_MSG = createField("return_msg", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");
    /**
     * The column <code>ep.ep_wechat_pay_bill.create_at</code>. 创建时间
     */
    public final TableField<EpWechatPayBillRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_wechat_pay_bill.update_at</code>. 更新时间
     */
    public final TableField<EpWechatPayBillRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_wechat_pay_bill.remark</code>. 备注
     */
    public final TableField<EpWechatPayBillRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");
    /**
     * The column <code>ep.ep_wechat_pay_bill.del_flag</code>. 删除标记
     */
    public final TableField<EpWechatPayBillRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");
    /**
     * The column <code>ep.ep_wechat_pay_bill.version</code>.
     */
    public final TableField<EpWechatPayBillRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_wechat_pay_bill</code> table reference
     */
    public EpWechatPayBill() {
        this("ep_wechat_pay_bill", null);
    }

    /**
     * Create an aliased <code>ep.ep_wechat_pay_bill</code> table reference
     */
    public EpWechatPayBill(String alias) {
        this(alias, EP_WECHAT_PAY_BILL);
    }

    private EpWechatPayBill(String alias, Table<EpWechatPayBillRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpWechatPayBill(String alias, Table<EpWechatPayBillRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "微信支付对账表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpWechatPayBillRecord> getRecordType() {
        return EpWechatPayBillRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ep.EP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EpWechatPayBillRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_WECHAT_PAY_BILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpWechatPayBillRecord> getPrimaryKey() {
        return Keys.KEY_EP_WECHAT_PAY_BILL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpWechatPayBillRecord>> getKeys() {
        return Arrays.<UniqueKey<EpWechatPayBillRecord>>asList(Keys.KEY_EP_WECHAT_PAY_BILL_PRIMARY, Keys.KEY_EP_WECHAT_PAY_BILL_UNIQUE_BILL_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpWechatPayBillRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatPayBill as(String alias) {
        return new EpWechatPayBill(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpWechatPayBill rename(String name) {
        return new EpWechatPayBill(name, null);
    }
}
