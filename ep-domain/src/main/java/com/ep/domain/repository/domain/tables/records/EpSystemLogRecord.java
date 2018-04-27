/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables.records;


import com.ep.domain.repository.domain.tables.EpSystemLog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 日志表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpSystemLogRecord extends UpdatableRecordImpl<EpSystemLogRecord> implements Record12<Long, String, String, String, Long, String, String, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = -763478183;

    /**
     * Setter for <code>ep.ep_system_log.id</code>. 编号
     */
    public EpSystemLogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.id</code>. 编号
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ep.ep_system_log.module_name</code>. 模块名称
     */
    public EpSystemLogRecord setModuleName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.module_name</code>. 模块名称
     */
    public String getModuleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ep.ep_system_log.module_desc</code>. 日志描述
     */
    public EpSystemLogRecord setModuleDesc(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.module_desc</code>. 日志描述
     */
    public String getModuleDesc() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ep.ep_system_log.remote_addr</code>. 操作IP地址
     */
    public EpSystemLogRecord setRemoteAddr(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.remote_addr</code>. 操作IP地址
     */
    public String getRemoteAddr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ep.ep_system_log.operate_id</code>. 操作者ID
     */
    public EpSystemLogRecord setOperateId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.operate_id</code>. 操作者ID
     */
    public Long getOperateId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>ep.ep_system_log.operate_name</code>. 操作者姓名
     */
    public EpSystemLogRecord setOperateName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.operate_name</code>. 操作者姓名
     */
    public String getOperateName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ep.ep_system_log.operate_method</code>. 操作方法
     */
    public EpSystemLogRecord setOperateMethod(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.operate_method</code>. 操作方法
     */
    public String getOperateMethod() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ep.ep_system_log.request_url</code>. 请求URL
     */
    public EpSystemLogRecord setRequestUrl(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.request_url</code>. 请求URL
     */
    public String getRequestUrl() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ep.ep_system_log.params</code>. 操作提交的数据
     */
    public EpSystemLogRecord setParams(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.params</code>. 操作提交的数据
     */
    public String getParams() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ep.ep_system_log.result</code>. 操作返回的结果
     */
    public EpSystemLogRecord setResult(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.result</code>. 操作返回的结果
     */
    public String getResult() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ep.ep_system_log.exception</code>. 异常信息
     */
    public EpSystemLogRecord setException(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.exception</code>. 异常信息
     */
    public String getException() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ep.ep_system_log.operate_time</code>. 操作时间
     */
    public EpSystemLogRecord setOperateTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ep.ep_system_log.operate_time</code>. 操作时间
     */
    public Timestamp getOperateTime() {
        return (Timestamp) get(11);
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
    public Row12<Long, String, String, String, Long, String, String, String, String, String, String, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, String, Long, String, String, String, String, String, String, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return EpSystemLog.EP_SYSTEM_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EpSystemLog.EP_SYSTEM_LOG.MODULE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EpSystemLog.EP_SYSTEM_LOG.MODULE_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EpSystemLog.EP_SYSTEM_LOG.REMOTE_ADDR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return EpSystemLog.EP_SYSTEM_LOG.OPERATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EpSystemLog.EP_SYSTEM_LOG.OPERATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EpSystemLog.EP_SYSTEM_LOG.OPERATE_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EpSystemLog.EP_SYSTEM_LOG.REQUEST_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EpSystemLog.EP_SYSTEM_LOG.PARAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EpSystemLog.EP_SYSTEM_LOG.RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EpSystemLog.EP_SYSTEM_LOG.EXCEPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return EpSystemLog.EP_SYSTEM_LOG.OPERATE_TIME;
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
        return getModuleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModuleDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRemoteAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getOperateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOperateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOperateMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRequestUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getOperateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value2(String value) {
        setModuleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value3(String value) {
        setModuleDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value4(String value) {
        setRemoteAddr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value5(Long value) {
        setOperateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value6(String value) {
        setOperateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value7(String value) {
        setOperateMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value8(String value) {
        setRequestUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value9(String value) {
        setParams(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value10(String value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value11(String value) {
        setException(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord value12(Timestamp value) {
        setOperateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemLogRecord values(Long value1, String value2, String value3, String value4, Long value5, String value6, String value7, String value8, String value9, String value10, String value11, Timestamp value12) {
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
     * Create a detached EpSystemLogRecord
     */
    public EpSystemLogRecord() {
        super(EpSystemLog.EP_SYSTEM_LOG);
    }

    /**
     * Create a detached, initialised EpSystemLogRecord
     */
    public EpSystemLogRecord(Long id, String moduleName, String moduleDesc, String remoteAddr, Long operateId, String operateName, String operateMethod, String requestUrl, String params, String result, String exception, Timestamp operateTime) {
        super(EpSystemLog.EP_SYSTEM_LOG);

        set(0, id);
        set(1, moduleName);
        set(2, moduleDesc);
        set(3, remoteAddr);
        set(4, operateId);
        set(5, operateName);
        set(6, operateMethod);
        set(7, requestUrl);
        set(8, params);
        set(9, result);
        set(10, exception);
        set(11, operateTime);
    }
}
