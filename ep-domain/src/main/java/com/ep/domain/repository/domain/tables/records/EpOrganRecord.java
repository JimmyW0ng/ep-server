/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpOrganStatus;
import com.ep.domain.repository.domain.tables.EpOrgan;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrganRecord extends UpdatableRecordImpl<EpOrganRecord> implements Record21<Long, String, String, Long, String, String, String, Timestamp, String, String, String, String, Byte, Byte, Integer, EpOrganStatus, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -1317345171;

    /**
     * Create a detached EpOrganRecord
     */
    public EpOrganRecord() {
        super(EpOrgan.EP_ORGAN);
    }

    /**
     * Create a detached, initialised EpOrganRecord
     */
    public EpOrganRecord(Long id, String ognName, String ognAddress, Long ognRegion, String ognLng, String ognLat, String ognShortIntroduce, Timestamp ognCreateDate, String ognPhone, String ognEmail, String ognUrl, String ognIntroduce, Byte marketWeight, Byte togetherScore, Integer totalParticipate, EpOrganStatus status, String remark, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(EpOrgan.EP_ORGAN);

        set(0, id);
        set(1, ognName);
        set(2, ognAddress);
        set(3, ognRegion);
        set(4, ognLng);
        set(5, ognLat);
        set(6, ognShortIntroduce);
        set(7, ognCreateDate);
        set(8, ognPhone);
        set(9, ognEmail);
        set(10, ognUrl);
        set(11, ognIntroduce);
        set(12, marketWeight);
        set(13, togetherScore);
        set(14, totalParticipate);
        set(15, status);
        set(16, remark);
        set(17, createAt);
        set(18, updateAt);
        set(19, delFlag);
        set(20, version);
    }

    /**
     * Getter for <code>ep.ep_organ.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_organ.id</code>. 主键
     */
    public EpOrganRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_name</code>. 机构名称
     */
    public String getOgnName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_name</code>. 机构名称
     */
    public EpOrganRecord setOgnName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_address</code>. 机构地址
     */
    public String getOgnAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_address</code>. 机构地址
     */
    public EpOrganRecord setOgnAddress(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_region</code>. 机构地区
     */
    public Long getOgnRegion() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_region</code>. 机构地区
     */
    public EpOrganRecord setOgnRegion(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_lng</code>. 地区经度
     */
    public String getOgnLng() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_lng</code>. 地区经度
     */
    public EpOrganRecord setOgnLng(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_lat</code>. 地区纬度
     */
    public String getOgnLat() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_lat</code>. 地区纬度
     */
    public EpOrganRecord setOgnLat(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_short_introduce</code>. 机构简介
     */
    public String getOgnShortIntroduce() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_short_introduce</code>. 机构简介
     */
    public EpOrganRecord setOgnShortIntroduce(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_create_date</code>. 机构成立日期
     */
    public Timestamp getOgnCreateDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_create_date</code>. 机构成立日期
     */
    public EpOrganRecord setOgnCreateDate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_phone</code>. 机构官方电话
     */
    public String getOgnPhone() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_phone</code>. 机构官方电话
     */
    public EpOrganRecord setOgnPhone(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_email</code>. 机构官方邮箱
     */
    public String getOgnEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_email</code>. 机构官方邮箱
     */
    public EpOrganRecord setOgnEmail(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_url</code>. 机构官方网址
     */
    public String getOgnUrl() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_url</code>. 机构官方网址
     */
    public EpOrganRecord setOgnUrl(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.ogn_introduce</code>. 机构简介
     */
    public String getOgnIntroduce() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ep.ep_organ.ogn_introduce</code>. 机构简介
     */
    public EpOrganRecord setOgnIntroduce(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.market_weight</code>. 营销权重
     */
    public Byte getMarketWeight() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>ep.ep_organ.market_weight</code>. 营销权重
     */
    public EpOrganRecord setMarketWeight(Byte value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.together_score</code>. 综合得分
     */
    public Byte getTogetherScore() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>ep.ep_organ.together_score</code>. 综合得分
     */
    public EpOrganRecord setTogetherScore(Byte value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.total_participate</code>. 总参与人数
     */
    public Integer getTotalParticipate() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>ep.ep_organ.total_participate</code>. 总参与人数
     */
    public EpOrganRecord setTotalParticipate(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.status</code>. 状态：已保存；已上线；已下线；已冻结
     */
    public EpOrganStatus getStatus() {
        return (EpOrganStatus) get(15);
    }

    /**
     * Setter for <code>ep.ep_organ.status</code>. 状态：已保存；已上线；已下线；已冻结
     */
    public EpOrganRecord setStatus(EpOrganStatus value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.remark</code>. 备注信息
     */
    public String getRemark() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ep.ep_organ.remark</code>. 备注信息
     */
    public EpOrganRecord setRemark(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>ep.ep_organ.create_at</code>. 创建时间
     */
    public EpOrganRecord setCreateAt(Timestamp value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>ep.ep_organ.update_at</code>. 更新时间
     */
    public EpOrganRecord setUpdateAt(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>ep.ep_organ.del_flag</code>. 删除标志
     */
    public EpOrganRecord setDelFlag(Boolean value) {
        set(19, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ep.ep_organ.version</code>.
     */
    public Long getVersion() {
        return (Long) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ep.ep_organ.version</code>.
     */
    public EpOrganRecord setVersion(Long value) {
        set(20, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, String, String, Long, String, String, String, Timestamp, String, String, String, String, Byte, Byte, Integer, EpOrganStatus, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, String, String, Long, String, String, String, Timestamp, String, String, String, String, Byte, Byte, Integer, EpOrganStatus, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpOrgan.EP_ORGAN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EpOrgan.EP_ORGAN.OGN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpOrgan.EP_ORGAN.OGN_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return EpOrgan.EP_ORGAN.OGN_REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EpOrgan.EP_ORGAN.OGN_LNG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EpOrgan.EP_ORGAN.OGN_LAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EpOrgan.EP_ORGAN.OGN_SHORT_INTRODUCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return EpOrgan.EP_ORGAN.OGN_CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EpOrgan.EP_ORGAN.OGN_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EpOrgan.EP_ORGAN.OGN_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EpOrgan.EP_ORGAN.OGN_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return EpOrgan.EP_ORGAN.OGN_INTRODUCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return EpOrgan.EP_ORGAN.MARKET_WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return EpOrgan.EP_ORGAN.TOGETHER_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return EpOrgan.EP_ORGAN.TOTAL_PARTICIPATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpOrganStatus> field16() {
        return EpOrgan.EP_ORGAN.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return EpOrgan.EP_ORGAN.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return EpOrgan.EP_ORGAN.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return EpOrgan.EP_ORGAN.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return EpOrgan.EP_ORGAN.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field21() {
        return EpOrgan.EP_ORGAN.VERSION;
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
        return getOgnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOgnAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getOgnRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOgnLng();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOgnLat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOgnShortIntroduce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getOgnCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOgnPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOgnEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getOgnUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getOgnIntroduce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getMarketWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getTogetherScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getTotalParticipate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganStatus value16() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value21() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value2(String value) {
        setOgnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value3(String value) {
        setOgnAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value4(Long value) {
        setOgnRegion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value5(String value) {
        setOgnLng(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value6(String value) {
        setOgnLat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value7(String value) {
        setOgnShortIntroduce(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value8(Timestamp value) {
        setOgnCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value9(String value) {
        setOgnPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value10(String value) {
        setOgnEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value11(String value) {
        setOgnUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value12(String value) {
        setOgnIntroduce(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value13(Byte value) {
        setMarketWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value14(Byte value) {
        setTogetherScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value15(Integer value) {
        setTotalParticipate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value16(EpOrganStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value17(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value18(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value19(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value20(Boolean value) {
        setDelFlag(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord value21(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganRecord values(Long value1, String value2, String value3, Long value4, String value5, String value6, String value7, Timestamp value8, String value9, String value10, String value11, String value12, Byte value13, Byte value14, Integer value15, EpOrganStatus value16, String value17, Timestamp value18, Timestamp value19, Boolean value20, Long value21) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }
}
