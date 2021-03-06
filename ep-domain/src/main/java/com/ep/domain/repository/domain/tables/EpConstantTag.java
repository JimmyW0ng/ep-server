/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpConstantTagStatus;
import com.ep.domain.repository.domain.tables.records.EpConstantTagRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 标签表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpConstantTag extends TableImpl<EpConstantTagRecord> {

    private static final long serialVersionUID = 1673345394;

    /**
     * The reference instance of <code>ep.ep_constant_tag</code>
     */
    public static final EpConstantTag EP_CONSTANT_TAG = new EpConstantTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpConstantTagRecord> getRecordType() {
        return EpConstantTagRecord.class;
    }

    /**
     * The column <code>ep.ep_constant_tag.id</code>.
     */
    public final TableField<EpConstantTagRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>ep.ep_constant_tag.tag_name</code>. 标签名称
     */
    public final TableField<EpConstantTagRecord, String> TAG_NAME = createField("tag_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "标签名称");

    /**
     * The column <code>ep.ep_constant_tag.tag_level</code>. 标签等级
     */
    public final TableField<EpConstantTagRecord, Byte> TAG_LEVEL = createField("tag_level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "标签等级");

    /**
     * The column <code>ep.ep_constant_tag.sort</code>. 排序
     */
    public final TableField<EpConstantTagRecord, Long> SORT = createField("sort", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.BIGINT)), this, "排序");

    /**
     * The column <code>ep.ep_constant_tag.ogn_flag</code>. 是否机构私有标签
     */
    public final TableField<EpConstantTagRecord, Boolean> OGN_FLAG = createField("ogn_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "是否机构私有标签");

    /**
     * The column <code>ep.ep_constant_tag.ogn_id</code>. 机构id
     */
    public final TableField<EpConstantTagRecord, Long> OGN_ID = createField("ogn_id", org.jooq.impl.SQLDataType.BIGINT, this, "机构id");

    /**
     * The column <code>ep.ep_constant_tag.status</code>. 状态：已保存；已上线；已下线；
     */
    public final TableField<EpConstantTagRecord, EpConstantTagStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpConstantTagStatus.class), this, "状态：已保存；已上线；已下线；");

    /**
     * The column <code>ep.ep_constant_tag.create_at</code>. 创建时间
     */
    public final TableField<EpConstantTagRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_constant_tag.update_at</code>. 更新时间
     */
    public final TableField<EpConstantTagRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_constant_tag.remark</code>. 备注
     */
    public final TableField<EpConstantTagRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * The column <code>ep.ep_constant_tag.del_flag</code>. 删除标记
     */
    public final TableField<EpConstantTagRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>ep.ep_constant_tag.version</code>.
     */
    public final TableField<EpConstantTagRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_constant_tag</code> table reference
     */
    public EpConstantTag() {
        this("ep_constant_tag", null);
    }

    /**
     * Create an aliased <code>ep.ep_constant_tag</code> table reference
     */
    public EpConstantTag(String alias) {
        this(alias, EP_CONSTANT_TAG);
    }

    private EpConstantTag(String alias, Table<EpConstantTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpConstantTag(String alias, Table<EpConstantTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "标签表");
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
    public Identity<EpConstantTagRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_CONSTANT_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpConstantTagRecord> getPrimaryKey() {
        return Keys.KEY_EP_CONSTANT_TAG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpConstantTagRecord>> getKeys() {
        return Arrays.<UniqueKey<EpConstantTagRecord>>asList(Keys.KEY_EP_CONSTANT_TAG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpConstantTagRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpConstantTag as(String alias) {
        return new EpConstantTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpConstantTag rename(String name) {
        return new EpConstantTag(name, null);
    }
}
