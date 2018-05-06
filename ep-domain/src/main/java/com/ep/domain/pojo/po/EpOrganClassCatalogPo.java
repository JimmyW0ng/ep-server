/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpOrganClassCatalogDuraType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


/**
 * 班次课程内容目录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpOrganClassCatalogPo extends AbstractBasePojo {

    private Long id;
    private Long classId;
    private String catalogTitle;
    private String catalogDesc;
    private Integer catalogIndex;
    private Timestamp startTime;
    private Integer duration;
    private EpOrganClassCatalogDuraType duraType;
    private Timestamp endTime;
    private String remark;
    private Timestamp createAt;
    @JsonIgnore
    private Timestamp updateAt;
    @JsonIgnore
    private Boolean delFlag;
    @JsonIgnore
    private Long version;

}
