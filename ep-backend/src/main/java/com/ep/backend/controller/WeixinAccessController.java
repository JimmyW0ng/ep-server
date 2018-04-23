package com.ep.backend.controller;

import com.ep.common.tool.WeixinTools;
import com.ep.common.tool.weixin.TokenUtil;
import com.ep.domain.service.WeixinService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 12:20 2018/4/22
 */
@Controller
@RequestMapping("security/weixin/access")
public class WeixinAccessController {
    @Autowired
    private WeixinService weixinService;
    @Value("${weixin4j.token}")
    private String weixinToken;
    @Value("${weixin.id}")
    private String weixinId;


    @RequestMapping(method = RequestMethod.GET)
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 微信加密签名
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        String token = weixinToken;
        //成为开发者验证
        String echostr = request.getParameter("echostr");
        //确认此次GET请求来自微信服务器，原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败
        if (TokenUtil.checkSignature(token, signature, timestamp, nonce)) {
            response.getWriter().write(echostr);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public void post(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        String token = weixinToken;
        //确认此次GET请求来自微信服务器，原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败
        if (!TokenUtil.checkSignature(token, signature, timestamp, nonce)) {
            //消息不可靠，直接返回
            response.getWriter().write("");
            return;
        }
        //用户每次向公众号发送消息、或者产生自定义菜单点击事件时，响应URL将得到推送
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/xml");
        Map<String, String> requestMap = WeixinTools.xmlToMap(request);
        String content = weixinService.postReq(requestMap);
        if (null != content) {
            Map<String, String> responseMap = Maps.newHashMap();
            responseMap.put("Content", content);
            responseMap.put("CreateTime", requestMap.get("CreateTime"));
            responseMap.put("ToUserName", requestMap.get("FromUserName"));
            responseMap.put("FromUserName", weixinId);
            responseMap.put("MsgType", "text");
            String xml = WeixinTools.mapToXmlString(responseMap);
            try {
            response.getWriter().write(xml);
            } catch (IOException e) {
                response.getWriter().write("");
            }
        }
    }


}
