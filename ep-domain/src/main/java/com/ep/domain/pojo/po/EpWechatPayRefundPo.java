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
 * 微信支付退单表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpWechatPayRefundPo extends AbstractBasePojo {

    private Long id;
    private String appid;
    private String mchId;
    private String outTradeNo;
    private String transactionId;
    private String outRefundNo;
    private Integer totalFee;
    private Integer refundFee;
    private String refundDesc;
    private String returnCode;
    private String returnMsg;
    private String resultCode;
    private String errCode;
    private String errCodeDes;
    private String refundId;
    private String notifyReturnCode;
    private String notifyReturnMsg;
    private String refundStatus;
    private Integer settlementTotalFee;
    private Integer settlementRefundFee;
    private String successTime;
    private String refundRecvAccout;
    private String refundAccount;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;

}
