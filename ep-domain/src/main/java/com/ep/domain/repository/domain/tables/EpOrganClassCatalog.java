/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.tables.records.EpOrganClassCatalogRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 班次课程内容目录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrganClassCatalog extends TableImpl<EpOrganClassCatalogRecord> {

    /**
     * The reference instance of <code>ep.ep_organ_class_catalog</code>
     */
    public static final EpOrganClassCatalog EP_ORGAN_CLASS_CATALOG = new EpOrganClassCatalog();
    private static final long serialVersionUID = 597074996;
    /**
     * The column <code>ep.ep_organ_class_catalog.id</code>. 主键
     */
    public final TableField<EpOrganClassCatalogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_organ_class_catalog.class_id</code>. 班次id
     */
    public final TableField<EpOrganClassCatalogRecord, Long> CLASS_ID = createField("class_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "班次id");
    /**
     * The column <code>ep.ep_organ_class_catalog.catalog_title</code>. 目录标题
     */
    public final TableField<EpOrganClassCatalogRecord, String> CATALOG_TITLE = createField("catalog_title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "目录标题");
    /**
     * The column <code>ep.ep_organ_class_catalog.catalog_desc</code>. 目录描述
     */
    public final TableField<EpOrganClassCatalogRecord, String> CATALOG_DESC = createField("catalog_desc", org.jooq.impl.SQLDataType.VARCHAR.length(3000), this, "目录描述");
    /**
     * The column <code>ep.ep_organ_class_catalog.catalog_index</code>. 目录索引（第几个课时）
     */
    public final TableField<EpOrganClassCatalogRecord, Integer> CATALOG_INDEX = createField("catalog_index", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "目录索引（第几个课时）");
    /**
     * The column <code>ep.ep_organ_class_catalog.start_time</code>. 开始时间
     */
    public final TableField<EpOrganClassCatalogRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开始时间");
    /**
     * The column <code>ep.ep_organ_class_catalog.duration</code>. 持续时长
     */
    public final TableField<EpOrganClassCatalogRecord, Integer> DURATION = createField("duration", org.jooq.impl.SQLDataType.INTEGER, this, "持续时长");
    /**
     * The column <code>ep.ep_organ_class_catalog.remark</code>. 备注信息
     */
    public final TableField<EpOrganClassCatalogRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");
    /**
     * The column <code>ep.ep_organ_class_catalog.create_at</code>. 创建时间
     */
    public final TableField<EpOrganClassCatalogRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_organ_class_catalog.update_at</code>. 更新时间
     */
    public final TableField<EpOrganClassCatalogRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_organ_class_catalog.del_flag</code>. 删除标志
     */
    public final TableField<EpOrganClassCatalogRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");
    /**
     * The column <code>ep.ep_organ_class_catalog.version</code>.
     */
    public final TableField<EpOrganClassCatalogRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ_class_catalog</code> table reference
     */
    public EpOrganClassCatalog() {
        this("ep_organ_class_catalog", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ_class_catalog</code> table reference
     */
    public EpOrganClassCatalog(String alias) {
        this(alias, EP_ORGAN_CLASS_CATALOG);
    }

    private EpOrganClassCatalog(String alias, Table<EpOrganClassCatalogRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrganClassCatalog(String alias, Table<EpOrganClassCatalogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "班次课程内容目录表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganClassCatalogRecord> getRecordType() {
        return EpOrganClassCatalogRecord.class;
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
    public Identity<EpOrganClassCatalogRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN_CLASS_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganClassCatalogRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_CLASS_CATALOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganClassCatalogRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganClassCatalogRecord>>asList(Keys.KEY_EP_ORGAN_CLASS_CATALOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganClassCatalogRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalog as(String alias) {
        return new EpOrganClassCatalog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrganClassCatalog rename(String name) {
        return new EpOrganClassCatalog(name, null);
    }
}
