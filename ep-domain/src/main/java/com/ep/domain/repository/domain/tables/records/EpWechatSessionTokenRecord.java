/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.tables.EpWechatSessionToken;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpWechatSessionTokenRecord extends UpdatableRecordImpl<EpWechatSessionTokenRecord> implements Record9<Long, String, String, String, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = 1152533887;

    /**
     * Setter for <code>ep.ep_wechat_session_token.id</code>. 主键
     */
    public EpWechatSessionTokenRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.session_token</code>. 平台会话token
     */
    public EpWechatSessionTokenRecord setSessionToken(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.session_token</code>. 平台会话token
     */
    public String getSessionToken() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.open_id</code>. 微信用户唯一标识
     */
    public EpWechatSessionTokenRecord setOpenId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.open_id</code>. 微信用户唯一标识
     */
    public String getOpenId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.session_key</code>. 微信会话密钥
     */
    public EpWechatSessionTokenRecord setSessionKey(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.session_key</code>. 微信会话密钥
     */
    public String getSessionKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.remarks</code>. 备注信息
     */
    public EpWechatSessionTokenRecord setRemarks(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.remarks</code>. 备注信息
     */
    public String getRemarks() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.create_at</code>. 创建时间
     */
    public EpWechatSessionTokenRecord setCreateAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.update_at</code>. 更新时间
     */
    public EpWechatSessionTokenRecord setUpdateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.del_flag</code>. 删除标志
     */
    public EpWechatSessionTokenRecord setDelFlag(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>ep.ep_wechat_session_token.version</code>.
     */
    public EpWechatSessionTokenRecord setVersion(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_wechat_session_token.version</code>.
     */
    public Long getVersion() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.SESSION_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.OPEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.SESSION_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSessionToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOpenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSessionKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value2(String value) {
        setSessionToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value3(String value) {
        setOpenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value4(String value) {
        setSessionKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value5(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value6(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value7(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value8(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord value9(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpWechatSessionTokenRecord values(Long value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7, Boolean value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpWechatSessionTokenRecord
     */
    public EpWechatSessionTokenRecord() {
        super(EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN);
    }

    /**
     * Create a detached, initialised EpWechatSessionTokenRecord
     */
    public EpWechatSessionTokenRecord(Long id, String sessionToken, String openId, String sessionKey, String remarks, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(EpWechatSessionToken.EP_WECHAT_SESSION_TOKEN);

        set(0, id);
        set(1, sessionToken);
        set(2, openId);
        set(3, sessionKey);
        set(4, remarks);
        set(5, createAt);
        set(6, updateAt);
        set(7, delFlag);
        set(8, version);
    }
}
