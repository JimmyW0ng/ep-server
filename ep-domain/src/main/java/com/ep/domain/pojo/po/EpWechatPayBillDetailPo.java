/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * 微信支付对账明细表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpWechatPayBillDetailPo extends AbstractBasePojo {

    private Long id;
    private Long ognId;
    private Long courseId;
    private Long classId;
    private Long orderId;
    private String transactionTime;
    private String appid;
    private String mchId;
    private String subMchId;
    private String deviceNo;
    private String transactionId;
    private String outTradeNo;
    private String openid;
    private String tradeType;
    private String tradeState;
    private String bankType;
    private String feeType;
    private BigDecimal totalFee;
    private BigDecimal couponFee;
    private String refundId;
    private String outRefundNo;
    private BigDecimal refundFee;
    private BigDecimal refundCouponFee;
    private String refundType;
    private String refundStatus;
    private String body;
    private String attach;
    private BigDecimal poundage;
    private String poundageRate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
