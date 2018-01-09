/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpOrganInfoStatus;
import com.ep.domain.repository.domain.tables.records.EpOrganInfoRecord;
import org.jooq.*;
import org.jooq.impl.DateAsTimestampBinding;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpOrganInfo extends TableImpl<EpOrganInfoRecord> {

    /**
     * The reference instance of <code>ep.ep_organ_info</code>
     */
    public static final EpOrganInfo EP_ORGAN_INFO = new EpOrganInfo();
    private static final long serialVersionUID = 2103344611;
    /**
     * The column <code>ep.ep_organ_info.id</code>. 主键
     */
    public final TableField<EpOrganInfoRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_organ_info.organ_name</code>. 机构名称
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_NAME = createField("organ_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "机构名称");
    /**
     * The column <code>ep.ep_organ_info.organ_address</code>. 机构地址
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_ADDRESS = createField("organ_address", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "机构地址");
    /**
     * The column <code>ep.ep_organ_info.organ_region</code>. 机构地区
     */
    public final TableField<EpOrganInfoRecord, Long> ORGAN_REGION = createField("organ_region", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "机构地区");
    /**
     * The column <code>ep.ep_organ_info.organ_lng</code>. 地区经度
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_LNG = createField("organ_lng", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "地区经度");
    /**
     * The column <code>ep.ep_organ_info.organ_lat</code>. 地区纬度
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_LAT = createField("organ_lat", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "地区纬度");
    /**
     * The column <code>ep.ep_organ_info.organ_short_introduce</code>. 机构简介
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_SHORT_INTRODUCE = createField("organ_short_introduce", org.jooq.impl.SQLDataType.CLOB, this, "机构简介");
    /**
     * The column <code>ep.ep_organ_info.organ_create_date</code>. 机构成立日期
     */
    public final TableField<EpOrganInfoRecord, Timestamp> ORGAN_CREATE_DATE = createField("organ_create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "机构成立日期", new DateAsTimestampBinding());
    /**
     * The column <code>ep.ep_organ_info.organ_phone</code>. 机构官方电话
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_PHONE = createField("organ_phone", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "机构官方电话");
    /**
     * The column <code>ep.ep_organ_info.organ_email</code>. 机构官方邮箱
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_EMAIL = createField("organ_email", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "机构官方邮箱");
    /**
     * The column <code>ep.ep_organ_info.organ_url</code>. 机构官方网址
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_URL = createField("organ_url", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "机构官方网址");
    /**
     * The column <code>ep.ep_organ_info.organ_introduce</code>. 机构简介
     */
    public final TableField<EpOrganInfoRecord, String> ORGAN_INTRODUCE = createField("organ_introduce", org.jooq.impl.SQLDataType.CLOB, this, "机构简介");
    /**
     * The column <code>ep.ep_organ_info.status</code>. 状态：正常；已冻结；已注销；
     */
    public final TableField<EpOrganInfoRecord, EpOrganInfoStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpOrganInfoStatus.class), this, "状态：正常；已冻结；已注销；");
    /**
     * The column <code>ep.ep_organ_info.remark</code>. 备注信息
     */
    public final TableField<EpOrganInfoRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");
    /**
     * The column <code>ep.ep_organ_info.create_at</code>. 创建时间
     */
    public final TableField<EpOrganInfoRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_organ_info.update_at</code>. 更新时间
     */
    public final TableField<EpOrganInfoRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_organ_info.del_flag</code>. 删除标志
     */
    public final TableField<EpOrganInfoRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");
    /**
     * The column <code>ep.ep_organ_info.version</code>.
     */
    public final TableField<EpOrganInfoRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ_info</code> table reference
     */
    public EpOrganInfo() {
        this("ep_organ_info", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ_info</code> table reference
     */
    public EpOrganInfo(String alias) {
        this(alias, EP_ORGAN_INFO);
    }

    private EpOrganInfo(String alias, Table<EpOrganInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrganInfo(String alias, Table<EpOrganInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构信息表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganInfoRecord> getRecordType() {
        return EpOrganInfoRecord.class;
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
    public Identity<EpOrganInfoRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganInfoRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganInfoRecord>>asList(Keys.KEY_EP_ORGAN_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganInfoRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganInfo as(String alias) {
        return new EpOrganInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrganInfo rename(String name) {
        return new EpOrganInfo(name, null);
    }
}
