/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.tables.records.EpOrganClassScheduleConfigRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 机构班级行程配置表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpOrganClassScheduleConfig extends TableImpl<EpOrganClassScheduleConfigRecord> {

    /**
     * The reference instance of <code>ep.ep_organ_class_schedule_config</code>
     */
    public static final EpOrganClassScheduleConfig EP_ORGAN_CLASS_SCHEDULE_CONFIG = new EpOrganClassScheduleConfig();
    private static final long serialVersionUID = 200481867;
    /**
     * The column <code>ep.ep_organ_class_schedule_config.id</code>. 主键
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.class_id</code>. 班级id
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Long> CLASS_ID = createField("class_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "班级id");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.catelog_id</code>. 课程sku目录id
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Long> CATELOG_ID = createField("catelog_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "课程sku目录id");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.start_time</code>. 开始时间
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "开始时间");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.end_time</code>. 结束时间
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "结束时间");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.create_at</code>. 创建时间
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.update_at</code>. 更新时间
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.remark</code>. 备注
     */
    public final TableField<EpOrganClassScheduleConfigRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.del_flag</code>. 删除标记
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");
    /**
     * The column <code>ep.ep_organ_class_schedule_config.version</code>.
     */
    public final TableField<EpOrganClassScheduleConfigRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>ep.ep_organ_class_schedule_config</code> table reference
     */
    public EpOrganClassScheduleConfig() {
        this("ep_organ_class_schedule_config", null);
    }

    /**
     * Create an aliased <code>ep.ep_organ_class_schedule_config</code> table reference
     */
    public EpOrganClassScheduleConfig(String alias) {
        this(alias, EP_ORGAN_CLASS_SCHEDULE_CONFIG);
    }

    private EpOrganClassScheduleConfig(String alias, Table<EpOrganClassScheduleConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpOrganClassScheduleConfig(String alias, Table<EpOrganClassScheduleConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "机构班级行程配置表");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpOrganClassScheduleConfigRecord> getRecordType() {
        return EpOrganClassScheduleConfigRecord.class;
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
    public Identity<EpOrganClassScheduleConfigRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_ORGAN_CLASS_SCHEDULE_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpOrganClassScheduleConfigRecord> getPrimaryKey() {
        return Keys.KEY_EP_ORGAN_CLASS_SCHEDULE_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpOrganClassScheduleConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<EpOrganClassScheduleConfigRecord>>asList(Keys.KEY_EP_ORGAN_CLASS_SCHEDULE_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpOrganClassScheduleConfigRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpOrganClassScheduleConfig as(String alias) {
        return new EpOrganClassScheduleConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpOrganClassScheduleConfig rename(String name) {
        return new EpOrganClassScheduleConfig(name, null);
    }
}