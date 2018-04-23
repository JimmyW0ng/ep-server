/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


/**
 * 机构班级孩子表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpOrganClassChildPo extends AbstractBasePojo {

    private Long id;
    private Long classId;
    private Long childId;
    private Long orderId;
    private Integer honorNum;
    private Integer scheduleCommentNum;
    private Integer bespeakedScheduleNum;
    private Boolean courseCommentFlag;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
