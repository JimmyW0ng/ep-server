/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpSystemUserStatus;
import com.ep.domain.repository.domain.tables.records.EpSystemUserRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 平台用户表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpSystemUser extends TableImpl<EpSystemUserRecord> {

    /**
     * The reference instance of <code>ep.ep_system_user</code>
     */
    public static final EpSystemUser EP_SYSTEM_USER = new EpSystemUser();
    private static final long serialVersionUID = 339922290;
    /**
     * The column <code>ep.ep_system_user.id</code>. 主键
     */
    public final TableField<EpSystemUserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_system_user.mobile</code>. 手机号
     */
    public final TableField<EpSystemUserRecord, Long> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "手机号");
    /**
     * The column <code>ep.ep_system_user.user_name</code>. 用户名
     */
    public final TableField<EpSystemUserRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用户名");
    /**
     * The column <code>ep.ep_system_user.salt</code>. 盐
     */
    public final TableField<EpSystemUserRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "盐");
    /**
     * The column <code>ep.ep_system_user.password</code>. 密码
     */
    public final TableField<EpSystemUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "密码");
    /**
     * The column <code>ep.ep_system_user.role</code>. 角色
     */
    public final TableField<EpSystemUserRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "角色");
    /**
     * The column <code>ep.ep_system_user.email</code>. 邮箱
     */
    public final TableField<EpSystemUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "邮箱");
    /**
     * The column <code>ep.ep_system_user.status</code>. 状态：正常；已冻结；已注销；
     */
    public final TableField<EpSystemUserRecord, EpSystemUserStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpSystemUserStatus.class), this, "状态：正常；已冻结；已注销；");
    /**
     * The column <code>ep.ep_system_user.create_at</code>. 创建时间
     */
    public final TableField<EpSystemUserRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_system_user.update_at</code>. 更新时间
     */
    public final TableField<EpSystemUserRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_system_user.remark</code>. 备注
     */
    public final TableField<EpSystemUserRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");
    /**
     * The column <code>ep.ep_system_user.del_flag</code>. 删除标记
     */
    public final TableField<EpSystemUserRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");
    /**
     * The column <code>ep.ep_system_user.version</code>.
     */
    public final TableField<EpSystemUserRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_system_user</code> table reference
     */
    public EpSystemUser() {
        this("ep_system_user", null);
    }

    /**
     * Create an aliased <code>ep.ep_system_user</code> table reference
     */
    public EpSystemUser(String alias) {
        this(alias, EP_SYSTEM_USER);
    }

    private EpSystemUser(String alias, Table<EpSystemUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpSystemUser(String alias, Table<EpSystemUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "平台用户表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpSystemUserRecord> getRecordType() {
        return EpSystemUserRecord.class;
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
    public Identity<EpSystemUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_SYSTEM_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpSystemUserRecord> getPrimaryKey() {
        return Keys.KEY_EP_SYSTEM_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpSystemUserRecord>> getKeys() {
        return Arrays.<UniqueKey<EpSystemUserRecord>>asList(Keys.KEY_EP_SYSTEM_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpSystemUserRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemUser as(String alias) {
        return new EpSystemUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpSystemUser rename(String name) {
        return new EpSystemUser(name, null);
    }
}