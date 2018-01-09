/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpOrderStatus;
import com.ep.domain.repository.domain.tables.records.EpOrderRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpOrder extends TableImpl<EpOrderRecord> {

    /**
     * The reference instance of <code>ep.ep_order</code>
     */
    public static final EpOrder EP_ORDER = new EpOrder();
    private static final long serialVersionUID = 202975742;
    /**
     * The column <code>ep.ep_order.id</code>. 主键
     */
    public final TableField<EpOrderRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_order.member_id</code>. 会员id
     */
    public final TableField<EpOrderRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "会员id");
    /**
     * The column <code>ep.ep_order.child_id</code>. 孩子id
     */
    public final TableField<EpOrderRecord, Long> CHILD_ID = createField("child_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "孩子id");
    /**
     * The column <code>ep.ep_order.ogn_id</code>. 机构id
     */
    public final TableField<EpOrderRecord, Long> OGN_ID = createField("ogn_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "机构id");
    /**
     * The column <code>ep.ep_order.course_id</code>. 课程id
     */
    public final TableField<EpOrderRecord, Long> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "课程id");
    /**
     * The column <code>ep.ep_order.sku_id</code>. sku.id
     */
    public final TableField<EpOrderRecord, Long> SKU_ID = createField("sku_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "sku.id");
    /**
     * The column <code>ep.ep_order.status</code>. 订单状态:保存；成功；拒绝；取消；
     */
    public final TableField<EpOrderRecord, EpOrderStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpOrderStatus.class), this, "订单状态:保存；成功；拒绝；取消；");
    /**
     * The column <code>ep.ep_order.auth_time</code>. 机构审核订单时间
     */
    public final TableField<EpOrderRecord, Timestamp> AUTH_TIME = createField("auth_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "机构审核订单时间");
    /**
     * The column <code>ep.ep_order.cancel_time</code>. 订单取消时间
     */
    public final TableField<EpOrderRecord, Timestamp> CANCEL_TIME = createField("cancel_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "订单取消时间");
    /**
     * The column <code>ep.ep_order.child_version</code>. 孩子信息版本号
     */
    public final TableField<EpOrderRecord, Long> CHILD_VERSION = createField("child_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "孩子信息版本号");
    /**
     * The column <code>ep.ep_order.create_at</code>. 创建时间
     */
    public final TableField<EpOrderRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_order.update_at</code>. 更新时间
     */
    public final TableField<EpOrderRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_order.remark</code>. 备注
     */
    public final TableField<EpOrderRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");
    /**
     * The column <code>ep.ep_order.del_flag</code>. 删除标记
     */
    public final TableField<EpOrderRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");
    /**
     * The column <code>ep.ep_order.version</code>.
     */
    public final TableField<EpOrderRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_order</code> table reference
     */
    public EpOrder() {
        this("ep_order", null);
    }

    /**
     * Create an aliased <code>ep.ep_order</code> table reference
     */
    public EpOrder(String alias) {
        this(alias, EP_ORDER);
    }

    private EpOrder(String alias, Table<EpOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrder(String alias, Table<EpOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "订单表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrderRecord> getRecordType() {
        return EpOrderRecord.class;
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
    public Identity<EpOrderRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrderRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrderRecord>>asList(Keys.KEY_EP_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrderRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrder as(String alias) {
        return new EpOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrder rename(String name) {
        return new EpOrder(name, null);
    }
}
