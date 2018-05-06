/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain;


import com.ep.domain.repository.domain.tables.*;
import com.ep.domain.repository.domain.tables.records.*;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>ep</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<EpConstantCatalogRecord, Long> IDENTITY_EP_CONSTANT_CATALOG = Identities0.IDENTITY_EP_CONSTANT_CATALOG;
    public static final Identity<EpConstantRegionRecord, Long> IDENTITY_EP_CONSTANT_REGION = Identities0.IDENTITY_EP_CONSTANT_REGION;
    public static final Identity<EpConstantTagRecord, Long> IDENTITY_EP_CONSTANT_TAG = Identities0.IDENTITY_EP_CONSTANT_TAG;
    public static final Identity<EpFileRecord, Long> IDENTITY_EP_FILE = Identities0.IDENTITY_EP_FILE;
    public static final Identity<EpMemberRecord, Long> IDENTITY_EP_MEMBER = Identities0.IDENTITY_EP_MEMBER;
    public static final Identity<EpMemberChildRecord, Long> IDENTITY_EP_MEMBER_CHILD = Identities0.IDENTITY_EP_MEMBER_CHILD;
    public static final Identity<EpMemberChildCommentRecord, Long> IDENTITY_EP_MEMBER_CHILD_COMMENT = Identities0.IDENTITY_EP_MEMBER_CHILD_COMMENT;
    public static final Identity<EpMemberChildHonorRecord, Long> IDENTITY_EP_MEMBER_CHILD_HONOR = Identities0.IDENTITY_EP_MEMBER_CHILD_HONOR;
    public static final Identity<EpMemberChildSignRecord, Long> IDENTITY_EP_MEMBER_CHILD_SIGN = Identities0.IDENTITY_EP_MEMBER_CHILD_SIGN;
    public static final Identity<EpMemberChildTagRecord, Long> IDENTITY_EP_MEMBER_CHILD_TAG = Identities0.IDENTITY_EP_MEMBER_CHILD_TAG;
    public static final Identity<EpMemberMessageRecord, Long> IDENTITY_EP_MEMBER_MESSAGE = Identities0.IDENTITY_EP_MEMBER_MESSAGE;
    public static final Identity<EpMessageCaptchaRecord, Long> IDENTITY_EP_MESSAGE_CAPTCHA = Identities0.IDENTITY_EP_MESSAGE_CAPTCHA;
    public static final Identity<EpOrderRecord, Long> IDENTITY_EP_ORDER = Identities0.IDENTITY_EP_ORDER;
    public static final Identity<EpOrganRecord, Long> IDENTITY_EP_ORGAN = Identities0.IDENTITY_EP_ORGAN;
    public static final Identity<EpOrganAccountRecord, Long> IDENTITY_EP_ORGAN_ACCOUNT = Identities0.IDENTITY_EP_ORGAN_ACCOUNT;
    public static final Identity<EpOrganCatalogRecord, Long> IDENTITY_EP_ORGAN_CATALOG = Identities0.IDENTITY_EP_ORGAN_CATALOG;
    public static final Identity<EpOrganClassRecord, Long> IDENTITY_EP_ORGAN_CLASS = Identities0.IDENTITY_EP_ORGAN_CLASS;
    public static final Identity<EpOrganClassCatalogRecord, Long> IDENTITY_EP_ORGAN_CLASS_CATALOG = Identities0.IDENTITY_EP_ORGAN_CLASS_CATALOG;
    public static final Identity<EpOrganClassChildRecord, Long> IDENTITY_EP_ORGAN_CLASS_CHILD = Identities0.IDENTITY_EP_ORGAN_CLASS_CHILD;
    public static final Identity<EpOrganClassCommentRecord, Long> IDENTITY_EP_ORGAN_CLASS_COMMENT = Identities0.IDENTITY_EP_ORGAN_CLASS_COMMENT;
    public static final Identity<EpOrganClassScheduleRecord, Long> IDENTITY_EP_ORGAN_CLASS_SCHEDULE = Identities0.IDENTITY_EP_ORGAN_CLASS_SCHEDULE;
    public static final Identity<EpOrganConfigRecord, Long> IDENTITY_EP_ORGAN_CONFIG = Identities0.IDENTITY_EP_ORGAN_CONFIG;
    public static final Identity<EpOrganCourseRecord, Long> IDENTITY_EP_ORGAN_COURSE = Identities0.IDENTITY_EP_ORGAN_COURSE;
    public static final Identity<EpOrganCourseTagRecord, Long> IDENTITY_EP_ORGAN_COURSE_TAG = Identities0.IDENTITY_EP_ORGAN_COURSE_TAG;
    public static final Identity<EpOrganCourseTeamRecord, Long> IDENTITY_EP_ORGAN_COURSE_TEAM = Identities0.IDENTITY_EP_ORGAN_COURSE_TEAM;
    public static final Identity<EpOrganVipRecord, Long> IDENTITY_EP_ORGAN_VIP = Identities0.IDENTITY_EP_ORGAN_VIP;
    public static final Identity<EpSystemClientRecord, Long> IDENTITY_EP_SYSTEM_CLIENT = Identities0.IDENTITY_EP_SYSTEM_CLIENT;
    public static final Identity<EpSystemDictRecord, Long> IDENTITY_EP_SYSTEM_DICT = Identities0.IDENTITY_EP_SYSTEM_DICT;
    public static final Identity<EpSystemLogRecord, Long> IDENTITY_EP_SYSTEM_LOG = Identities0.IDENTITY_EP_SYSTEM_LOG;
    public static final Identity<EpSystemMenuRecord, Long> IDENTITY_EP_SYSTEM_MENU = Identities0.IDENTITY_EP_SYSTEM_MENU;
    public static final Identity<EpSystemRoleRecord, Long> IDENTITY_EP_SYSTEM_ROLE = Identities0.IDENTITY_EP_SYSTEM_ROLE;
    public static final Identity<EpSystemRoleAuthorityRecord, Long> IDENTITY_EP_SYSTEM_ROLE_AUTHORITY = Identities0.IDENTITY_EP_SYSTEM_ROLE_AUTHORITY;
    public static final Identity<EpSystemUserRecord, Long> IDENTITY_EP_SYSTEM_USER = Identities0.IDENTITY_EP_SYSTEM_USER;
    public static final Identity<EpSystemUserRoleRecord, Long> IDENTITY_EP_SYSTEM_USER_ROLE = Identities0.IDENTITY_EP_SYSTEM_USER_ROLE;
    public static final Identity<EpTokenRecord, Long> IDENTITY_EP_TOKEN = Identities0.IDENTITY_EP_TOKEN;
    public static final Identity<EpWechatOpenidRecord, Long> IDENTITY_EP_WECHAT_OPENID = Identities0.IDENTITY_EP_WECHAT_OPENID;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EpConstantCatalogRecord> KEY_EP_CONSTANT_CATALOG_PRIMARY = UniqueKeys0.KEY_EP_CONSTANT_CATALOG_PRIMARY;
    public static final UniqueKey<EpConstantRegionRecord> KEY_EP_CONSTANT_REGION_PRIMARY = UniqueKeys0.KEY_EP_CONSTANT_REGION_PRIMARY;
    public static final UniqueKey<EpConstantTagRecord> KEY_EP_CONSTANT_TAG_PRIMARY = UniqueKeys0.KEY_EP_CONSTANT_TAG_PRIMARY;
    public static final UniqueKey<EpFileRecord> KEY_EP_FILE_PRIMARY = UniqueKeys0.KEY_EP_FILE_PRIMARY;
    public static final UniqueKey<EpFileRecord> KEY_EP_FILE_UNIQUE_PRE_CODE = UniqueKeys0.KEY_EP_FILE_UNIQUE_PRE_CODE;
    public static final UniqueKey<EpMemberRecord> KEY_EP_MEMBER_PRIMARY = UniqueKeys0.KEY_EP_MEMBER_PRIMARY;
    public static final UniqueKey<EpMemberRecord> KEY_EP_MEMBER_UNIQUE_MOBILE = UniqueKeys0.KEY_EP_MEMBER_UNIQUE_MOBILE;
    public static final UniqueKey<EpMemberChildRecord> KEY_EP_MEMBER_CHILD_PRIMARY = UniqueKeys0.KEY_EP_MEMBER_CHILD_PRIMARY;
    public static final UniqueKey<EpMemberChildCommentRecord> KEY_EP_MEMBER_CHILD_COMMENT_PRIMARY = UniqueKeys0.KEY_EP_MEMBER_CHILD_COMMENT_PRIMARY;
    public static final UniqueKey<EpMemberChildCommentRecord> KEY_EP_MEMBER_CHILD_COMMENT_UNIQUE_CATALOG_TYPE = UniqueKeys0.KEY_EP_MEMBER_CHILD_COMMENT_UNIQUE_CATALOG_TYPE;
    public static final UniqueKey<EpMemberChildHonorRecord> KEY_EP_MEMBER_CHILD_HONOR_PRIMARY = UniqueKeys0.KEY_EP_MEMBER_CHILD_HONOR_PRIMARY;
    public static final UniqueKey<EpMemberChildSignRecord> KEY_EP_MEMBER_CHILD_SIGN_PRIMARY = UniqueKeys0.KEY_EP_MEMBER_CHILD_SIGN_PRIMARY;
    public static final UniqueKey<EpMemberChildSignRecord> KEY_EP_MEMBER_CHILD_SIGN_UNIQUE_CHILD_ID = UniqueKeys0.KEY_EP_MEMBER_CHILD_SIGN_UNIQUE_CHILD_ID;
    public static final UniqueKey<EpMemberChildTagRecord> KEY_EP_MEMBER_CHILD_TAG_PRIMARY = UniqueKeys0.KEY_EP_MEMBER_CHILD_TAG_PRIMARY;
    public static final UniqueKey<EpMemberChildTagRecord> KEY_EP_MEMBER_CHILD_TAG_UNIQUE_CATELOG_CHILD_TAG = UniqueKeys0.KEY_EP_MEMBER_CHILD_TAG_UNIQUE_CATELOG_CHILD_TAG;
    public static final UniqueKey<EpMemberMessageRecord> KEY_EP_MEMBER_MESSAGE_PRIMARY = UniqueKeys0.KEY_EP_MEMBER_MESSAGE_PRIMARY;
    public static final UniqueKey<EpMessageCaptchaRecord> KEY_EP_MESSAGE_CAPTCHA_PRIMARY = UniqueKeys0.KEY_EP_MESSAGE_CAPTCHA_PRIMARY;
    public static final UniqueKey<EpOrderRecord> KEY_EP_ORDER_PRIMARY = UniqueKeys0.KEY_EP_ORDER_PRIMARY;
    public static final UniqueKey<EpOrganRecord> KEY_EP_ORGAN_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_PRIMARY;
    public static final UniqueKey<EpOrganAccountRecord> KEY_EP_ORGAN_ACCOUNT_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_ACCOUNT_PRIMARY;
    public static final UniqueKey<EpOrganAccountRecord> KEY_EP_ORGAN_ACCOUNT_UNIQUE_MOBILE_OGN = UniqueKeys0.KEY_EP_ORGAN_ACCOUNT_UNIQUE_MOBILE_OGN;
    public static final UniqueKey<EpOrganCatalogRecord> KEY_EP_ORGAN_CATALOG_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_CATALOG_PRIMARY;
    public static final UniqueKey<EpOrganCatalogRecord> KEY_EP_ORGAN_CATALOG_UNIQUE_OGN_ID_COURSE_CATALOG_ID = UniqueKeys0.KEY_EP_ORGAN_CATALOG_UNIQUE_OGN_ID_COURSE_CATALOG_ID;
    public static final UniqueKey<EpOrganClassRecord> KEY_EP_ORGAN_CLASS_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_CLASS_PRIMARY;
    public static final UniqueKey<EpOrganClassCatalogRecord> KEY_EP_ORGAN_CLASS_CATALOG_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_CLASS_CATALOG_PRIMARY;
    public static final UniqueKey<EpOrganClassChildRecord> KEY_EP_ORGAN_CLASS_CHILD_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_CLASS_CHILD_PRIMARY;
    public static final UniqueKey<EpOrganClassChildRecord> KEY_EP_ORGAN_CLASS_CHILD_UNIQUE_ORDER_ID = UniqueKeys0.KEY_EP_ORGAN_CLASS_CHILD_UNIQUE_ORDER_ID;
    public static final UniqueKey<EpOrganClassCommentRecord> KEY_EP_ORGAN_CLASS_COMMENT_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_CLASS_COMMENT_PRIMARY;
    public static final UniqueKey<EpOrganClassCommentRecord> KEY_EP_ORGAN_CLASS_COMMENT_UNIQUE_ORDER_ID = UniqueKeys0.KEY_EP_ORGAN_CLASS_COMMENT_UNIQUE_ORDER_ID;
    public static final UniqueKey<EpOrganClassScheduleRecord> KEY_EP_ORGAN_CLASS_SCHEDULE_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_CLASS_SCHEDULE_PRIMARY;
    public static final UniqueKey<EpOrganConfigRecord> KEY_EP_ORGAN_CONFIG_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_CONFIG_PRIMARY;
    public static final UniqueKey<EpOrganCourseRecord> KEY_EP_ORGAN_COURSE_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_COURSE_PRIMARY;
    public static final UniqueKey<EpOrganCourseTagRecord> KEY_EP_ORGAN_COURSE_TAG_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_COURSE_TAG_PRIMARY;
    public static final UniqueKey<EpOrganCourseTeamRecord> KEY_EP_ORGAN_COURSE_TEAM_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_COURSE_TEAM_PRIMARY;
    public static final UniqueKey<EpOrganVipRecord> KEY_EP_ORGAN_VIP_PRIMARY = UniqueKeys0.KEY_EP_ORGAN_VIP_PRIMARY;
    public static final UniqueKey<EpSystemClientRecord> KEY_EP_SYSTEM_CLIENT_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_CLIENT_PRIMARY;
    public static final UniqueKey<EpSystemClientRecord> KEY_EP_SYSTEM_CLIENT_UNIQUE_CLIENTID = UniqueKeys0.KEY_EP_SYSTEM_CLIENT_UNIQUE_CLIENTID;
    public static final UniqueKey<EpSystemDictRecord> KEY_EP_SYSTEM_DICT_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_DICT_PRIMARY;
    public static final UniqueKey<EpSystemDictRecord> KEY_EP_SYSTEM_DICT_SYS_DICT_GROUPNAME_KEY = UniqueKeys0.KEY_EP_SYSTEM_DICT_SYS_DICT_GROUPNAME_KEY;
    public static final UniqueKey<EpSystemLogRecord> KEY_EP_SYSTEM_LOG_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_LOG_PRIMARY;
    public static final UniqueKey<EpSystemMenuRecord> KEY_EP_SYSTEM_MENU_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_MENU_PRIMARY;
    public static final UniqueKey<EpSystemRoleRecord> KEY_EP_SYSTEM_ROLE_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_ROLE_PRIMARY;
    public static final UniqueKey<EpSystemRoleRecord> KEY_EP_SYSTEM_ROLE_UNIQUE_ROLE_CODE = UniqueKeys0.KEY_EP_SYSTEM_ROLE_UNIQUE_ROLE_CODE;
    public static final UniqueKey<EpSystemRoleAuthorityRecord> KEY_EP_SYSTEM_ROLE_AUTHORITY_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_ROLE_AUTHORITY_PRIMARY;
    public static final UniqueKey<EpSystemUserRecord> KEY_EP_SYSTEM_USER_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_USER_PRIMARY;
    public static final UniqueKey<EpSystemUserRecord> KEY_EP_SYSTEM_USER_UNIQUE_MOBILE = UniqueKeys0.KEY_EP_SYSTEM_USER_UNIQUE_MOBILE;
    public static final UniqueKey<EpSystemUserRoleRecord> KEY_EP_SYSTEM_USER_ROLE_PRIMARY = UniqueKeys0.KEY_EP_SYSTEM_USER_ROLE_PRIMARY;
    public static final UniqueKey<EpTokenRecord> KEY_EP_TOKEN_PRIMARY = UniqueKeys0.KEY_EP_TOKEN_PRIMARY;
    public static final UniqueKey<EpWechatOpenidRecord> KEY_EP_WECHAT_OPENID_PRIMARY = UniqueKeys0.KEY_EP_WECHAT_OPENID_PRIMARY;
    public static final UniqueKey<EpWechatOpenidRecord> KEY_EP_WECHAT_OPENID_INDEX_OPENID_TYPE_MOBILE = UniqueKeys0.KEY_EP_WECHAT_OPENID_INDEX_OPENID_TYPE_MOBILE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<EpConstantCatalogRecord, Long> IDENTITY_EP_CONSTANT_CATALOG = createIdentity(EpConstantCatalog.EP_CONSTANT_CATALOG, EpConstantCatalog.EP_CONSTANT_CATALOG.ID);
        public static Identity<EpConstantRegionRecord, Long> IDENTITY_EP_CONSTANT_REGION = createIdentity(EpConstantRegion.EP_CONSTANT_REGION, EpConstantRegion.EP_CONSTANT_REGION.ID);
        public static Identity<EpConstantTagRecord, Long> IDENTITY_EP_CONSTANT_TAG = createIdentity(EpConstantTag.EP_CONSTANT_TAG, EpConstantTag.EP_CONSTANT_TAG.ID);
        public static Identity<EpFileRecord, Long> IDENTITY_EP_FILE = createIdentity(EpFile.EP_FILE, EpFile.EP_FILE.ID);
        public static Identity<EpMemberRecord, Long> IDENTITY_EP_MEMBER = createIdentity(EpMember.EP_MEMBER, EpMember.EP_MEMBER.ID);
        public static Identity<EpMemberChildRecord, Long> IDENTITY_EP_MEMBER_CHILD = createIdentity(EpMemberChild.EP_MEMBER_CHILD, EpMemberChild.EP_MEMBER_CHILD.ID);
        public static Identity<EpMemberChildCommentRecord, Long> IDENTITY_EP_MEMBER_CHILD_COMMENT = createIdentity(EpMemberChildComment.EP_MEMBER_CHILD_COMMENT, EpMemberChildComment.EP_MEMBER_CHILD_COMMENT.ID);
        public static Identity<EpMemberChildHonorRecord, Long> IDENTITY_EP_MEMBER_CHILD_HONOR = createIdentity(EpMemberChildHonor.EP_MEMBER_CHILD_HONOR, EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.ID);
        public static Identity<EpMemberChildSignRecord, Long> IDENTITY_EP_MEMBER_CHILD_SIGN = createIdentity(EpMemberChildSign.EP_MEMBER_CHILD_SIGN, EpMemberChildSign.EP_MEMBER_CHILD_SIGN.ID);
        public static Identity<EpMemberChildTagRecord, Long> IDENTITY_EP_MEMBER_CHILD_TAG = createIdentity(EpMemberChildTag.EP_MEMBER_CHILD_TAG, EpMemberChildTag.EP_MEMBER_CHILD_TAG.ID);
        public static Identity<EpMemberMessageRecord, Long> IDENTITY_EP_MEMBER_MESSAGE = createIdentity(EpMemberMessage.EP_MEMBER_MESSAGE, EpMemberMessage.EP_MEMBER_MESSAGE.ID);
        public static Identity<EpMessageCaptchaRecord, Long> IDENTITY_EP_MESSAGE_CAPTCHA = createIdentity(EpMessageCaptcha.EP_MESSAGE_CAPTCHA, EpMessageCaptcha.EP_MESSAGE_CAPTCHA.ID);
        public static Identity<EpOrderRecord, Long> IDENTITY_EP_ORDER = createIdentity(EpOrder.EP_ORDER, EpOrder.EP_ORDER.ID);
        public static Identity<EpOrganRecord, Long> IDENTITY_EP_ORGAN = createIdentity(EpOrgan.EP_ORGAN, EpOrgan.EP_ORGAN.ID);
        public static Identity<EpOrganAccountRecord, Long> IDENTITY_EP_ORGAN_ACCOUNT = createIdentity(EpOrganAccount.EP_ORGAN_ACCOUNT, EpOrganAccount.EP_ORGAN_ACCOUNT.ID);
        public static Identity<EpOrganCatalogRecord, Long> IDENTITY_EP_ORGAN_CATALOG = createIdentity(EpOrganCatalog.EP_ORGAN_CATALOG, EpOrganCatalog.EP_ORGAN_CATALOG.ID);
        public static Identity<EpOrganClassRecord, Long> IDENTITY_EP_ORGAN_CLASS = createIdentity(EpOrganClass.EP_ORGAN_CLASS, EpOrganClass.EP_ORGAN_CLASS.ID);
        public static Identity<EpOrganClassCatalogRecord, Long> IDENTITY_EP_ORGAN_CLASS_CATALOG = createIdentity(EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG, EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.ID);
        public static Identity<EpOrganClassChildRecord, Long> IDENTITY_EP_ORGAN_CLASS_CHILD = createIdentity(EpOrganClassChild.EP_ORGAN_CLASS_CHILD, EpOrganClassChild.EP_ORGAN_CLASS_CHILD.ID);
        public static Identity<EpOrganClassCommentRecord, Long> IDENTITY_EP_ORGAN_CLASS_COMMENT = createIdentity(EpOrganClassComment.EP_ORGAN_CLASS_COMMENT, EpOrganClassComment.EP_ORGAN_CLASS_COMMENT.ID);
        public static Identity<EpOrganClassScheduleRecord, Long> IDENTITY_EP_ORGAN_CLASS_SCHEDULE = createIdentity(EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE, EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.ID);
        public static Identity<EpOrganConfigRecord, Long> IDENTITY_EP_ORGAN_CONFIG = createIdentity(EpOrganConfig.EP_ORGAN_CONFIG, EpOrganConfig.EP_ORGAN_CONFIG.ID);
        public static Identity<EpOrganCourseRecord, Long> IDENTITY_EP_ORGAN_COURSE = createIdentity(EpOrganCourse.EP_ORGAN_COURSE, EpOrganCourse.EP_ORGAN_COURSE.ID);
        public static Identity<EpOrganCourseTagRecord, Long> IDENTITY_EP_ORGAN_COURSE_TAG = createIdentity(EpOrganCourseTag.EP_ORGAN_COURSE_TAG, EpOrganCourseTag.EP_ORGAN_COURSE_TAG.ID);
        public static Identity<EpOrganCourseTeamRecord, Long> IDENTITY_EP_ORGAN_COURSE_TEAM = createIdentity(EpOrganCourseTeam.EP_ORGAN_COURSE_TEAM, EpOrganCourseTeam.EP_ORGAN_COURSE_TEAM.ID);
        public static Identity<EpOrganVipRecord, Long> IDENTITY_EP_ORGAN_VIP = createIdentity(EpOrganVip.EP_ORGAN_VIP, EpOrganVip.EP_ORGAN_VIP.ID);
        public static Identity<EpSystemClientRecord, Long> IDENTITY_EP_SYSTEM_CLIENT = createIdentity(EpSystemClient.EP_SYSTEM_CLIENT, EpSystemClient.EP_SYSTEM_CLIENT.ID);
        public static Identity<EpSystemDictRecord, Long> IDENTITY_EP_SYSTEM_DICT = createIdentity(EpSystemDict.EP_SYSTEM_DICT, EpSystemDict.EP_SYSTEM_DICT.ID);
        public static Identity<EpSystemLogRecord, Long> IDENTITY_EP_SYSTEM_LOG = createIdentity(EpSystemLog.EP_SYSTEM_LOG, EpSystemLog.EP_SYSTEM_LOG.ID);
        public static Identity<EpSystemMenuRecord, Long> IDENTITY_EP_SYSTEM_MENU = createIdentity(EpSystemMenu.EP_SYSTEM_MENU, EpSystemMenu.EP_SYSTEM_MENU.ID);
        public static Identity<EpSystemRoleRecord, Long> IDENTITY_EP_SYSTEM_ROLE = createIdentity(EpSystemRole.EP_SYSTEM_ROLE, EpSystemRole.EP_SYSTEM_ROLE.ID);
        public static Identity<EpSystemRoleAuthorityRecord, Long> IDENTITY_EP_SYSTEM_ROLE_AUTHORITY = createIdentity(EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY, EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.ID);
        public static Identity<EpSystemUserRecord, Long> IDENTITY_EP_SYSTEM_USER = createIdentity(EpSystemUser.EP_SYSTEM_USER, EpSystemUser.EP_SYSTEM_USER.ID);
        public static Identity<EpSystemUserRoleRecord, Long> IDENTITY_EP_SYSTEM_USER_ROLE = createIdentity(EpSystemUserRole.EP_SYSTEM_USER_ROLE, EpSystemUserRole.EP_SYSTEM_USER_ROLE.ID);
        public static Identity<EpTokenRecord, Long> IDENTITY_EP_TOKEN = createIdentity(EpToken.EP_TOKEN, EpToken.EP_TOKEN.ID);
        public static Identity<EpWechatOpenidRecord, Long> IDENTITY_EP_WECHAT_OPENID = createIdentity(EpWechatOpenid.EP_WECHAT_OPENID, EpWechatOpenid.EP_WECHAT_OPENID.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<EpConstantCatalogRecord> KEY_EP_CONSTANT_CATALOG_PRIMARY = createUniqueKey(EpConstantCatalog.EP_CONSTANT_CATALOG, "KEY_ep_constant_catalog_PRIMARY", EpConstantCatalog.EP_CONSTANT_CATALOG.ID);
        public static final UniqueKey<EpConstantRegionRecord> KEY_EP_CONSTANT_REGION_PRIMARY = createUniqueKey(EpConstantRegion.EP_CONSTANT_REGION, "KEY_ep_constant_region_PRIMARY", EpConstantRegion.EP_CONSTANT_REGION.ID);
        public static final UniqueKey<EpConstantTagRecord> KEY_EP_CONSTANT_TAG_PRIMARY = createUniqueKey(EpConstantTag.EP_CONSTANT_TAG, "KEY_ep_constant_tag_PRIMARY", EpConstantTag.EP_CONSTANT_TAG.ID);
        public static final UniqueKey<EpFileRecord> KEY_EP_FILE_PRIMARY = createUniqueKey(EpFile.EP_FILE, "KEY_ep_file_PRIMARY", EpFile.EP_FILE.ID);
        public static final UniqueKey<EpFileRecord> KEY_EP_FILE_UNIQUE_PRE_CODE = createUniqueKey(EpFile.EP_FILE, "KEY_ep_file_UNIQUE_PRE_CODE", EpFile.EP_FILE.PRE_CODE);
        public static final UniqueKey<EpMemberRecord> KEY_EP_MEMBER_PRIMARY = createUniqueKey(EpMember.EP_MEMBER, "KEY_ep_member_PRIMARY", EpMember.EP_MEMBER.ID);
        public static final UniqueKey<EpMemberRecord> KEY_EP_MEMBER_UNIQUE_MOBILE = createUniqueKey(EpMember.EP_MEMBER, "KEY_ep_member_UNIQUE_MOBILE", EpMember.EP_MEMBER.MOBILE);
        public static final UniqueKey<EpMemberChildRecord> KEY_EP_MEMBER_CHILD_PRIMARY = createUniqueKey(EpMemberChild.EP_MEMBER_CHILD, "KEY_ep_member_child_PRIMARY", EpMemberChild.EP_MEMBER_CHILD.ID);
        public static final UniqueKey<EpMemberChildCommentRecord> KEY_EP_MEMBER_CHILD_COMMENT_PRIMARY = createUniqueKey(EpMemberChildComment.EP_MEMBER_CHILD_COMMENT, "KEY_ep_member_child_comment_PRIMARY", EpMemberChildComment.EP_MEMBER_CHILD_COMMENT.ID);
        public static final UniqueKey<EpMemberChildCommentRecord> KEY_EP_MEMBER_CHILD_COMMENT_UNIQUE_CATALOG_TYPE = createUniqueKey(EpMemberChildComment.EP_MEMBER_CHILD_COMMENT, "KEY_ep_member_child_comment_UNIQUE_CATALOG_TYPE", EpMemberChildComment.EP_MEMBER_CHILD_COMMENT.CLASS_SCHEDULE_ID, EpMemberChildComment.EP_MEMBER_CHILD_COMMENT.TYPE);
        public static final UniqueKey<EpMemberChildHonorRecord> KEY_EP_MEMBER_CHILD_HONOR_PRIMARY = createUniqueKey(EpMemberChildHonor.EP_MEMBER_CHILD_HONOR, "KEY_ep_member_child_honor_PRIMARY", EpMemberChildHonor.EP_MEMBER_CHILD_HONOR.ID);
        public static final UniqueKey<EpMemberChildSignRecord> KEY_EP_MEMBER_CHILD_SIGN_PRIMARY = createUniqueKey(EpMemberChildSign.EP_MEMBER_CHILD_SIGN, "KEY_ep_member_child_sign_PRIMARY", EpMemberChildSign.EP_MEMBER_CHILD_SIGN.ID);
        public static final UniqueKey<EpMemberChildSignRecord> KEY_EP_MEMBER_CHILD_SIGN_UNIQUE_CHILD_ID = createUniqueKey(EpMemberChildSign.EP_MEMBER_CHILD_SIGN, "KEY_ep_member_child_sign_UNIQUE_CHILD_ID", EpMemberChildSign.EP_MEMBER_CHILD_SIGN.CHILD_ID);
        public static final UniqueKey<EpMemberChildTagRecord> KEY_EP_MEMBER_CHILD_TAG_PRIMARY = createUniqueKey(EpMemberChildTag.EP_MEMBER_CHILD_TAG, "KEY_ep_member_child_tag_PRIMARY", EpMemberChildTag.EP_MEMBER_CHILD_TAG.ID);
        public static final UniqueKey<EpMemberChildTagRecord> KEY_EP_MEMBER_CHILD_TAG_UNIQUE_CATELOG_CHILD_TAG = createUniqueKey(EpMemberChildTag.EP_MEMBER_CHILD_TAG, "KEY_ep_member_child_tag_UNIQUE_CATELOG_CHILD_TAG", EpMemberChildTag.EP_MEMBER_CHILD_TAG.CLASS_SCHEDULE_ID, EpMemberChildTag.EP_MEMBER_CHILD_TAG.CHILD_ID, EpMemberChildTag.EP_MEMBER_CHILD_TAG.TAG_ID);
        public static final UniqueKey<EpMemberMessageRecord> KEY_EP_MEMBER_MESSAGE_PRIMARY = createUniqueKey(EpMemberMessage.EP_MEMBER_MESSAGE, "KEY_ep_member_message_PRIMARY", EpMemberMessage.EP_MEMBER_MESSAGE.ID);
        public static final UniqueKey<EpMessageCaptchaRecord> KEY_EP_MESSAGE_CAPTCHA_PRIMARY = createUniqueKey(EpMessageCaptcha.EP_MESSAGE_CAPTCHA, "KEY_ep_message_captcha_PRIMARY", EpMessageCaptcha.EP_MESSAGE_CAPTCHA.ID);
        public static final UniqueKey<EpOrderRecord> KEY_EP_ORDER_PRIMARY = createUniqueKey(EpOrder.EP_ORDER, "KEY_ep_order_PRIMARY", EpOrder.EP_ORDER.ID);
        public static final UniqueKey<EpOrganRecord> KEY_EP_ORGAN_PRIMARY = createUniqueKey(EpOrgan.EP_ORGAN, "KEY_ep_organ_PRIMARY", EpOrgan.EP_ORGAN.ID);
        public static final UniqueKey<EpOrganAccountRecord> KEY_EP_ORGAN_ACCOUNT_PRIMARY = createUniqueKey(EpOrganAccount.EP_ORGAN_ACCOUNT, "KEY_ep_organ_account_PRIMARY", EpOrganAccount.EP_ORGAN_ACCOUNT.ID);
        public static final UniqueKey<EpOrganAccountRecord> KEY_EP_ORGAN_ACCOUNT_UNIQUE_MOBILE_OGN = createUniqueKey(EpOrganAccount.EP_ORGAN_ACCOUNT, "KEY_ep_organ_account_UNIQUE_MOBILE_OGN", EpOrganAccount.EP_ORGAN_ACCOUNT.REFER_MOBILE, EpOrganAccount.EP_ORGAN_ACCOUNT.OGN_ID);
        public static final UniqueKey<EpOrganCatalogRecord> KEY_EP_ORGAN_CATALOG_PRIMARY = createUniqueKey(EpOrganCatalog.EP_ORGAN_CATALOG, "KEY_ep_organ_catalog_PRIMARY", EpOrganCatalog.EP_ORGAN_CATALOG.ID);
        public static final UniqueKey<EpOrganCatalogRecord> KEY_EP_ORGAN_CATALOG_UNIQUE_OGN_ID_COURSE_CATALOG_ID = createUniqueKey(EpOrganCatalog.EP_ORGAN_CATALOG, "KEY_ep_organ_catalog_UNIQUE_OGN_ID_COURSE_CATALOG_ID", EpOrganCatalog.EP_ORGAN_CATALOG.OGN_ID, EpOrganCatalog.EP_ORGAN_CATALOG.COURSE_CATALOG_ID);
        public static final UniqueKey<EpOrganClassRecord> KEY_EP_ORGAN_CLASS_PRIMARY = createUniqueKey(EpOrganClass.EP_ORGAN_CLASS, "KEY_ep_organ_class_PRIMARY", EpOrganClass.EP_ORGAN_CLASS.ID);
        public static final UniqueKey<EpOrganClassCatalogRecord> KEY_EP_ORGAN_CLASS_CATALOG_PRIMARY = createUniqueKey(EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG, "KEY_ep_organ_class_catalog_PRIMARY", EpOrganClassCatalog.EP_ORGAN_CLASS_CATALOG.ID);
        public static final UniqueKey<EpOrganClassChildRecord> KEY_EP_ORGAN_CLASS_CHILD_PRIMARY = createUniqueKey(EpOrganClassChild.EP_ORGAN_CLASS_CHILD, "KEY_ep_organ_class_child_PRIMARY", EpOrganClassChild.EP_ORGAN_CLASS_CHILD.ID);
        public static final UniqueKey<EpOrganClassChildRecord> KEY_EP_ORGAN_CLASS_CHILD_UNIQUE_ORDER_ID = createUniqueKey(EpOrganClassChild.EP_ORGAN_CLASS_CHILD, "KEY_ep_organ_class_child_UNIQUE_ORDER_ID", EpOrganClassChild.EP_ORGAN_CLASS_CHILD.ORDER_ID);
        public static final UniqueKey<EpOrganClassCommentRecord> KEY_EP_ORGAN_CLASS_COMMENT_PRIMARY = createUniqueKey(EpOrganClassComment.EP_ORGAN_CLASS_COMMENT, "KEY_ep_organ_class_comment_PRIMARY", EpOrganClassComment.EP_ORGAN_CLASS_COMMENT.ID);
        public static final UniqueKey<EpOrganClassCommentRecord> KEY_EP_ORGAN_CLASS_COMMENT_UNIQUE_ORDER_ID = createUniqueKey(EpOrganClassComment.EP_ORGAN_CLASS_COMMENT, "KEY_ep_organ_class_comment_UNIQUE_ORDER_ID", EpOrganClassComment.EP_ORGAN_CLASS_COMMENT.ORDER_ID);
        public static final UniqueKey<EpOrganClassScheduleRecord> KEY_EP_ORGAN_CLASS_SCHEDULE_PRIMARY = createUniqueKey(EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE, "KEY_ep_organ_class_schedule_PRIMARY", EpOrganClassSchedule.EP_ORGAN_CLASS_SCHEDULE.ID);
        public static final UniqueKey<EpOrganConfigRecord> KEY_EP_ORGAN_CONFIG_PRIMARY = createUniqueKey(EpOrganConfig.EP_ORGAN_CONFIG, "KEY_ep_organ_config_PRIMARY", EpOrganConfig.EP_ORGAN_CONFIG.ID);
        public static final UniqueKey<EpOrganCourseRecord> KEY_EP_ORGAN_COURSE_PRIMARY = createUniqueKey(EpOrganCourse.EP_ORGAN_COURSE, "KEY_ep_organ_course_PRIMARY", EpOrganCourse.EP_ORGAN_COURSE.ID);
        public static final UniqueKey<EpOrganCourseTagRecord> KEY_EP_ORGAN_COURSE_TAG_PRIMARY = createUniqueKey(EpOrganCourseTag.EP_ORGAN_COURSE_TAG, "KEY_ep_organ_course_tag_PRIMARY", EpOrganCourseTag.EP_ORGAN_COURSE_TAG.ID);
        public static final UniqueKey<EpOrganCourseTeamRecord> KEY_EP_ORGAN_COURSE_TEAM_PRIMARY = createUniqueKey(EpOrganCourseTeam.EP_ORGAN_COURSE_TEAM, "KEY_ep_organ_course_team_PRIMARY", EpOrganCourseTeam.EP_ORGAN_COURSE_TEAM.ID);
        public static final UniqueKey<EpOrganVipRecord> KEY_EP_ORGAN_VIP_PRIMARY = createUniqueKey(EpOrganVip.EP_ORGAN_VIP, "KEY_ep_organ_vip_PRIMARY", EpOrganVip.EP_ORGAN_VIP.ID);
        public static final UniqueKey<EpSystemClientRecord> KEY_EP_SYSTEM_CLIENT_PRIMARY = createUniqueKey(EpSystemClient.EP_SYSTEM_CLIENT, "KEY_ep_system_client_PRIMARY", EpSystemClient.EP_SYSTEM_CLIENT.ID);
        public static final UniqueKey<EpSystemClientRecord> KEY_EP_SYSTEM_CLIENT_UNIQUE_CLIENTID = createUniqueKey(EpSystemClient.EP_SYSTEM_CLIENT, "KEY_ep_system_client_unique_clientid", EpSystemClient.EP_SYSTEM_CLIENT.CLIENT_ID);
        public static final UniqueKey<EpSystemDictRecord> KEY_EP_SYSTEM_DICT_PRIMARY = createUniqueKey(EpSystemDict.EP_SYSTEM_DICT, "KEY_ep_system_dict_PRIMARY", EpSystemDict.EP_SYSTEM_DICT.ID);
        public static final UniqueKey<EpSystemDictRecord> KEY_EP_SYSTEM_DICT_SYS_DICT_GROUPNAME_KEY = createUniqueKey(EpSystemDict.EP_SYSTEM_DICT, "KEY_ep_system_dict_sys_dict_groupname_key", EpSystemDict.EP_SYSTEM_DICT.GROUP_NAME, EpSystemDict.EP_SYSTEM_DICT.KEY);
        public static final UniqueKey<EpSystemLogRecord> KEY_EP_SYSTEM_LOG_PRIMARY = createUniqueKey(EpSystemLog.EP_SYSTEM_LOG, "KEY_ep_system_log_PRIMARY", EpSystemLog.EP_SYSTEM_LOG.ID);
        public static final UniqueKey<EpSystemMenuRecord> KEY_EP_SYSTEM_MENU_PRIMARY = createUniqueKey(EpSystemMenu.EP_SYSTEM_MENU, "KEY_ep_system_menu_PRIMARY", EpSystemMenu.EP_SYSTEM_MENU.ID);
        public static final UniqueKey<EpSystemRoleRecord> KEY_EP_SYSTEM_ROLE_PRIMARY = createUniqueKey(EpSystemRole.EP_SYSTEM_ROLE, "KEY_ep_system_role_PRIMARY", EpSystemRole.EP_SYSTEM_ROLE.ID);
        public static final UniqueKey<EpSystemRoleRecord> KEY_EP_SYSTEM_ROLE_UNIQUE_ROLE_CODE = createUniqueKey(EpSystemRole.EP_SYSTEM_ROLE, "KEY_ep_system_role_UNIQUE_ROLE_CODE", EpSystemRole.EP_SYSTEM_ROLE.ROLE_CODE);
        public static final UniqueKey<EpSystemRoleAuthorityRecord> KEY_EP_SYSTEM_ROLE_AUTHORITY_PRIMARY = createUniqueKey(EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY, "KEY_ep_system_role_authority_PRIMARY", EpSystemRoleAuthority.EP_SYSTEM_ROLE_AUTHORITY.ID);
        public static final UniqueKey<EpSystemUserRecord> KEY_EP_SYSTEM_USER_PRIMARY = createUniqueKey(EpSystemUser.EP_SYSTEM_USER, "KEY_ep_system_user_PRIMARY", EpSystemUser.EP_SYSTEM_USER.ID);
        public static final UniqueKey<EpSystemUserRecord> KEY_EP_SYSTEM_USER_UNIQUE_MOBILE = createUniqueKey(EpSystemUser.EP_SYSTEM_USER, "KEY_ep_system_user_UNIQUE_MOBILE", EpSystemUser.EP_SYSTEM_USER.MOBILE);
        public static final UniqueKey<EpSystemUserRoleRecord> KEY_EP_SYSTEM_USER_ROLE_PRIMARY = createUniqueKey(EpSystemUserRole.EP_SYSTEM_USER_ROLE, "KEY_ep_system_user_role_PRIMARY", EpSystemUserRole.EP_SYSTEM_USER_ROLE.ID);
        public static final UniqueKey<EpTokenRecord> KEY_EP_TOKEN_PRIMARY = createUniqueKey(EpToken.EP_TOKEN, "KEY_ep_token_PRIMARY", EpToken.EP_TOKEN.ID);
        public static final UniqueKey<EpWechatOpenidRecord> KEY_EP_WECHAT_OPENID_PRIMARY = createUniqueKey(EpWechatOpenid.EP_WECHAT_OPENID, "KEY_ep_wechat_openid_PRIMARY", EpWechatOpenid.EP_WECHAT_OPENID.ID);
        public static final UniqueKey<EpWechatOpenidRecord> KEY_EP_WECHAT_OPENID_INDEX_OPENID_TYPE_MOBILE = createUniqueKey(EpWechatOpenid.EP_WECHAT_OPENID, "KEY_ep_wechat_openid_INDEX_OPENID_TYPE_MOBILE", EpWechatOpenid.EP_WECHAT_OPENID.OPENID, EpWechatOpenid.EP_WECHAT_OPENID.TYPE, EpWechatOpenid.EP_WECHAT_OPENID.MOBILE);
    }
}
