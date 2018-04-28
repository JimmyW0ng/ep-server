package com.ep.backend.controller;

import com.ep.common.tool.DateTools;
import com.ep.common.tool.WechatTools;
import com.ep.common.tool.wechat.TokenTools;
import com.ep.domain.constant.BizConstant;
import com.ep.domain.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 12:20 2018/4/22
 */
@Controller
@RequestMapping("security/wechat/access")
public class WechatAccessController {
    @Autowired
    private WechatService wechatService;
    @Value("${wechat.fwh.token}")
    private String wechatFwhToken;
    @Value("${wechat.fwh.id}")
    private String wechatFwhId;


    @Value("${wechat.fwh.appid}")
    private String wechatFwhAppid;
    @Value("${wechat.fwh.secret}")
    private String wechatFwhSecret;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 微信加密签名
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        String token = wechatFwhToken;
        //成为开发者验证
        String echostr = request.getParameter("echostr");
        //确认此次GET请求来自微信服务器，原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败
        if (TokenTools.checkSignature(token, signature, timestamp, nonce)) {
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
        String token = wechatFwhToken;
        //确认此次GET请求来自微信服务器，原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败
        if (!TokenTools.checkSignature(token, signature, timestamp, nonce)) {
            //消息不可靠，直接返回
            response.getWriter().write("");
            return;
        }
        //用户每次向公众号发送消息、或者产生自定义菜单点击事件时，响应URL将得到推送
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/xml");
        Map<String, String> requestMap = WechatTools.xmlToMap(request);
        Map<String, String> responseMap = wechatService.postReq(requestMap);
        responseMap.put("CreateTime", String.valueOf(DateTools.getCurrentDate().getTime()));
        responseMap.put("ToUserName", requestMap.get("FromUserName"));
        responseMap.put("FromUserName", wechatFwhId);
        String xml = WechatTools.mapToXmlString(responseMap);
        try {
            response.getWriter().write(xml);
        } catch (IOException e) {
            response.getWriter().write("");
        }

    }

    @GetMapping("test")
    public void test(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/xml");
//        Map<String, String> requestMap = WechatTools.xmlToMap(request);
//        Map<String, String> responseMap = wechatService.postReq(requestMap);

        String url = String.format(BizConstant.WECHAT_URL_ACCESS_TOKEN, wechatFwhAppid, wechatFwhSecret);
        ResponseEntity<HashMap> responseEntity = restTemplate.getForEntity(url, HashMap.class);
        if (HttpStatus.OK.equals(responseEntity.getStatusCode())) {

            Map<String, Object> responseMap = responseEntity.getBody();
            System.out.println(responseMap);
            String access_token = (String) responseMap.get("access_token");
            String expires_in = responseMap.get("expires_in").toString();
            System.out.println(access_token);
            System.out.println(expires_in);
            wechatService.msgCustomSend(access_token, "oNn9k0vtlBRPyCN7dF1l_MuDkUvY", "hello world");
        }


    }
}
