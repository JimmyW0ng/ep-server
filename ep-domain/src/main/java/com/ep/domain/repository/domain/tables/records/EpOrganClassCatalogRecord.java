/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.enums.EpOrganClassCatalogDuraType;
import com.ep.domain.repository.domain.tables.EpOrganClassCatalog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 班次课程内容目录表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpOrganClassCatalogRecord extends UpdatableRecordImpl<EpOrganClassCatalogRecord> implements Record13<Long, Long, String, String, Integer, Timestamp, Integer, EpOrganClassCatalogDuraType, String, Timestamp, Timestamp, Boolean, Long> {

    private static final long serialVersionUID = -666667221;

    /**
     * Setter for <code>ep.ep_organ_class_catalog.id</code>. 主键
     */
    public EpOrganClassCatalogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.class_id</code>. 班次id
     */
    public EpOrganClassCatalogRecord setClassId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.class_id</code>. 班次id
     */
    public Long getClassId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.catalog_title</code>. 目录标题
     */
    public EpOrganClassCatalogRecord setCatalogTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.catalog_title</code>. 目录标题
     */
    public String getCatalogTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.catalog_desc</code>. 目录描述
     */
    public EpOrganClassCatalogRecord setCatalogDesc(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.catalog_desc</code>. 目录描述
     */
    public String getCatalogDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.catalog_index</code>. 目录索引（第几个课时）
     */
    public EpOrganClassCatalogRecord setCatalogIndex(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.catalog_index</code>. 目录索引（第几个课时）
     */
    public Integer getCatalogIndex() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.start_time</code>. 开始时间
     */
    public EpOrganClassCatalogRecord setStartTime(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.start_time</code>. 开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.duration</code>. 持续时长
     */
    public EpOrganClassCatalogRecord setDuration(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.duration</code>. 持续时长
     */
    public Integer getDuration() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.dura_type</code>. 时长周期:小时;分钟;天
     */
    public EpOrganClassCatalogRecord setDuraType(EpOrganClassCatalogDuraType value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.dura_type</code>. 时长周期:小时;分钟;天
     */
    public EpOrganClassCatalogDuraType getDuraType() {
        return (EpOrganClassCatalogDuraType) get(7);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.remark</code>. 备注信息
     */
    public EpOrganClassCatalogRecord setRemark(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.remark</code>. 备注信息
     */
    public String getRemark() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.create_at</code>. 创建时间
     */
    public EpOrganClassCatalogRecord setCreateAt(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.update_at</code>. 更新时间
     */
    public EpOrganClassCatalogRecord setUpdateAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.del_flag</code>. 删除标志
     */
    public EpOrganClassCatalogRecord setDelFlag(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ep.ep_organ_class_catalog.version</code>.
     */
    public EpOrganClassCatalogRecord setVersion(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_organ_class_catalog.version</code>.
     */
    public Long getVersion() {
        return (Long) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, String, Integer, Timestamp, Integer, EpOrganClassCatalogDuraType, String, Timestamp, Timestamp, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, Long, String, String, Integer, Timestamp, Integer, EpOrganClassCatalogDuraType, String, Timestamp, Timestamp, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.CATALOG_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.CATALOG_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.CATALOG_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EpOrganClassCatalogDuraType> field8() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.DURA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.VERSION;
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
        return getClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCatalogTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCatalogDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCatalogIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogDuraType value8() {
        return getDuraType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value2(Long value) {
        setClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value3(String value) {
        setCatalogTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value4(String value) {
        setCatalogDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value5(Integer value) {
        setCatalogIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value6(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value7(Integer value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value8(EpOrganClassCatalogDuraType value) {
        setDuraType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value10(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value11(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value12(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord value13(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassCatalogRecord values(Long value1, Long value2, String value3, String value4, Integer value5, Timestamp value6, Integer value7, EpOrganClassCatalogDuraType value8, String value9, Timestamp value10, Timestamp value11, Boolean value12, Long value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpOrganClassCatalogRecord
     */
    public EpOrganClassCatalogRecord() {
        super(EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG);
    }

    /**
     * Create a detached, initialised EpOrganClassCatalogRecord
     */
    public EpOrganClassCatalogRecord(Long id, Long classId, String catalogTitle, String catalogDesc, Integer catalogIndex, Timestamp startTime, Integer duration, EpOrganClassCatalogDuraType duraType, String remark, Timestamp createAt, Timestamp updateAt, Boolean delFlag, Long version) {
        super(EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG);

        set(0, id);
        set(1, classId);
        set(2, catalogTitle);
        set(3, catalogDesc);
        set(4, catalogIndex);
        set(5, startTime);
        set(6, duration);
        set(7, duraType);
        set(8, remark);
        set(9, createAt);
        set(10, updateAt);
        set(11, delFlag);
        set(12, version);
    }
}
