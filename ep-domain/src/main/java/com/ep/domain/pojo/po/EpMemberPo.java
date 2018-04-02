/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpMemberSex;
import com.ep.domain.repository.domain.enums.EpMemberStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


/**
 * 会员信息表
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EpMemberPo extends AbstractBasePojo {

    private Long id;
    private Long mobile;
    private String nickName;
    private String trueName;
    private EpMemberSex sex;
    private String email;
    @JsonIgnore
    private EpMemberStatus status;
    private String channel;
    @JsonIgnore
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
