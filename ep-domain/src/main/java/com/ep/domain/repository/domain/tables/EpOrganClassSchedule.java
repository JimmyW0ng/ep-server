/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpOrganClassScheduleScheduleStatus;
import com.ep.domain.repository.domain.tables.records.EpOrganClassScheduleRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 机构行程信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpOrganClassSchedule extends TableImpl<EpOrganClassScheduleRecord> {

    private static final long serialVersionUID = -1684027140;

    /**
     * The reference instance of <code>ep.ep_organ_class_schedule</code>
     */
    public static final EpOrganClassSchedule EP_ORGAN_CLASS_SCHEDULE = new EpOrganClassSchedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganClassScheduleRecord> getRecordType() {
        return EpOrganClassScheduleRecord.class;
    }

    /**
     * The column <code>ep.ep_organ_class_schedule.id</code>. 主键
     */
    public final TableField<EpOrganClassScheduleRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>ep.ep_organ_class_schedule.class_id</code>. 班级id
     */
    public final TableField<EpOrganClassScheduleRecord, Long> CLASS_ID = createField("class_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "班级id");

    /**
     * The column <code>ep.ep_organ_class_schedule.class_catelog_id</code>. 班次课程内容目录id
     */
    public final TableField<EpOrganClassScheduleRecord, Long> CLASS_CATELOG_ID = createField("class_catelog_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "班次课程内容目录id");

    /**
     * The column <code>ep.ep_organ_class_schedule.child_id</code>. 孩子id
     */
    public final TableField<EpOrganClassScheduleRecord, Long> CHILD_ID = createField("child_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "孩子id");

    /**
     * The column <code>ep.ep_organ_class_schedule.schedule_status</code>. 行程状态：带开课；正常；迟到；缺席；请假
     */
    public final TableField<EpOrganClassScheduleRecord, EpOrganClassScheduleScheduleStatus> SCHEDULE_STATUS = createField("schedule_status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpOrganClassScheduleScheduleStatus.class), this, "行程状态：带开课；正常；迟到；缺席；请假");

    /**
     * The column <code>ep.ep_organ_class_schedule.create_at</code>. 创建时间
     */
    public final TableField<EpOrganClassScheduleRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_organ_class_schedule.update_at</code>. 更新时间
     */
    public final TableField<EpOrganClassScheduleRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_organ_class_schedule.remark</code>. 备注
     */
    public final TableField<EpOrganClassScheduleRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");

    /**
     * The column <code>ep.ep_organ_class_schedule.del_flag</code>. 删除标记
     */
    public final TableField<EpOrganClassScheduleRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>ep.ep_organ_class_schedule.version</code>.
     */
    public final TableField<EpOrganClassScheduleRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ_class_schedule</code> table reference
     */
    public EpOrganClassSchedule() {
        this("ep_organ_class_schedule", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ_class_schedule</code> table reference
     */
    public EpOrganClassSchedule(String alias) {
        this(alias, EP_ORGAN_CLASS_SCHEDULE);
    }

    private EpOrganClassSchedule(String alias, Table<EpOrganClassScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrganClassSchedule(String alias, Table<EpOrganClassScheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构行程信息表");
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
    public Identity<EpOrganClassScheduleRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN_CLASS_SCHEDULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganClassScheduleRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_CLASS_SCHEDULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganClassScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganClassScheduleRecord>>asList(Keys.KEY_EP_ORGAN_CLASS_SCHEDULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganClassScheduleRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassSchedule as(String alias) {
        return new EpOrganClassSchedule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrganClassSchedule rename(String name) {
        return new EpOrganClassSchedule(name, null);
    }
}
