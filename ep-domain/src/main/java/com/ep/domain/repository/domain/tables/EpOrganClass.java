/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpOrganClassStatus;
import com.ep.domain.repository.domain.tables.records.EpOrganClassRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 机构课程班次表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrganClass extends TableImpl<EpOrganClassRecord> {

    /**
     * The reference instance of <code>ep.ep_organ_class</code>
     */
    public static final EpOrganClass EP_ORGAN_CLASS = new EpOrganClass();
    private static final long serialVersionUID = 861722222;
    /**
     * The column <code>ep.ep_organ_class.id</code>. 主键
     */
    public final TableField<EpOrganClassRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_organ_class.ogn_id</code>. 机构ID
     */
    public final TableField<EpOrganClassRecord, Long> OGN_ID = createField("ogn_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "机构ID");
    /**
     * The column <code>ep.ep_organ_class.course_id</code>. 课程ID
     */
    public final TableField<EpOrganClassRecord, Long> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "课程ID");
    /**
     * The column <code>ep.ep_organ_class.class_name</code>. 班次名称
     */
    public final TableField<EpOrganClassRecord, String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "班次名称");
    /**
     * The column <code>ep.ep_organ_class.ogn_account_id</code>. 课程负责人账户id
     */
    public final TableField<EpOrganClassRecord, Long> OGN_ACCOUNT_ID = createField("ogn_account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "课程负责人账户id");
    /**
     * The column <code>ep.ep_organ_class.class_prize</code>. 价格
     */
    public final TableField<EpOrganClassRecord, BigDecimal> CLASS_PRIZE = createField("class_prize", org.jooq.impl.SQLDataType.DECIMAL.precision(12, 2).nullable(false), this, "价格");
    /**
     * The column <code>ep.ep_organ_class.discount_amount</code>. 折扣优惠
     */
    public final TableField<EpOrganClassRecord, BigDecimal> DISCOUNT_AMOUNT = createField("discount_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(12, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "折扣优惠");
    /**
     * The column <code>ep.ep_organ_class.vip_flag</code>. 是否会员才能报名
     */
    public final TableField<EpOrganClassRecord, Boolean> VIP_FLAG = createField("vip_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否会员才能报名");
    /**
     * The column <code>ep.ep_organ_class.enter_limit_flag</code>. 是否限制报名人数
     */
    public final TableField<EpOrganClassRecord, Boolean> ENTER_LIMIT_FLAG = createField("enter_limit_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否限制报名人数");
    /**
     * The column <code>ep.ep_organ_class.enter_require_num</code>. 要求报名人数
     */
    public final TableField<EpOrganClassRecord, Integer> ENTER_REQUIRE_NUM = createField("enter_require_num", org.jooq.impl.SQLDataType.INTEGER, this, "要求报名人数");
    /**
     * The column <code>ep.ep_organ_class.ordered_num</code>. 下单人数
     */
    public final TableField<EpOrganClassRecord, Integer> ORDERED_NUM = createField("ordered_num", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "下单人数");
    /**
     * The column <code>ep.ep_organ_class.entered_num</code>. 已报名成功人数
     */
    public final TableField<EpOrganClassRecord, Integer> ENTERED_NUM = createField("entered_num", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "已报名成功人数");
    /**
     * The column <code>ep.ep_organ_class.course_num</code>. 总计课时
     */
    public final TableField<EpOrganClassRecord, Integer> COURSE_NUM = createField("course_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "总计课时");
    /**
     * The column <code>ep.ep_organ_class.sort</code>. 排序
     */
    public final TableField<EpOrganClassRecord, Long> SORT = createField("sort", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "排序");
    /**
     * The column <code>ep.ep_organ_class.status</code>. 状态：已保存；已上线；进行中；已下线；
     */
    public final TableField<EpOrganClassRecord, EpOrganClassStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpOrganClassStatus.class), this, "状态：已保存；已上线；进行中；已下线；");
    /**
     * The column <code>ep.ep_organ_class.remark</code>. 备注信息
     */
    public final TableField<EpOrganClassRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");
    /**
     * The column <code>ep.ep_organ_class.create_at</code>. 创建时间
     */
    public final TableField<EpOrganClassRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_organ_class.update_at</code>. 更新时间
     */
    public final TableField<EpOrganClassRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_organ_class.del_flag</code>. 删除标志
     */
    public final TableField<EpOrganClassRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");
    /**
     * The column <code>ep.ep_organ_class.version</code>.
     */
    public final TableField<EpOrganClassRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ_class</code> table reference
     */
    public EpOrganClass() {
        this("ep_organ_class", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ_class</code> table reference
     */
    public EpOrganClass(String alias) {
        this(alias, EP_ORGAN_CLASS);
    }

    private EpOrganClass(String alias, Table<EpOrganClassRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrganClass(String alias, Table<EpOrganClassRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构课程班次表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganClassRecord> getRecordType() {
        return EpOrganClassRecord.class;
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
    public Identity<EpOrganClassRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganClassRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_CLASS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganClassRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganClassRecord>>asList(Keys.KEY_EP_ORGAN_CLASS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganClassRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClass as(String alias) {
        return new EpOrganClass(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrganClass rename(String name) {
        return new EpOrganClass(name, null);
    }
}
