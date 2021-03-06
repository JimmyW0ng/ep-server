package com.ep.domain.service;

import com.ep.common.component.SpringComponent;
import com.ep.common.tool.DateTools;
import com.ep.common.tool.RegexTools;
import com.ep.common.tool.StringTools;
import com.ep.domain.component.QcloudsmsComponent;
import com.ep.domain.constant.BizConstant;
import com.ep.domain.constant.MessageCode;
import com.ep.domain.pojo.ResultDo;
import com.ep.domain.pojo.po.EpMessageCaptchaPo;
import com.ep.domain.pojo.po.EpSystemDictPo;
import com.ep.domain.repository.MessageCaptchaRepository;
import com.ep.domain.repository.OrganAccountRepository;
import com.ep.domain.repository.SystemDictRepository;
import com.ep.domain.repository.domain.enums.EpMessageCaptchaCaptchaScene;
import com.ep.domain.repository.domain.enums.EpMessageCaptchaCaptchaType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

/**
 * @Description:验证码业务接口
 * @Author: J.W
 * @Date: 上午10:33 2017/11/27
 */
@Slf4j
@Service
public class MessageCaptchaService {

    @Autowired
    private MessageCaptchaRepository messageCaptchaRepository;
    @Autowired
    private OrganAccountRepository organAccountRepository;
    @Autowired
    private SystemDictRepository systemDictRepository;
    @Autowired
    private QcloudsmsComponent qcloudsmsComponent;

    /**
     * 获取短信验证码
     *
     * @param sourceId
     * @param captchaScene
     * @param channelScene
     * @param ip
     * @return
     */
    public ResultDo getCaptcha(Long sourceId, EpMessageCaptchaCaptchaType type, EpMessageCaptchaCaptchaScene captchaScene, String channelScene, String ip) {
        // 校验手机格式
        if (!RegexTools.checkMobile(sourceId.toString())) {
            return ResultDo.build(MessageCode.ERROR_MOBILE_FORMAT);
        }
        // 校验手机发送短信频率是否异常
        ResultDo checkMsgActionResult = this.checkMsgAction(sourceId, type, ip);
        if (checkMsgActionResult.isError()) {
            return checkMsgActionResult;
        }
        // 如果是机构端需要判断手机号是否存在
        if (EpMessageCaptchaCaptchaScene.organ_account_login.equals(captchaScene) && !organAccountRepository.checkExistByMobile(sourceId)) {
            return ResultDo.build(MessageCode.ERROR_ORGAN_ACCOUNT_NOT_EXISTS);
        }
        // 生成随机码
        String captchaContent = RandomStringUtils.randomNumeric(BizConstant.CAPTCHA_SHORT_MSG_LENGTH);
        // 生成业务编码
        String bizCode = StringTools.getUUID();
        // 保存到验证码表
        EpMessageCaptchaPo insertPo = new EpMessageCaptchaPo();
        insertPo.setCaptchaType(type);
        insertPo.setSourceId(sourceId);
        insertPo.setCaptchaCode(bizCode);
        insertPo.setCaptchaContent(captchaContent);
        insertPo.setCaptchaScene(captchaScene);
        insertPo.setChannelScene(channelScene);
        insertPo.setIp(ip);
        insertPo.setExpireTime(DateTools.addMinuteTimestamp(DateTools.getCurrentDate(), BizConstant.CAPTCHA_SHORT_MSG_EXPIRE_MINUTE));
        messageCaptchaRepository.insert(insertPo);
        // 发送短信
        if (SpringComponent.isProduct()) {
            EpSystemDictPo dictPo = systemDictRepository.findByGroupNameAndKey(BizConstant.DICT_GROUP_QCLOUDSMS, BizConstant.DICT_KEY_LOGIN_CAPTCHA);
            //短信模板id
            int templateId = Integer.parseInt(dictPo.getValue());
            String[] params = new String[]{StringTools.encodeUTF(captchaContent),
                    StringTools.encodeUTF(String.valueOf(BizConstant.CAPTCHA_SHORT_MSG_EXPIRE_MINUTE))};
            log.info("发送验证码：模版id={}, params={}", templateId, params);
            qcloudsmsComponent.singleSend(templateId, sourceId.toString(), params);
        }
        return this.getByType(insertPo);
    }

    /**
     * 校验用户获取验证码行为是否存在异常
     *
     * @param sourceId
     * @return
     */
    private ResultDo checkMsgAction(Long sourceId, EpMessageCaptchaCaptchaType type, String ip) {
        if (type.equals(EpMessageCaptchaCaptchaType.short_msg)) {
            // 查看当天已经发送次数
            int count = messageCaptchaRepository.countBySourceId(sourceId);
            if (count > BizConstant.CAPTCHA_SHORT_MSG_NUM_LIMIT) {
                return ResultDo.build(MessageCode.ERROR_GET_CAPTCHA_NUM_OUT_LIMIT);
            }
            // 校验ip
            int ipCount = messageCaptchaRepository.countByIP(ip);
            if (ipCount > BizConstant.CAPTCHA_SHORT_MSG_IP_NUM_LIMIT) {
                return ResultDo.build(MessageCode.ERROR_GET_CAPTCHA_NUM_OUT_LIMIT);
            }
        }
        return ResultDo.build();
    }

    /**
     * 根据类型返回字符串
     *
     * @param insertPo
     * @return
     */
    private ResultDo getByType(EpMessageCaptchaPo insertPo) {
        // TODO 目前只有短信验证码，直接返回业务编码
        return ResultDo.build().setResult(insertPo.getCaptchaCode());
    }

    /**
     * 验证码校验
     *
     * @param sourceId
     * @param type
     * @param captchaCode
     * @param captchaContent
     */
    public void checkAndHandleCaptcha(Long sourceId, String type, String captchaCode, String captchaContent) {
        // 测试环境支持通用验证码
        if (!SpringComponent.isProduct() && BizConstant.MESSAGE_CAPTCHA_IN_TEST.equals(captchaContent)) {
            return;
        }
        EpMessageCaptchaCaptchaScene scene = EpMessageCaptchaCaptchaScene.member_login;
        if (BizConstant.WECHAT_APP_MEMBER_CLIENT.equals(type)) {
            scene = EpMessageCaptchaCaptchaScene.member_login;
        } else {
            scene = EpMessageCaptchaCaptchaScene.organ_account_login;
        }
        EpMessageCaptchaPo captchaPo = messageCaptchaRepository.getBySourceIdAndCaptchaCode(sourceId,
                EpMessageCaptchaCaptchaType.short_msg,
                scene,
                captchaCode);
        if (captchaPo == null || captchaPo.getExpireTime().before(DateTools.getCurrentDateTime())) {
            throw new BadCredentialsException("验证码无效，请重新获取");
        } else if (!captchaContent.equals(captchaPo.getCaptchaContent())) {
            throw new BadCredentialsException("验证码错误");
        }
        // 验证码使用后删除
        messageCaptchaRepository.delBySourceIdAndTypeAndSence(sourceId,
                EpMessageCaptchaCaptchaType.short_msg,
                scene);
    }


}
