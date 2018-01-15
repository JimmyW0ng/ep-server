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
 * 微信会话token表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpWechatSessionTokenPo extends AbstractBasePojo {

    private Long id;
    private String sessionToken;
    private String openId;
    private String sessionKey;
    private String remarks;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Boolean delFlag;
    private Long version;

}
