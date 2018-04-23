/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpMemberMessageStatus;
import com.ep.domain.repository.domain.enums.EpMemberMessageType;
import com.ep.domain.repository.domain.tables.records.EpMemberMessageRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 会员消息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpMemberMessage extends TableImpl<EpMemberMessageRecord> {

    private static final long serialVersionUID = 609575315;

    /**
     * The reference instance of <code>ep.ep_member_message</code>
     */
    public static final EpMemberMessage EP_MEMBER_MESSAGE = new EpMemberMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpMemberMessageRecord> getRecordType() {
        return EpMemberMessageRecord.class;
    }

    /**
     * The column <code>ep.ep_member_message.id</code>.
     */
    public final TableField<EpMemberMessageRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>ep.ep_member_message.sender_ogn_account_id</code>. 发件人对应机构账户id
     */
    public final TableField<EpMemberMessageRecord, Long> SENDER_OGN_ACCOUNT_ID = createField("sender_ogn_account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "发件人对应机构账户id");

    /**
     * The column <code>ep.ep_member_message.sender_name</code>. 发件人姓名
     */
    public final TableField<EpMemberMessageRecord, String> SENDER_NAME = createField("sender_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "发件人姓名");

    /**
     * The column <code>ep.ep_member_message.sender_desc</code>. 发件人描述
     */
    public final TableField<EpMemberMessageRecord, String> SENDER_DESC = createField("sender_desc", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "发件人描述");

    /**
     * The column <code>ep.ep_member_message.member_id</code>. 会员id
     */
    public final TableField<EpMemberMessageRecord, Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "会员id");

    /**
     * The column <code>ep.ep_member_message.child_id</code>. 孩子id
     */
    public final TableField<EpMemberMessageRecord, Long> CHILD_ID = createField("child_id", org.jooq.impl.SQLDataType.BIGINT, this, "孩子id");

    /**
     * The column <code>ep.ep_member_message.type</code>. 类型：随堂评价
     */
    public final TableField<EpMemberMessageRecord, EpMemberMessageType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpMemberMessageType.class), this, "类型：随堂评价");

    /**
     * The column <code>ep.ep_member_message.status</code>. 状态：未读；已读；
     */
    public final TableField<EpMemberMessageRecord, EpMemberMessageStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpMemberMessageStatus.class), this, "状态：未读；已读；");

    /**
     * The column <code>ep.ep_member_message.content</code>. 消息内容
     */
    public final TableField<EpMemberMessageRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(3000).nullable(false), this, "消息内容");

    /**
     * The column <code>ep.ep_member_message.source_id</code>. 业务id
     */
    public final TableField<EpMemberMessageRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "业务id");

    /**
     * The column <code>ep.ep_member_message.create_at</code>. 创建时间
     */
    public final TableField<EpMemberMessageRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_member_message.update_at</code>. 更新时间
     */
    public final TableField<EpMemberMessageRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_member_message.remark</code>. 备注
     */
    public final TableField<EpMemberMessageRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * The column <code>ep.ep_member_message.del_flag</code>. 删除标记
     */
    public final TableField<EpMemberMessageRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>ep.ep_member_message.version</code>.
     */
    public final TableField<EpMemberMessageRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_member_message</code> table reference
     */
    public EpMemberMessage() {
        this("ep_member_message", null);
    }

    /**
     * Create an aliased <code>ep.ep_member_message</code> table reference
     */
    public EpMemberMessage(String alias) {
        this(alias, EP_MEMBER_MESSAGE);
    }

    private EpMemberMessage(String alias, Table<EpMemberMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpMemberMessage(String alias, Table<EpMemberMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "会员消息表");
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
    public Identity<EpMemberMessageRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_MEMBER_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpMemberMessageRecord> getPrimaryKey() {
        return Keys.KEY_EP_MEMBER_MESSAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpMemberMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<EpMemberMessageRecord>>asList(Keys.KEY_EP_MEMBER_MESSAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpMemberMessageRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberMessage as(String alias) {
        return new EpMemberMessage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpMemberMessage rename(String name) {
        return new EpMemberMessage(name, null);
    }
}
