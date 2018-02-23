/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpMemberChildCommentType;
import com.ep.domain.repository.domain.tables.records.EpMemberChildCommentRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 孩子上课评论表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpMemberChildComment extends TableImpl<EpMemberChildCommentRecord> {

    /**
     * The reference instance of <code>ep.ep_member_child_comment</code>
     */
    public static final EpMemberChildComment EP_MEMBER_CHILD_COMMENT = new EpMemberChildComment();
    private static final long serialVersionUID = 917947685;
    /**
     * The column <code>ep.ep_member_child_comment.id</code>. 主键
     */
    public final TableField<EpMemberChildCommentRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_member_child_comment.p_id</code>. 父级id（发起评论没有父级id，回复评论存放被回复的评论记录id）
     */
    public final TableField<EpMemberChildCommentRecord, Long> P_ID = createField("p_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "父级id（发起评论没有父级id，回复评论存放被回复的评论记录id）");
    /**
     * The column <code>ep.ep_member_child_comment.child_id</code>. 孩子id
     */
    public final TableField<EpMemberChildCommentRecord, Long> CHILD_ID = createField("child_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "孩子id");
    /**
     * The column <code>ep.ep_member_child_comment.ogn_id</code>. 机构id
     */
    public final TableField<EpMemberChildCommentRecord, Long> OGN_ID = createField("ogn_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "机构id");
    /**
     * The column <code>ep.ep_member_child_comment.course_id</code>. 课程id
     */
    public final TableField<EpMemberChildCommentRecord, Long> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "课程id");
    /**
     * The column <code>ep.ep_member_child_comment.class_id</code>. 班次id
     */
    public final TableField<EpMemberChildCommentRecord, Long> CLASS_ID = createField("class_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "班次id");
    /**
     * The column <code>ep.ep_member_child_comment.class_catelog_id</code>. 课程内容目录id
     */
    public final TableField<EpMemberChildCommentRecord, Long> CLASS_CATELOG_ID = createField("class_catelog_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "课程内容目录id");
    /**
     * The column <code>ep.ep_member_child_comment.type</code>. 评论类型: 评论；回复
     */
    public final TableField<EpMemberChildCommentRecord, EpMemberChildCommentType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpMemberChildCommentType.class), this, "评论类型: 评论；回复");
    /**
     * The column <code>ep.ep_member_child_comment.content</code>. 评论内容
     */
    public final TableField<EpMemberChildCommentRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "评论内容");
    /**
     * The column <code>ep.ep_member_child_comment.launch_member_id</code>. 发起评论者id
     */
    public final TableField<EpMemberChildCommentRecord, Long> LAUNCH_MEMBER_ID = createField("launch_member_id", org.jooq.impl.SQLDataType.BIGINT, this, "发起评论者id");
    /**
     * The column <code>ep.ep_member_child_comment.reply_member_id</code>. 回复评论者id
     */
    public final TableField<EpMemberChildCommentRecord, Long> REPLY_MEMBER_ID = createField("reply_member_id", org.jooq.impl.SQLDataType.BIGINT, this, "回复评论者id");
    /**
     * The column <code>ep.ep_member_child_comment.create_at</code>. 创建时间
     */
    public final TableField<EpMemberChildCommentRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_member_child_comment.update_at</code>. 更新时间
     */
    public final TableField<EpMemberChildCommentRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_member_child_comment.remark</code>. 备注
     */
    public final TableField<EpMemberChildCommentRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");
    /**
     * The column <code>ep.ep_member_child_comment.del_flag</code>. 删除标记
     */
    public final TableField<EpMemberChildCommentRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");
    /**
     * The column <code>ep.ep_member_child_comment.version</code>.
     */
    public final TableField<EpMemberChildCommentRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_member_child_comment</code> table reference
     */
    public EpMemberChildComment() {
        this("ep_member_child_comment", null);
    }

    /**
     * Create an aliased <code>ep.ep_member_child_comment</code> table reference
     */
    public EpMemberChildComment(String alias) {
        this(alias, EP_MEMBER_CHILD_COMMENT);
    }

    private EpMemberChildComment(String alias, Table<EpMemberChildCommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpMemberChildComment(String alias, Table<EpMemberChildCommentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "孩子上课评论表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpMemberChildCommentRecord> getRecordType() {
        return EpMemberChildCommentRecord.class;
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
    public Identity<EpMemberChildCommentRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_MEMBER_CHILD_COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpMemberChildCommentRecord> getPrimaryKey() {
        return Keys.KEY_EP_MEMBER_CHILD_COMMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpMemberChildCommentRecord>> getKeys() {
        return Arrays.<UniqueKey<EpMemberChildCommentRecord>>asList(Keys.KEY_EP_MEMBER_CHILD_COMMENT_PRIMARY, Keys.KEY_EP_MEMBER_CHILD_COMMENT_UNIQUE_CATELOG_CHILD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpMemberChildCommentRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpMemberChildComment as(String alias) {
        return new EpMemberChildComment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpMemberChildComment rename(String name) {
        return new EpMemberChildComment(name, null);
    }
}
