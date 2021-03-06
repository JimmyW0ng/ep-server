/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpOrganAccountStatus;
import com.ep.domain.repository.domain.tables.records.EpOrganAccountRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 机构账户关联信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrganAccount extends TableImpl<EpOrganAccountRecord> {

    private static final long serialVersionUID = -547748746;

    /**
     * The reference instance of <code>ep.ep_organ_account</code>
     */
    public static final EpOrganAccount EP_ORGAN_ACCOUNT = new EpOrganAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganAccountRecord> getRecordType() {
        return EpOrganAccountRecord.class;
    }

    /**
     * The column <code>ep.ep_organ_account.id</code>. 主键
     */
    public final TableField<EpOrganAccountRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>ep.ep_organ_account.account_name</code>. 机构内部名称
     */
    public final TableField<EpOrganAccountRecord, String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "机构内部名称");

    /**
     * The column <code>ep.ep_organ_account.nick_name</code>. 对外昵称
     */
    public final TableField<EpOrganAccountRecord, String> NICK_NAME = createField("nick_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "对外昵称");

    /**
     * The column <code>ep.ep_organ_account.introduce</code>. 介绍
     */
    public final TableField<EpOrganAccountRecord, String> INTRODUCE = createField("introduce", org.jooq.impl.SQLDataType.VARCHAR.length(3000), this, "介绍");

    /**
     * The column <code>ep.ep_organ_account.ogn_id</code>. 所属机构id
     */
    public final TableField<EpOrganAccountRecord, Long> OGN_ID = createField("ogn_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "所属机构id");

    /**
     * The column <code>ep.ep_organ_account.status</code>. 状态：正常；已冻结；已注销；
     */
    public final TableField<EpOrganAccountRecord, EpOrganAccountStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpOrganAccountStatus.class), this, "状态：正常；已冻结；已注销；");

    /**
     * The column <code>ep.ep_organ_account.refer_mobile</code>. 关联手机号
     */
    public final TableField<EpOrganAccountRecord, Long> REFER_MOBILE = createField("refer_mobile", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "关联手机号");

    /**
     * The column <code>ep.ep_organ_account.create_at</code>. 创建时间
     */
    public final TableField<EpOrganAccountRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_organ_account.update_at</code>. 更新时间
     */
    public final TableField<EpOrganAccountRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_organ_account.remark</code>. 备注
     */
    public final TableField<EpOrganAccountRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * The column <code>ep.ep_organ_account.del_flag</code>. 删除标记
     */
    public final TableField<EpOrganAccountRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>ep.ep_organ_account.version</code>.
     */
    public final TableField<EpOrganAccountRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ_account</code> table reference
     */
    public EpOrganAccount() {
        this("ep_organ_account", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ_account</code> table reference
     */
    public EpOrganAccount(String alias) {
        this(alias, EP_ORGAN_ACCOUNT);
    }

    private EpOrganAccount(String alias, Table<EpOrganAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrganAccount(String alias, Table<EpOrganAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构账户关联信息表");
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
    public Identity<EpOrganAccountRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganAccountRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_ACCOUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganAccountRecord>>asList(Keys.KEY_EP_ORGAN_ACCOUNT_PRIMARY, Keys.KEY_EP_ORGAN_ACCOUNT_UNIQUE_MOBILE_OGN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganAccountRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganAccount as(String alias) {
        return new EpOrganAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrganAccount rename(String name) {
        return new EpOrganAccount(name, null);
    }
}
