/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.tables.EpOrganConfig;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 机构配置表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpOrganConfigRecord extends UpdatableRecordImpl<EpOrganConfigRecord> implements Record10<Long, Long, Boolean, Boolean, Boolean, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = -300721221;

    /**
     * Setter for <code>ep.ep_organ_config.id</code>.
     */
    public EpOrganConfigRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_organ_config.ogn_id</code>. 机构id
     */
    public EpOrganConfigRecord setOgnId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.ogn_id</code>. 机构id
     */
    public Long getOgnId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_organ_config.private_flag</code>. 机构资源是否私有
     */
    public EpOrganConfigRecord setPrivateFlag(Boolean value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.private_flag</code>. 机构资源是否私有
     */
    public Boolean getPrivateFlag() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>ep.ep_organ_config.support_tag</code>. 是否支持标签功能
     */
    public EpOrganConfigRecord setSupportTag(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.support_tag</code>. 是否支持标签功能
     */
    public Boolean getSupportTag() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>ep.ep_organ_config.wechat_pay_flag</code>. 是否支持微信支付
     */
    public EpOrganConfigRecord setWechatPayFlag(Boolean value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.wechat_pay_flag</code>. 是否支持微信支付
     */
    public Boolean getWechatPayFlag() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>ep.ep_organ_config.create_at</code>. 创建时间
     */
    public EpOrganConfigRecord setCreateAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ep.ep_organ_config.update_at</code>. 更新时间
     */
    public EpOrganConfigRecord setUpdateAt(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ep.ep_organ_config.remark</code>. 备注
     */
    public EpOrganConfigRecord setRemark(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ep.ep_organ_config.del_flag</code>. 删除标记
     */
    public EpOrganConfigRecord setDelFlag(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.del_flag</code>. 删除标记
     */
    public Boolean getDelFlag() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>ep.ep_organ_config.version</code>.
     */
    public EpOrganConfigRecord setVersion(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_config.version</code>.
     */
    public Long getVersion() {
        return (Long) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Boolean, Boolean, Boolean, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Boolean, Boolean, Boolean, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpOrganConfig.EP_ORGAN_CONFIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpOrganConfig.EP_ORGAN_CONFIG.OGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return EpOrganConfig.EP_ORGAN_CONFIG.PRIVATE_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return EpOrganConfig.EP_ORGAN_CONFIG.SUPPORT_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return EpOrganConfig.EP_ORGAN_CONFIG.WECHAT_PAY_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return EpOrganConfig.EP_ORGAN_CONFIG.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EpOrganConfig.EP_ORGAN_CONFIG.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EpOrganConfig.EP_ORGAN_CONFIG.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return EpOrganConfig.EP_ORGAN_CONFIG.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return EpOrganConfig.EP_ORGAN_CONFIG.VERSION;
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
    public Long value2() {
        return getOgnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getPrivateFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getSupportTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getWechatPayFlag();
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
    public String value8() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value2(Long value) {
        setOgnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value3(Boolean value) {
        setPrivateFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value4(Boolean value) {
        setSupportTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value5(Boolean value) {
        setWechatPayFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value6(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value7(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value8(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value9(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord value10(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganConfigRecord values(Long value1, Long value2, Boolean value3, Boolean value4, Boolean value5, Timestamp value6, Timestamp value7, String value8, Boolean value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpOrganConfigRecord
     */
    public EpOrganConfigRecord() {
        super(EpOrganConfig.EP_ORGAN_CONFIG);
    }

    /**
     * Create a detached, initialised EpOrganConfigRecord
     */
    public EpOrganConfigRecord(Long id, Long ognId, Boolean privateFlag, Boolean supportTag, Boolean wechatPayFlag, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpOrganConfig.EP_ORGAN_CONFIG);

        set(0, id);
        set(1, ognId);
        set(2, privateFlag);
        set(3, supportTag);
        set(4, wechatPayFlag);
        set(5, createAt);
        set(6, updateAt);
        set(7, remark);
        set(8, delFlag);
        set(9, version);
    }
}
