/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpSystemUserStatus;
import com.ep.domain.repository.domain.enums.EpSystemUserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


/**
 * 平台用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpSystemUserPo extends AbstractBasePojo {

    private Long id;
    private Long mobile;
    private String userName;
    private String salt;
    private String password;
    private String email;
    private EpSystemUserType type;
    private Long ognId;
    private EpSystemUserStatus status;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
