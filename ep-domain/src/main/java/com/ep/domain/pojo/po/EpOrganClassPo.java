/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpOrganClassStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 机构课程班次表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpOrganClassPo extends AbstractBasePojo {

    private Long id;
    private Long ognId;
    private Long courseId;
    private String className;
    private Long ognAccountId;
    private BigDecimal classPrize;
    private BigDecimal discountAmount;
    private Boolean enterLimitFlag;
    private Integer enterRequireNum;
    private Integer orderedNum;
    private Integer enteredNum;
    private Integer courseNum;
    @JsonIgnore
    private Long sort;
    private EpOrganClassStatus status;
    @JsonIgnore
    private String remark;
    @JsonIgnore
    private Timestamp createAt;
    @JsonIgnore
    private Timestamp updateAt;
    @JsonIgnore
    private Boolean delFlag;
    @JsonIgnore
    private Long version;

}
