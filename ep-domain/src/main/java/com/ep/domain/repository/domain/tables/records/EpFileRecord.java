/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.tables.EpFile;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpFileRecord extends UpdatableRecordImpl<EpFileRecord> implements Record12<Long, String, String, String, Short, Long, Integer, Timestamp, Timestamp, String, Boolean, Long> {

    private static final long serialVersionUID = 1123468783;

    /**
     * Setter for <code>ep.ep_file.id</code>. 主键
     */
    public EpFileRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_file.pre_code</code>. 预授码
     */
    public EpFileRecord setPreCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Create a detached EpFileRecord
     */
    public EpFileRecord() {
        super(EpFile.EP_FILE);
    }

    /**
     * Setter for <code>ep.ep_file.file_name</code>. 文件名字
     */
    public EpFileRecord setFileName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Create a detached, initialised EpFileRecord
     */
    public EpFileRecord(Long id, String preCode, String fileName, String fileUrl, Short bizTypeCode, Long sourceId, Integer sort, Timestamp createAt, Timestamp updateAt, String remark, Boolean delFlag, Long version) {
        super(EpFile.EP_FILE);

        set(0, id);
        set(1, preCode);
        set(2, fileName);
        set(3, fileUrl);
        set(4, bizTypeCode);
        set(5, sourceId);
        set(6, sort);
        set(7, createAt);
        set(8, updateAt);
        set(9, remark);
        set(10, delFlag);
        set(11, version);
    }

    /**
     * Setter for <code>ep.ep_file.file_url</code>. 文件url
     */
    public EpFileRecord setFileUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.pre_code</code>. 预授码
     */
    public String getPreCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ep.ep_file.biz_type_code</code>. 业务类型编码（FILE_BIZ_TYPE）
     */
    public EpFileRecord setBizTypeCode(Short value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.file_name</code>. 文件名字
     */
    public String getFileName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_file.source_id</code>. 业务ID
     */
    public EpFileRecord setSourceId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.file_url</code>. 文件url
     */
    public String getFileUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_file.sort</code>. 排序
     */
    public EpFileRecord setSort(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.biz_type_code</code>. 业务类型编码（FILE_BIZ_TYPE）
     */
    public Short getBizTypeCode() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>ep.ep_file.create_at</code>. 创建时间
     */
    public EpFileRecord setCreateAt(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.source_id</code>. 业务ID
     */
    public Long getSourceId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>ep.ep_file.update_at</code>. 更新时间
     */
    public EpFileRecord setUpdateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ep.ep_file.remark</code>. 备注信息
     */
    public EpFileRecord setRemark(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ep.ep_file.del_flag</code>. 删除标志
     */
    public EpFileRecord setDelFlag(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_file.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Getter for <code>ep.ep_file.remark</code>. 备注信息
     */
    public String getRemark() {
        return (String) get(9);
    }

    /**
     * Getter for <code>ep.ep_file.version</code>.
     */
    public Long getVersion() {
        return (Long) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, String, Short, Long, Integer, Timestamp, Timestamp, String, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, String, Short, Long, Integer, Timestamp, Timestamp, String, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * Getter for <code>ep.ep_file.del_flag</code>. 删除标志
     */
    public Boolean getDelFlag() {
        return (Boolean) get(10);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EpFile.EP_FILE.PRE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpFile.EP_FILE.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpFile.EP_FILE.FILE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return EpFile.EP_FILE.BIZ_TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return EpFile.EP_FILE.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return EpFile.EP_FILE.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return EpFile.EP_FILE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EpFile.EP_FILE.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EpFile.EP_FILE.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return EpFile.EP_FILE.DEL_FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return EpFile.EP_FILE.VERSION;
    }

    /**
     * Setter for <code>ep.ep_file.version</code>.
     */
    public EpFileRecord setVersion(Long value) {
        set(11, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPreCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFileUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getBizTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getDelFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpFile.EP_FILE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value2(String value) {
        setPreCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value3(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value4(String value) {
        setFileUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value5(Short value) {
        setBizTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value6(Long value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value7(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value8(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value9(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value10(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value11(Boolean value) {
        setDelFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord value12(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpFileRecord values(Long value1, String value2, String value3, String value4, Short value5, Long value6, Integer value7, Timestamp value8, Timestamp value9, String value10, Boolean value11, Long value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

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
    public Long value12() {
        return getVersion();
    }
}
