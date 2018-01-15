/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.tables.records.EpFileRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 文件表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpFile extends TableImpl<EpFileRecord> {

    private static final long serialVersionUID = 79463222;

    /**
     * The reference instance of <code>ep.ep_file</code>
     */
    public static final EpFile EP_FILE = new EpFile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpFileRecord> getRecordType() {
        return EpFileRecord.class;
    }

    /**
     * The column <code>ep.ep_file.id</code>. 主键
     */
    public final TableField<EpFileRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>ep.ep_file.file_name</code>. 文件名字
     */
    public final TableField<EpFileRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "文件名字");

    /**
     * The column <code>ep.ep_file.file_url</code>. 文件url
     */
    public final TableField<EpFileRecord, String> FILE_URL = createField("file_url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "文件url");

    /**
     * The column <code>ep.ep_file.biz_type_code</code>. 业务类型编码（FILE_BIZ_TYPE）
     */
    public final TableField<EpFileRecord, Short> BIZ_TYPE_CODE = createField("biz_type_code", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "业务类型编码（FILE_BIZ_TYPE）");

    /**
     * The column <code>ep.ep_file.source_id</code>. 业务ID
     */
    public final TableField<EpFileRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "业务ID");

    /**
     * The column <code>ep.ep_file.sort</code>. 排序
     */
    public final TableField<EpFileRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "排序");

    /**
     * The column <code>ep.ep_file.create_at</code>. 创建时间
     */
    public final TableField<EpFileRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_file.update_at</code>. 更新时间
     */
    public final TableField<EpFileRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_file.remark</code>. 备注信息
     */
    public final TableField<EpFileRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");

    /**
     * The column <code>ep.ep_file.del_flag</code>. 删除标志
     */
    public final TableField<EpFileRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");

    /**
     * The column <code>ep.ep_file.version</code>.
     */
    public final TableField<EpFileRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_file</code> table reference
     */
    public EpFile() {
        this("ep_file", null);
    }

    /**
     * Create an aliased <code>ep.ep_file</code> table reference
     */
    public EpFile(String alias) {
        this(alias, EP_FILE);
    }

    private EpFile(String alias, Table<EpFileRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpFile(String alias, Table<EpFileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "文件表");
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
    public Identity<EpFileRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpFileRecord> getPrimaryKey() {
        return Keys.KEY_EP_FILE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpFileRecord>> getKeys() {
        return Arrays.<UniqueKey<EpFileRecord>>asList(Keys.KEY_EP_FILE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpFileRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFile as(String alias) {
        return new EpFile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpFile rename(String name) {
        return new EpFile(name, null);
    }
}
