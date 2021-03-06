/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpSystemDictStatus;
import com.ep.domain.repository.domain.tables.records.EpSystemDictRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpSystemDict extends TableImpl<EpSystemDictRecord> {

    private static final long serialVersionUID = -2072795611;

    /**
     * The reference instance of <code>ep.ep_system_dict</code>
     */
    public static final EpSystemDict EP_SYSTEM_DICT = new EpSystemDict();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpSystemDictRecord> getRecordType() {
        return EpSystemDictRecord.class;
    }

    /**
     * The column <code>ep.ep_system_dict.id</code>.
     */
    public final TableField<EpSystemDictRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>ep.ep_system_dict.label</code>. 标签名
     */
    public final TableField<EpSystemDictRecord, String> LABEL = createField("label", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "标签名");

    /**
     * The column <code>ep.ep_system_dict.group_name</code>. 组名
     */
    public final TableField<EpSystemDictRecord, String> GROUP_NAME = createField("group_name", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "组名");

    /**
     * The column <code>ep.ep_system_dict.key</code>. key
     */
    public final TableField<EpSystemDictRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "key");

    /**
     * The column <code>ep.ep_system_dict.value</code>. 数据值
     */
    public final TableField<EpSystemDictRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "数据值");

    /**
     * The column <code>ep.ep_system_dict.description</code>. 描述
     */
    public final TableField<EpSystemDictRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "描述");

    /**
     * The column <code>ep.ep_system_dict.sort</code>. 排序
     */
    public final TableField<EpSystemDictRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "排序");

    /**
     * The column <code>ep.ep_system_dict.status</code>.
     */
    public final TableField<EpSystemDictRecord, EpSystemDictStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpSystemDictStatus.class), this, "");

    /**
     * The column <code>ep.ep_system_dict.create_at</code>. 创建时间
     */
    public final TableField<EpSystemDictRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_system_dict.update_at</code>. 更新时间
     */
    public final TableField<EpSystemDictRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_system_dict.remark</code>. 备注
     */
    public final TableField<EpSystemDictRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "备注");

    /**
     * The column <code>ep.ep_system_dict.del_flag</code>. 删除标记
     */
    public final TableField<EpSystemDictRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>ep.ep_system_dict.version</code>.
     */
    public final TableField<EpSystemDictRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_system_dict</code> table reference
     */
    public EpSystemDict() {
        this("ep_system_dict", null);
    }

    /**
     * Create an aliased <code>ep.ep_system_dict</code> table reference
     */
    public EpSystemDict(String alias) {
        this(alias, EP_SYSTEM_DICT);
    }

    private EpSystemDict(String alias, Table<EpSystemDictRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpSystemDict(String alias, Table<EpSystemDictRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "字典表");
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
    public Identity<EpSystemDictRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_SYSTEM_DICT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpSystemDictRecord> getPrimaryKey() {
        return Keys.KEY_EP_SYSTEM_DICT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpSystemDictRecord>> getKeys() {
        return Arrays.<UniqueKey<EpSystemDictRecord>>asList(Keys.KEY_EP_SYSTEM_DICT_PRIMARY, Keys.KEY_EP_SYSTEM_DICT_SYS_DICT_GROUPNAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpSystemDictRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemDict as(String alias) {
        return new EpSystemDict(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpSystemDict rename(String name) {
        return new EpSystemDict(name, null);
    }
}
