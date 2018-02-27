/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.tables;


import com.ep.domain.repository.domain.Ep;
import com.ep.domain.repository.domain.Keys;
import com.ep.domain.repository.domain.enums.EpSystemMenuMenuType;
import com.ep.domain.repository.domain.enums.EpSystemMenuStatus;
import com.ep.domain.repository.domain.enums.EpSystemMenuTarget;
import com.ep.domain.repository.domain.tables.records.EpSystemMenuRecord;

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
 * 菜单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EpSystemMenu extends TableImpl<EpSystemMenuRecord> {

    private static final long serialVersionUID = -221030836;

    /**
     * The reference instance of <code>ep.ep_system_menu</code>
     */
    public static final EpSystemMenu EP_SYSTEM_MENU = new EpSystemMenu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EpSystemMenuRecord> getRecordType() {
        return EpSystemMenuRecord.class;
    }

    /**
     * The column <code>ep.ep_system_menu.id</code>. 编号
     */
    public final TableField<EpSystemMenuRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "编号");

    /**
     * The column <code>ep.ep_system_menu.parent_id</code>. 父级编号
     */
    public final TableField<EpSystemMenuRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "父级编号");

    /**
     * The column <code>ep.ep_system_menu.target</code>. 目标：前台，商户后台，系统后台
     */
    public final TableField<EpSystemMenuRecord, EpSystemMenuTarget> TARGET = createField("target", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpSystemMenuTarget.class), this, "目标：前台，商户后台，系统后台");

    /**
     * The column <code>ep.ep_system_menu.menu_type</code>. 菜单类型：分组，动作
     */
    public final TableField<EpSystemMenuRecord, EpSystemMenuMenuType> MENU_TYPE = createField("menu_type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpSystemMenuMenuType.class), this, "菜单类型：分组，动作");

    /**
     * The column <code>ep.ep_system_menu.menu_name</code>. 菜单名称
     */
    public final TableField<EpSystemMenuRecord, String> MENU_NAME = createField("menu_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "菜单名称");

    /**
     * The column <code>ep.ep_system_menu.href</code>. 链接
     */
    public final TableField<EpSystemMenuRecord, String> HREF = createField("href", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "链接");

    /**
     * The column <code>ep.ep_system_menu.icon</code>. 图标
     */
    public final TableField<EpSystemMenuRecord, String> ICON = createField("icon", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "图标");

    /**
     * The column <code>ep.ep_system_menu.sort</code>. 排序（升序）
     */
    public final TableField<EpSystemMenuRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "排序（升序）");

    /**
     * The column <code>ep.ep_system_menu.status</code>. 状态
     */
    public final TableField<EpSystemMenuRecord, EpSystemMenuStatus> STATUS = createField("status", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.ep.domain.repository.domain.enums.EpSystemMenuStatus.class), this, "状态");

    /**
     * The column <code>ep.ep_system_menu.permission</code>. 权限标识
     */
    public final TableField<EpSystemMenuRecord, String> PERMISSION = createField("permission", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "权限标识");

    /**
     * The column <code>ep.ep_system_menu.create_at</code>. 创建时间
     */
    public final TableField<EpSystemMenuRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ep.ep_system_menu.update_at</code>. 更新时间
     */
    public final TableField<EpSystemMenuRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ep.ep_system_menu.remark</code>. 备注信息
     */
    public final TableField<EpSystemMenuRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "备注信息");

    /**
     * The column <code>ep.ep_system_menu.del_flag</code>. 删除标记
     */
    public final TableField<EpSystemMenuRecord, Boolean> DEL_FLAG = createField("del_flag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "删除标记");

    /**
     * The column <code>ep.ep_system_menu.version</code>.
     */
    public final TableField<EpSystemMenuRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>ep.ep_system_menu</code> table reference
     */
    public EpSystemMenu() {
        this("ep_system_menu", null);
    }

    /**
     * Create an aliased <code>ep.ep_system_menu</code> table reference
     */
    public EpSystemMenu(String alias) {
        this(alias, EP_SYSTEM_MENU);
    }

    private EpSystemMenu(String alias, Table<EpSystemMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private EpSystemMenu(String alias, Table<EpSystemMenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "菜单表");
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
    public Identity<EpSystemMenuRecord, Long> getIdentity() {
        return Keys.IDENTITY_EP_SYSTEM_MENU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EpSystemMenuRecord> getPrimaryKey() {
        return Keys.KEY_EP_SYSTEM_MENU_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EpSystemMenuRecord>> getKeys() {
        return Arrays.<UniqueKey<EpSystemMenuRecord>>asList(Keys.KEY_EP_SYSTEM_MENU_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<EpSystemMenuRecord, Long> getRecordVersion() {
        return VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EpSystemMenu as(String alias) {
        return new EpSystemMenu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EpSystemMenu rename(String name) {
        return new EpSystemMenu(name, null);
    }
}
