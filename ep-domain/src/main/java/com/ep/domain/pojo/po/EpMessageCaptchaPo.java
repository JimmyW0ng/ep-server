/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpMessageCaptchaCaptchaScene;
import com.ep.domain.repository.domain.enums.EpMessageCaptchaCaptchaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 验证码表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpMessageCaptchaPo extends AbstractBasePojo {

    private static final long serialVersionUID = -2121993756;

    private Long id;
    private EpMessageCaptchaCaptchaType captchaType;
    private Long sourceId;
    private String captchaCode;
    private String captchaContent;
    private EpMessageCaptchaCaptchaScene captchaScene;
    private Timestamp expireTime;
    private String ip;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;


}