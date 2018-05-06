/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpWechatOpenidType;
import com.ep.domain.repository.domain.tables.records.EpWechatOpenidRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * 公众号关联表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpWechatOpenid extends TableImpl<EpWechatOpenidRecord> {

    private static final long serialVersionUID = 1205404232;

    /**
     * The reference instance of <code>ep.ep_wechat_openid</code>
     */
    public static final EpWechatOpenid EP_WECHAT_OPENID = new EpWechatOpenid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpWechatOpenidRecord> getRecordType() {
        return EpWechatOpenidRecord.class;
    }

    /**
     * The column <code>ep.ep_wechat_openid.id</code>.
     */
    public final TableField<EpWechatOpenidRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>ep.ep_wechat_openid.openid</code>. 微信公众号号内，用户openid
     */
    public final TableField<EpWechatOpenidRecord, String> OPENID = createField("openid", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "微信公众号号内，用户openid");

    /**
     * The column <code>ep.ep_wechat_openid.type</code>. 微信公众号类型:服务号
     */
    public final TableField<EpWechatOpenidRecord, EpWechatOpenidType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpWechatOpenidType.class), this, "微信公众号类型:服务号");

    /**
     * The column <code>ep.ep_wechat_openid.mobile</code>. 手机号
     */
    public final TableField<EpWechatOpenidRecord, Long> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.BIGINT, this, "手机号");

    /**
     * Create a <code>ep.ep_wechat_openid</code> table reference
     */
    public EpWechatOpenid() {
        this("ep_wechat_openid", null);
    }

    /**
     * Create an aliased <code>ep.ep_wechat_openid</code> table reference
     */
    public EpWechatOpenid(String alias) {
        this(alias, EP_WECHAT_OPENID);
    }

    private EpWechatOpenid(String alias, Table<EpWechatOpenidRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpWechatOpenid(String alias, Table<EpWechatOpenidRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公众号关联表");
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
    public Identity<EpWechatOpenidRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_WECHAT_OPENID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpWechatOpenidRecord> getPrimaryKey() {
        return Keys.KEY_EP_WECHAT_OPENID_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpWechatOpenidRecord>> getKeys() {
        return Arrays.<UniqueKey<EpWechatOpenidRecord>>asList(Keys.KEY_EP_WECHAT_OPENID_PRIMARY, Keys.KEY_EP_WECHAT_OPENID_INDEX_OPENID_TYPE_MOBILE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatOpenid as(String alias) {
        return new EpWechatOpenid(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpWechatOpenid rename(String name) {
        return new EpWechatOpenid(name, null);
    }
}
