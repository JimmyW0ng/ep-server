/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpOrganCourseCourseStatus;
import com.ep.domain.repository.domain.enums.EpOrganCourseCourseType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 机构课程表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpOrganCoursePo extends AbstractBasePojo {

    private Long id;
    private Long ognId;
    private EpOrganCourseCourseType courseType;
    private Long courseCatalogId;
    private String courseName;
    private String courseIntroduce;
    private String courseContent;
    private BigDecimal prizeMin;
    private Boolean vipFlag;
    private EpOrganCourseCourseStatus courseStatus;
    private Timestamp onlineTime;
    private Timestamp enterTimeStart;
    private Timestamp enterTimeEnd;
    private Integer totalParticipate;
    private String remark;
    private Timestamp createAt;
    @JsonIgnore
    private Timestamp updateAt;
    @JsonIgnore
    private Boolean delFlag;
    @JsonIgnore
    private Long version;

}
