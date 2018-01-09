/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpMemberSex;
import com.ep.domain.repository.domain.enums.EpMemberStatus;
import com.ep.domain.repository.domain.enums.EpMemberType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 会员信息表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EpMemberPo extends AbstractBasePojo {

    private static final long serialVersionUID = -1064335549;

    private Long id;
    private Long mobile;
    private String nickName;
    private String trueName;
    private EpMemberSex sex;
    private String email;
    private EpMemberStatus status;
    private EpMemberType type;
    private String role;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;


}
