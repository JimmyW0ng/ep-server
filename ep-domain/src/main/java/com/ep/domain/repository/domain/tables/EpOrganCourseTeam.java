/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.tables.records.EpOrganCourseTeamRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 机构课程团队信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrganCourseTeam extends TableImpl<EpOrganCourseTeamRecord> {

    private static final long serialVersionUID = -2024624682;

    /**
     * The reference instance of <code>ep.ep_organ_course_team</code>
     */
    public static final EpOrganCourseTeam EP_ORGAN_COURSE_TEAM = new EpOrganCourseTeam();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganCourseTeamRecord> getRecordType() {
        return EpOrganCourseTeamRecord.class;
    }

    /**
     * The column <code>ep.ep_organ_course_team.id</code>. 主键
     */
    public final TableField<EpOrganCourseTeamRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>ep.ep_organ_course_team.course_id</code>. 课程id
     */
    public final TableField<EpOrganCourseTeamRecord, Long> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "课程id");

    /**
     * The column <code>ep.ep_organ_course_team.ogn_account_id</code>. 机构账户id
     */
    public final TableField<EpOrganCourseTeamRecord, Long> OGN_ACCOUNT_ID = createField("ogn_account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "机构账户id");

    /**
     * The column <code>ep.ep_organ_course_team.sort</code>. 排序
     */
    public final TableField<EpOrganCourseTeamRecord, Long> SORT = createField("sort", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "排序");

    /**
     * The column <code>ep.ep_organ_course_team.create_at</code>. 创建时间
     */
    public final TableField<EpOrganCourseTeamRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_organ_course_team.update_at</code>. 更新时间
     */
    public final TableField<EpOrganCourseTeamRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_organ_course_team.remark</code>. 备注
     */
    public final TableField<EpOrganCourseTeamRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * The column <code>ep.ep_organ_course_team.del_flag</code>. 删除标记
     */
    public final TableField<EpOrganCourseTeamRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>ep.ep_organ_course_team.version</code>.
     */
    public final TableField<EpOrganCourseTeamRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ_course_team</code> table reference
     */
    public EpOrganCourseTeam() {
        this("ep_organ_course_team", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ_course_team</code> table reference
     */
    public EpOrganCourseTeam(String alias) {
        this(alias, EP_ORGAN_COURSE_TEAM);
    }

    private EpOrganCourseTeam(String alias, Table<EpOrganCourseTeamRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrganCourseTeam(String alias, Table<EpOrganCourseTeamRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构课程团队信息表");
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
    public Identity<EpOrganCourseTeamRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN_COURSE_TEAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganCourseTeamRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_COURSE_TEAM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganCourseTeamRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganCourseTeamRecord>>asList(Keys.KEY_EP_ORGAN_COURSE_TEAM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganCourseTeamRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganCourseTeam as(String alias) {
        return new EpOrganCourseTeam(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrganCourseTeam rename(String name) {
        return new EpOrganCourseTeam(name, null);
    }
}
