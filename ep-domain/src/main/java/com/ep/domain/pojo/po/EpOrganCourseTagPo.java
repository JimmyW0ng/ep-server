/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 课程标签表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EpOrganCourseTagPo implements Serializable {

    private static final long serialVersionUID = 1580452626;

    private Long id;
    private Long courseId;
    private String tagName;
    private Byte tagLevel;
    private Long sort;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

    public EpOrganCourseTagPo() {
    }

    public EpOrganCourseTagPo(EpOrganCourseTagPo value) {
        this.id = value.id;
        this.courseId = value.courseId;
        this.tagName = value.tagName;
        this.tagLevel = value.tagLevel;
        this.sort = value.sort;
        this.createAt = value.createAt;
        this.updateAt = value.updateAt;
        this.remark = value.remark;
        this.delFlag = value.delFlag;
        this.version = value.version;
    }

    public EpOrganCourseTagPo(
            Long id,
            Long courseId,
            String tagName,
            Byte tagLevel,
            Long sort,
            Timestamp createAt,
            Timestamp updateAt,
            String remark,
            Boolean delFlag,
            Long version
    ) {
        this.id = id;
        this.courseId = courseId;
        this.tagName = tagName;
        this.tagLevel = tagLevel;
        this.sort = sort;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.remark = remark;
        this.delFlag = delFlag;
        this.version = version;
    }

    public Long getId() {
        return this.id;
    }

    public EpOrganCourseTagPo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCourseId() {
        return this.courseId;
    }

    public EpOrganCourseTagPo setCourseId(Long courseId) {
        this.courseId = courseId;
        return this;
    }

    public String getTagName() {
        return this.tagName;
    }

    public EpOrganCourseTagPo setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public Byte getTagLevel() {
        return this.tagLevel;
    }

    public EpOrganCourseTagPo setTagLevel(Byte tagLevel) {
        this.tagLevel = tagLevel;
        return this;
    }

    public Long getSort() {
        return this.sort;
    }

    public EpOrganCourseTagPo setSort(Long sort) {
        this.sort = sort;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public EpOrganCourseTagPo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public EpOrganCourseTagPo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public EpOrganCourseTagPo setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Boolean getDelFlag() {
        return this.delFlag;
    }

    public EpOrganCourseTagPo setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public EpOrganCourseTagPo setVersion(Long version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EpOrganCourseTagPo (");

        sb.append(id);
        sb.append(", ").append(courseId);
        sb.append(", ").append(tagName);
        sb.append(", ").append(tagLevel);
        sb.append(", ").append(sort);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(remark);
        sb.append(", ").append(delFlag);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
