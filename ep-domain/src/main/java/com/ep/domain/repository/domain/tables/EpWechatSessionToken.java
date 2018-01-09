/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.tables.records.EpWechatSessionTokenRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 微信会话token表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpWechatSessionToken extends TableImpl<EpWechatSessionTokenRecord> {

    /**
     * The reference instance of <code>ep.ep_wechat_session_token</code>
     */
    public static final EpWechatSessionToken EP_WECHAT_SESSION_TOKEN = new EpWechatSessionToken();
    private static final long serialVersionUID = -879613967;
    /**
     * The column <code>ep.ep_wechat_session_token.id</code>. 主键
     */
    public final TableField<EpWechatSessionTokenRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_wechat_session_token.session_token</code>. 平台会话token
     */
    public final TableField<EpWechatSessionTokenRecord, String> SESSION_TOKEN = createField("session_token", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "平台会话token");
    /**
     * The column <code>ep.ep_wechat_session_token.open_id</code>. 微信用户唯一标识
     */
    public final TableField<EpWechatSessionTokenRecord, String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "微信用户唯一标识");
    /**
     * The column <code>ep.ep_wechat_session_token.session_key</code>. 微信会话密钥
     */
    public final TableField<EpWechatSessionTokenRecord, String> SESSION_KEY = createField("session_key", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "微信会话密钥");
    /**
     * The column <code>ep.ep_wechat_session_token.remarks</code>. 备注信息
     */
    public final TableField<EpWechatSessionTokenRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");
    /**
     * The column <code>ep.ep_wechat_session_token.create_at</code>. 创建时间
     */
    public final TableField<EpWechatSessionTokenRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_wechat_session_token.update_at</code>. 更新时间
     */
    public final TableField<EpWechatSessionTokenRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_wechat_session_token.del_flag</code>. 删除标志
     */
    public final TableField<EpWechatSessionTokenRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标志");
    /**
     * The column <code>ep.ep_wechat_session_token.version</code>.
     */
    public final TableField<EpWechatSessionTokenRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_wechat_session_token</code> table reference
     */
    public EpWechatSessionToken() {
        this("ep_wechat_session_token", null);
    }

    /**
     * Create an aliased <code>ep.ep_wechat_session_token</code> table reference
     */
    public EpWechatSessionToken(String alias) {
        this(alias, EP_WECHAT_SESSION_TOKEN);
    }

    private EpWechatSessionToken(String alias, Table<EpWechatSessionTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpWechatSessionToken(String alias, Table<EpWechatSessionTokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "微信会话token表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpWechatSessionTokenRecord> getRecordType() {
        return EpWechatSessionTokenRecord.class;
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
    public Identity<EpWechatSessionTokenRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_WECHAT_SESSION_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpWechatSessionTokenRecord> getPrimaryKey() {
        return Keys.KEY_EP_WECHAT_SESSION_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpWechatSessionTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<EpWechatSessionTokenRecord>>asList(Keys.KEY_EP_WECHAT_SESSION_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpWechatSessionTokenRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionToken as(String alias) {
        return new EpWechatSessionToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpWechatSessionToken rename(String name) {
        return new EpWechatSessionToken(name, null);
    }
}