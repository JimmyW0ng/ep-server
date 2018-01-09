/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.repository.domain.enums.EpSystemRoleTarget;

import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 角色表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpSystemRolePo implements Serializable {

    private static final long serialVersionUID = 210484246;

    private Long id;
    private EpSystemRoleTarget target;
    private String roleName;
    private String roleCode;
    private Long createBy;
    private Timestamp createAt;
    private Long updateBy;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

    public EpSystemRolePo() {
    }

    public EpSystemRolePo(EpSystemRolePo value) {
        this.id = value.id;
        this.target = value.target;
        this.roleName = value.roleName;
        this.roleCode = value.roleCode;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
        this.remark = value.remark;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public EpSystemRolePo(
            Long id,
            EpSystemRoleTarget target,
            String roleName,
            String roleCode,
            Long createBy,
            Timestamp createAt,
            Long updateBy,
            Timestamp updateAt,
            String remark,
            Boolean delFlag,
            Long version
    ) {
        this.id = id;
        this.target = target;
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.remark = remark;
        this.delFlag = delFlag;
        this.version = version;
    }

    public Long getId() {
        return this.id;
    }

    public EpSystemRolePo setId(Long id) {
        this.id = id;
        return this;
    }

    public EpSystemRoleTarget getTarget() {
        return this.target;
    }

    public EpSystemRolePo setTarget(EpSystemRoleTarget target) {
        this.target = target;
        return this;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public EpSystemRolePo setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getRoleCode() {
        return this.roleCode;
    }

    public EpSystemRolePo setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }

    public Long getCreateBy() {
        return this.createBy;
    }

    public EpSystemRolePo setCreateBy(Long createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public EpSystemRolePo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public EpSystemRolePo setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public EpSystemRolePo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public EpSystemRolePo setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Boolean getDelFlag() {
        return this.delFlag;
    }

    public EpSystemRolePo setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public EpSystemRolePo setVersion(Long version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EpSystemRolePo (");

        sb.append(id);
        sb.append(", ").append(target);
        sb.append(", ").append(roleName);
        sb.append(", ").append(roleCode);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(remark);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}