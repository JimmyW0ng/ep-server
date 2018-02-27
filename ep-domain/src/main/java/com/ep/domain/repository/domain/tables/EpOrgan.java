/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpOrganStatus;
import com.ep.domain.repository.domain.tables.records.EpOrganRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DateAsTimestampBinding;
import org.jooq.impl.TableImpl;


/**
 * 机构信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrgan extends TableImpl<EpOrganRecord> {

    private static final long serialVersionUID = 1304988305;

    /**
     * The reference instance of <code>ep.ep_organ</code>
     */
    public static final EpOrgan EP_ORGAN = new EpOrgan();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganRecord> getRecordType() {
        return EpOrganRecord.class;
    }

    /**
     * The column <code>ep.ep_organ.id</code>. 主键
     */
    public final TableField<EpOrganRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>ep.ep_organ.ogn_name</code>. 机构名称
     */
    public final TableField<EpOrganRecord, String> OGN_NAME = createField("ogn_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "机构名称");

    /**
     * The column <code>ep.ep_organ.ogn_address</code>. 机构地址
     */
    public final TableField<EpOrganRecord, String> OGN_ADDRESS = createField("ogn_address", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "机构地址");

    /**
     * The column <code>ep.ep_organ.ogn_region</code>. 机构地区
     */
    public final TableField<EpOrganRecord, Long> OGN_REGION = createField("ogn_region", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "机构地区");

    /**
     * The column <code>ep.ep_organ.ogn_lng</code>. 地区经度
     */
    public final TableField<EpOrganRecord, String> OGN_LNG = createField("ogn_lng", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "地区经度");

    /**
     * The column <code>ep.ep_organ.ogn_lat</code>. 地区纬度
     */
    public final TableField<EpOrganRecord, String> OGN_LAT = createField("ogn_lat", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "地区纬度");

    /**
     * The column <code>ep.ep_organ.ogn_short_introduce</code>. 机构简介
     */
    public final TableField<EpOrganRecord, String> OGN_SHORT_INTRODUCE = createField("ogn_short_introduce", org.jooq.impl.SQLDataType.CLOB, this, "机构简介");

    /**
     * The column <code>ep.ep_organ.ogn_create_date</code>. 机构成立日期
     */
    public final TableField<EpOrganRecord, Timestamp> OGN_CREATE_DATE = createField("ogn_create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "机构成立日期", new DateAsTimestampBinding());

    /**
     * The column <code>ep.ep_organ.ogn_phone</code>. 机构官方电话
     */
    public final TableField<EpOrganRecord, String> OGN_PHONE = createField("ogn_phone", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "机构官方电话");

    /**
     * The column <code>ep.ep_organ.ogn_email</code>. 机构官方邮箱
     */
    public final TableField<EpOrganRecord, String> OGN_EMAIL = createField("ogn_email", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "机构官方邮箱");

    /**
     * The column <code>ep.ep_organ.ogn_url</code>. 机构官方网址
     */
    public final TableField<EpOrganRecord, String> OGN_URL = createField("ogn_url", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "机构官方网址");

    /**
     * The column <code>ep.ep_organ.ogn_introduce</code>. 机构简介
     */
    public final TableField<EpOrganRecord, String> OGN_INTRODUCE = createField("ogn_introduce", org.jooq.impl.SQLDataType.CLOB, this, "机构简介");

    /**
     * The column <code>ep.ep_organ.market_weight</code>. 营销权重
     */
    public final TableField<EpOrganRecord, Byte> MARKET_WEIGHT = createField("market_weight", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "营销权重");

    /**
     * The column <code>ep.ep_organ.together_score</code>. 综合得分
     */
    public final TableField<EpOrganRecord, Byte> TOGETHER_SCORE = createField("together_score", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "综合得分");

    /**
     * The column <code>ep.ep_organ.total_participate</code>. 总参与人数
     */
    public final TableField<EpOrganRecord, Integer> TOTAL_PARTICIPATE = createField("total_participate", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "总参与人数");

    /**
     * The column <code>ep.ep_organ.status</code>. 状态：正常；已冻结；已注销；
     */
    public final TableField<EpOrganRecord, EpOrganStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpOrganStatus.class), this, "状态：正常；已冻结；已注销；");

    /**
     * The column <code>ep.ep_organ.remark</code>. 备注信息
     */
    public final TableField<EpOrganRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");

    /**
     * The column <code>ep.ep_organ.create_at</code>. 创建时间
     */
    public final TableField<EpOrganRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_organ.update_at</code>. 更新时间
     */
    public final TableField<EpOrganRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_organ.del_flag</code>. 删除标志
     */
    public final TableField<EpOrganRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>ep.ep_organ.version</code>.
     */
    public final TableField<EpOrganRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ</code> table reference
     */
    public EpOrgan() {
        this("ep_organ", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ</code> table reference
     */
    public EpOrgan(String alias) {
        this(alias, EP_ORGAN);
    }

    private EpOrgan(String alias, Table<EpOrganRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrgan(String alias, Table<EpOrganRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构信息表");
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
    public Identity<EpOrganRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganRecord>>asList(Keys.KEY_EP_ORGAN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrgan as(String alias) {
        return new EpOrgan(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrgan rename(String name) {
        return new EpOrgan(name, null);
    }
}
