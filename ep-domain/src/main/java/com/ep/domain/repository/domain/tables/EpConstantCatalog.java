/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.tables.records.EpConstantCatalogRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 课程类目表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpConstantCatalog extends TableImpl<EpConstantCatalogRecord> {

    private static final long serialVersionUID = -176298386;

    /**
     * The reference instance of <code>ep.ep_constant_catalog</code>
     */
    public static final EpConstantCatalog EP_CONSTANT_CATALOG = new EpConstantCatalog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpConstantCatalogRecord> getRecordType() {
        return EpConstantCatalogRecord.class;
    }

    /**
     * The column <code>ep.ep_constant_catalog.id</code>. 主键
     */
    public final TableField<EpConstantCatalogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>ep.ep_constant_catalog.parent_id</code>. 父级id
     */
    public final TableField<EpConstantCatalogRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "父级id");

    /**
     * The column <code>ep.ep_constant_catalog.label</code>. 标签
     */
    public final TableField<EpConstantCatalogRecord, String> LABEL = createField("label", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "标签");

    /**
     * The column <code>ep.ep_constant_catalog.create_at</code>. 创建时间
     */
    public final TableField<EpConstantCatalogRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_constant_catalog.update_at</code>. 更新时间
     */
    public final TableField<EpConstantCatalogRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_constant_catalog.remark</code>. 备注信息
     */
    public final TableField<EpConstantCatalogRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");

    /**
     * The column <code>ep.ep_constant_catalog.del_flag</code>. 删除标志
     */
    public final TableField<EpConstantCatalogRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>ep.ep_constant_catalog.version</code>.
     */
    public final TableField<EpConstantCatalogRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_constant_catalog</code> table reference
     */
    public EpConstantCatalog() {
        this("ep_constant_catalog", null);
    }

    /**
     * Create an aliased <code>ep.ep_constant_catalog</code> table reference
     */
    public EpConstantCatalog(String alias) {
        this(alias, EP_CONSTANT_CATALOG);
    }

    private EpConstantCatalog(String alias, Table<EpConstantCatalogRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpConstantCatalog(String alias, Table<EpConstantCatalogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "课程类目表");
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
    public Identity<EpConstantCatalogRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_CONSTANT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpConstantCatalogRecord> getPrimaryKey() {
        return Keys.KEY_EP_CONSTANT_CATALOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpConstantCatalogRecord>> getKeys() {
        return Arrays.<UniqueKey<EpConstantCatalogRecord>>asList(Keys.KEY_EP_CONSTANT_CATALOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpConstantCatalogRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpConstantCatalog as(String alias) {
        return new EpConstantCatalog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpConstantCatalog rename(String name) {
        return new EpConstantCatalog(name, null);
    }
}
