/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain;


import com.ep.domain.repository.domain.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ep extends SchemaImpl {

    private static final long serialVersionUID = 338074227;

    /**
     * The reference instance of <code>ep</code>
     */
    public static final Ep EP = new Ep();

    /**
     * 课程类目表
     */
    public final EpConstantCatalog EP_CONSTANT_CATALOG = com.ep.domain.repository.domain.tables.EpConstantCatalog.EP_CONSTANT_CATALOG;

    /**
     * 地区表
     */
    public final EpConstantRegion EP_CONSTANT_REGION = com.ep.domain.repository.domain.tables.EpConstantRegion.EP_CONSTANT_REGION;

    /**
     * 标签表
     */
    public final EpConstantTag EP_CONSTANT_TAG = com.ep.domain.repository.domain.tables.EpConstantTag.EP_CONSTANT_TAG;

    /**
     * 文件表
     */
    public final EpFile EP_FILE = com.ep.domain.repository.domain.tables.EpFile.EP_FILE;

    /**
     * 会员信息表
     */
    public final EpMember EP_MEMBER = com.ep.domain.repository.domain.tables.EpMember.EP_MEMBER;

    /**
     * 孩子信息表
     */
    public final EpMemberChild EP_MEMBER_CHILD = com.ep.domain.repository.domain.tables.EpMemberChild.EP_MEMBER_CHILD;

    /**
     * 孩子上课评论表
     */
    public final EpMemberChildComment EP_MEMBER_CHILD_COMMENT = com.ep.domain.repository.domain.tables.EpMemberChildComment.EP_MEMBER_CHILD_COMMENT;

    /**
     * 孩子荣誉表
     */
    public final EpMemberChildHonor EP_MEMBER_CHILD_HONOR = com.ep.domain.repository.domain.tables.EpMemberChildHonor.EP_MEMBER_CHILD_HONOR;

    /**
     * 孩子签名表
     */
    public final EpMemberChildSign EP_MEMBER_CHILD_SIGN = com.ep.domain.repository.domain.tables.EpMemberChildSign.EP_MEMBER_CHILD_SIGN;

    /**
     * 孩子标签记录表
     */
    public final EpMemberChildTag EP_MEMBER_CHILD_TAG = com.ep.domain.repository.domain.tables.EpMemberChildTag.EP_MEMBER_CHILD_TAG;

    /**
     * 会员消息表
     */
    public final EpMemberMessage EP_MEMBER_MESSAGE = com.ep.domain.repository.domain.tables.EpMemberMessage.EP_MEMBER_MESSAGE;

    /**
     * 验证码表
     */
    public final EpMessageCaptcha EP_MESSAGE_CAPTCHA = com.ep.domain.repository.domain.tables.EpMessageCaptcha.EP_MESSAGE_CAPTCHA;

    /**
     * 订单表
     */
    public final EpOrder EP_ORDER = com.ep.domain.repository.domain.tables.EpOrder.EP_ORDER;

    /**
     * 订单退款申请表
     */
    public final EpOrderRefund EP_ORDER_REFUND = com.ep.domain.repository.domain.tables.EpOrderRefund.EP_ORDER_REFUND;

    /**
     * 机构信息表
     */
    public final EpOrgan EP_ORGAN = com.ep.domain.repository.domain.tables.EpOrgan.EP_ORGAN;

    /**
     * 机构账户关联信息表
     */
    public final EpOrganAccount EP_ORGAN_ACCOUNT = com.ep.domain.repository.domain.tables.EpOrganAccount.EP_ORGAN_ACCOUNT;

    /**
     * 机构类目表
     */
    public final EpOrganCatalog EP_ORGAN_CATALOG = com.ep.domain.repository.domain.tables.EpOrganCatalog.EP_ORGAN_CATALOG;

    /**
     * 机构课程班次表
     */
    public final EpOrganClass EP_ORGAN_CLASS = com.ep.domain.repository.domain.tables.EpOrganClass.EP_ORGAN_CLASS;

    /**
     * 班次课程内容目录表
     */
    public final EpOrganClassCatalog EP_ORGAN_CLASS_CATALOG = com.ep.domain.repository.domain.tables.EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG;

    /**
     * 机构班级孩子表
     */
    public final EpOrganClassChild EP_ORGAN_CLASS_CHILD = com.ep.domain.repository.domain.tables.EpOrganClassChild.EP_ORGAN_CLASS_CHILD;

    /**
     * 机构课程班次评分表
     */
    public final EpOrganClassComment EP_ORGAN_CLASS_COMMENT = com.ep.domain.repository.domain.tables.EpOrganClassComment.EP_ORGAN_CLASS_COMMENT;

    /**
     * 班次行程表
     */
    public final EpOrganClassSchedule EP_ORGAN_CLASS_SCHEDULE = com.ep.domain.repository.domain.tables.EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE;

    /**
     * 机构配置表
     */
    public final EpOrganConfig EP_ORGAN_CONFIG = com.ep.domain.repository.domain.tables.EpOrganConfig.EP_ORGAN_CONFIG;

    /**
     * 机构课程表
     */
    public final EpOrganCourse EP_ORGAN_COURSE = com.ep.domain.repository.domain.tables.EpOrganCourse.EP_ORGAN_COURSE;

    /**
     * 课程标签表
     */
    public final EpOrganCourseTag EP_ORGAN_COURSE_TAG = com.ep.domain.repository.domain.tables.EpOrganCourseTag.EP_ORGAN_COURSE_TAG;

    /**
     * 机构课程团队信息表
     */
    public final EpOrganCourseTeam EP_ORGAN_COURSE_TEAM = com.ep.domain.repository.domain.tables.EpOrganCourseTeam.EP_ORGAN_COURSE_TEAM;

    /**
     * 机构会员信息表
     */
    public final EpOrganVip EP_ORGAN_VIP = com.ep.domain.repository.domain.tables.EpOrganVip.EP_ORGAN_VIP;

    /**
     * 鉴权表
     */
    public final EpSystemClient EP_SYSTEM_CLIENT = com.ep.domain.repository.domain.tables.EpSystemClient.EP_SYSTEM_CLIENT;

    /**
     * 字典表
     */
    public final EpSystemDict EP_SYSTEM_DICT = com.ep.domain.repository.domain.tables.EpSystemDict.EP_SYSTEM_DICT;

    /**
     * 日志表
     */
    public final EpSystemLog EP_SYSTEM_LOG = com.ep.domain.repository.domain.tables.EpSystemLog.EP_SYSTEM_LOG;

    /**
     * 菜单表
     */
    public final EpSystemMenu EP_SYSTEM_MENU = com.ep.domain.repository.domain.tables.EpSystemMenu.EP_SYSTEM_MENU;

    /**
     * 角色表
     */
    public final EpSystemRole EP_SYSTEM_ROLE = com.ep.domain.repository.domain.tables.EpSystemRole.EP_SYSTEM_ROLE;

    /**
     * 角色权限表
     */
    public final EpSystemRoleAuthority EP_SYSTEM_ROLE_AUTHORITY = com.ep.domain.repository.domain.tables.EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY;

    /**
     * 平台用户表
     */
    public final EpSystemUser EP_SYSTEM_USER = com.ep.domain.repository.domain.tables.EpSystemUser.EP_SYSTEM_USER;

    /**
     * 用户-角色
     */
    public final EpSystemUserRole EP_SYSTEM_USER_ROLE = com.ep.domain.repository.domain.tables.EpSystemUserRole.EP_SYSTEM_USER_ROLE;

    /**
     * token表
     */
    public final EpToken EP_TOKEN = com.ep.domain.repository.domain.tables.EpToken.EP_TOKEN;

    /**
     * 微信form提交关联表
     */
    public final EpWechatForm EP_WECHAT_FORM = com.ep.domain.repository.domain.tables.EpWechatForm.EP_WECHAT_FORM;

    /**
     * 公众号关联表
     */
    public final EpWechatOpenid EP_WECHAT_OPENID = com.ep.domain.repository.domain.tables.EpWechatOpenid.EP_WECHAT_OPENID;

    /**
     * 微信支付对账表
     */
    public final EpWechatPayBill EP_WECHAT_PAY_BILL = com.ep.domain.repository.domain.tables.EpWechatPayBill.EP_WECHAT_PAY_BILL;

    /**
     * 微信支付对账明细表
     */
    public final EpWechatPayBillDetail EP_WECHAT_PAY_BILL_DETAIL = com.ep.domain.repository.domain.tables.EpWechatPayBillDetail.EP_WECHAT_PAY_BILL_DETAIL;

    /**
     * 微信支付退单表
     */
    public final EpWechatPayRefund EP_WECHAT_PAY_REFUND = com.ep.domain.repository.domain.tables.EpWechatPayRefund.EP_WECHAT_PAY_REFUND;

    /**
     * 微信支付提现申请
     */
    public final EpWechatPayWithdraw EP_WECHAT_PAY_WITHDRAW = com.ep.domain.repository.domain.tables.EpWechatPayWithdraw.EP_WECHAT_PAY_WITHDRAW;

    /**
     * 微信支付提现明细表
     */
    public final EpWechatPayWithdrawDetail EP_WECHAT_PAY_WITHDRAW_DETAIL = com.ep.domain.repository.domain.tables.EpWechatPayWithdrawDetail.EP_WECHAT_PAY_WITHDRAW_DETAIL;

    /**
     * 微信支付统一订单
     */
    public final EpWechatUnifiedOrder EP_WECHAT_UNIFIED_ORDER = com.ep.domain.repository.domain.tables.EpWechatUnifiedOrder.EP_WECHAT_UNIFIED_ORDER;

    /**
     * No further instances allowed
     */
    private Ep() {
        super("ep", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            EpConstantCatalog.EP_CONSTANT_CATALOG,
            EpConstantRegion.EP_CONSTANT_REGION,
            EpConstantTag.EP_CONSTANT_TAG,
            EpFile.EP_FILE,
            EpMember.EP_MEMBER,
            EpMemberChild.EP_MEMBER_CHILD,
            EpMemberChildComment.EP_MEMBER_CHILD_COMMENT,
            EpMemberChildHonor.EP_MEMBER_CHILD_HONOR,
            EpMemberChildSign.EP_MEMBER_CHILD_SIGN,
            EpMemberChildTag.EP_MEMBER_CHILD_TAG,
            EpMemberMessage.EP_MEMBER_MESSAGE,
            EpMessageCaptcha.EP_MESSAGE_CAPTCHA,
            EpOrder.EP_ORDER,
                EpOrderRefund.EP_ORDER_REFUND,
            EpOrgan.EP_ORGAN,
            EpOrganAccount.EP_ORGAN_ACCOUNT,
            EpOrganCatalog.EP_ORGAN_CATALOG,
            EpOrganClass.EP_ORGAN_CLASS,
            EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG,
            EpOrganClassChild.EP_ORGAN_CLASS_CHILD,
            EpOrganClassComment.EP_ORGAN_CLASS_COMMENT,
                EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE,
                EpOrganConfig.EP_ORGAN_CONFIG,
            EpOrganCourse.EP_ORGAN_COURSE,
            EpOrganCourseTag.EP_ORGAN_COURSE_TAG,
            EpOrganCourseTeam.EP_ORGAN_COURSE_TEAM,
                EpOrganVip.EP_ORGAN_VIP,
            EpSystemClient.EP_SYSTEM_CLIENT,
            EpSystemDict.EP_SYSTEM_DICT,
                EpSystemLog.EP_SYSTEM_LOG,
            EpSystemMenu.EP_SYSTEM_MENU,
            EpSystemRole.EP_SYSTEM_ROLE,
            EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY,
            EpSystemUser.EP_SYSTEM_USER,
                EpSystemUserRole.EP_SYSTEM_USER_ROLE,
                EpToken.EP_TOKEN,
                EpWechatForm.EP_WECHAT_FORM,
                EpWechatOpenid.EP_WECHAT_OPENID,
                EpWechatPayBill.EP_WECHAT_PAY_BILL,
                EpWechatPayBillDetail.EP_WECHAT_PAY_BILL_DETAIL,
                EpWechatPayRefund.EP_WECHAT_PAY_REFUND,
                EpWechatPayWithdraw.EP_WECHAT_PAY_WITHDRAW,
                EpWechatPayWithdrawDetail.EP_WECHAT_PAY_WITHDRAW_DETAIL,
                EpWechatUnifiedOrder.EP_WECHAT_UNIFIED_ORDER);
    }
}
