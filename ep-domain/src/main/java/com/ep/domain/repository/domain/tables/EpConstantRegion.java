/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpConstantRegionRegionType;
import com.ep.domain.repository.domain.tables.records.EpConstantRegionRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 地区表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpConstantRegion extends TableImpl<EpConstantRegionRecord> {

    /**
     * The reference instance of <code>ep.ep_constant_region</code>
     */
    public static final EpConstantRegion EP_CONSTANT_REGION = new EpConstantRegion();
    private static final long serialVersionUID = 1007135097;
    /**
     * The column <code>ep.ep_constant_region.id</code>. 主键
     */
    public final TableField<EpConstantRegionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_constant_region.region_name</code>. 地区名称
     */
    public final TableField<EpConstantRegionRecord, String> REGION_NAME = createField("region_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "地区名称");
    /**
     * The column <code>ep.ep_constant_region.parent_id</code>. 父级id
     */
    public final TableField<EpConstantRegionRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "父级id");
    /**
     * The column <code>ep.ep_constant_region.short_name</code>. 简称
     */
    public final TableField<EpConstantRegionRecord, String> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "简称");
    /**
     * The column <code>ep.ep_constant_region.region_type</code>. 类型：国；省；市；区
     */
    public final TableField<EpConstantRegionRecord, EpConstantRegionRegionType> REGION_TYPE = createField("region_type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpConstantRegionRegionType.class), this, "类型：国；省；市；区");
    /**
     * The column <code>ep.ep_constant_region.city_code</code>. 地区编码
     */
    public final TableField<EpConstantRegionRecord, String> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "地区编码");
    /**
     * The column <code>ep.ep_constant_region.zip_code</code>. 邮政编码
     */
    public final TableField<EpConstantRegionRecord, String> ZIP_CODE = createField("zip_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "邮政编码");
    /**
     * The column <code>ep.ep_constant_region.merger_name</code>. 全称
     */
    public final TableField<EpConstantRegionRecord, String> MERGER_NAME = createField("merger_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "全称");
    /**
     * The column <code>ep.ep_constant_region.region_lng</code>. 经度
     */
    public final TableField<EpConstantRegionRecord, String> REGION_LNG = createField("region_lng", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "经度");
    /**
     * The column <code>ep.ep_constant_region.region_lat</code>. 维度
     */
    public final TableField<EpConstantRegionRecord, String> REGION_LAT = createField("region_lat", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "维度");
    /**
     * The column <code>ep.ep_constant_region.pin_yin</code>. 拼音
     */
    public final TableField<EpConstantRegionRecord, String> PIN_YIN = createField("pin_yin", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "拼音");
    /**
     * The column <code>ep.ep_constant_region.create_at</code>. 创建时间
     */
    public final TableField<EpConstantRegionRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_constant_region.update_at</code>. 更新时间
     */
    public final TableField<EpConstantRegionRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_constant_region.remark</code>. 备注
     */
    public final TableField<EpConstantRegionRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");
    /**
     * The column <code>ep.ep_constant_region.del_flag</code>. 删除标记
     */
    public final TableField<EpConstantRegionRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");
    /**
     * The column <code>ep.ep_constant_region.version</code>.
     */
    public final TableField<EpConstantRegionRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_constant_region</code> table reference
     */
    public EpConstantRegion() {
        this("ep_constant_region", null);
    }

    /**
     * Create an aliased <code>ep.ep_constant_region</code> table reference
     */
    public EpConstantRegion(String alias) {
        this(alias, EP_CONSTANT_REGION);
    }

    private EpConstantRegion(String alias, Table<EpConstantRegionRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpConstantRegion(String alias, Table<EpConstantRegionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "地区表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpConstantRegionRecord> getRecordType() {
        return EpConstantRegionRecord.class;
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
    public Identity<EpConstantRegionRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_CONSTANT_REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpConstantRegionRecord> getPrimaryKey() {
        return Keys.KEY_EP_CONSTANT_REGION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpConstantRegionRecord>> getKeys() {
        return Arrays.<UniqueKey<EpConstantRegionRecord>>asList(Keys.KEY_EP_CONSTANT_REGION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpConstantRegionRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpConstantRegion as(String alias) {
        return new EpConstantRegion(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpConstantRegion rename(String name) {
        return new EpConstantRegion(name, null);
    }
}
