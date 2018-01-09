/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import com.ep.domain.repository.domain.enums.EpOrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 订单表
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
public class EpOrderPo extends AbstractBasePojo {

    private static final long serialVersionUID = -1134380001;

    private Long id;
    private Long memberId;
    private Long childId;
    private Long ognId;
    private Long courseId;
    private Long skuId;
    private EpOrderStatus status;
    private Timestamp authTime;
    private Timestamp cancelTime;
    private Long childVersion;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;


}
