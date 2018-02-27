/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpMemberMessageStatus;
import com.ep.domain.repository.domain.enums.EpMemberMessageType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


/**
 * 会员消息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpMemberMessagePo extends AbstractBasePojo {

    private Long id;
    private Long senderId;
    private String senderName;
    private String senderDesc;
    private Long memberId;
    private Long childId;
    private EpMemberMessageType type;
    private EpMemberMessageStatus status;
    private String content;
    @JsonIgnore
    private Long sourceId;
    private String sourseDesc;
    private Timestamp createAt;
    @JsonIgnore
    private Timestamp updateAt;
    @JsonIgnore
    private String remark;
    @JsonIgnore
    private Boolean delFlag;
    @JsonIgnore
    private Long version;

}
