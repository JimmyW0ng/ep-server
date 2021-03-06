package com.ep.api.filter;

import com.ep.api.security.ApiSecurityAuthComponent;
import com.ep.common.tool.IpTools;
import com.ep.common.tool.StringTools;
import com.ep.domain.constant.BizConstant;
import com.ep.domain.pojo.ResultDo;
import com.ep.domain.pojo.bo.ApiPrincipalBo;
import com.ep.domain.pojo.po.EpTokenPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * @Description: api鉴权过滤器
 * @Author: J.W
 * @Date: 下午4:41 2018/1/9
 */
@Slf4j
@Component
public class ApiSecurityTokenAuthFilter extends OncePerRequestFilter {

    @Value("${token.header.name}")
    private String tokenHeaderName;

    @Value("${token.header.prefix}")
    private String tokenHeaderPrefix;

    @Autowired
    private ApiSecurityAuthComponent securityAuthComponent;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String authHeader = request.getHeader(this.tokenHeaderName);
        // 没有token
        if (StringTools.isBlank(authHeader)) {
            chain.doFilter(request, response);
            return;
        }
        log.info("鉴权:token={},完毕！", authHeader);
        if (!authHeader.startsWith(tokenHeaderPrefix)) {
            log.error("token格式错误！");
            chain.doFilter(request, response);
            return;
        }
        authHeader = authHeader.substring(tokenHeaderPrefix.length() + BizConstant.DB_NUM_ONE);
        // 解析token
        ResultDo<EpTokenPo> checkToken = securityAuthComponent.getTokenInfo(authHeader, IpTools.getIpAddr(request));
        if (checkToken.isError()) {
            log.error("验证token不通过, error={}, desc={}", checkToken.getError(), checkToken.getErrorDescription());
            chain.doFilter(request, response);
            return;
        }
        EpTokenPo tokenPo = checkToken.getResult();
        // 加载当前用户信息
        ResultDo checkUser = securityAuthComponent.loadCurrentUserInfo(tokenPo);
        if (checkUser.isError()) {
            log.error("加载当前用户信息不通过, error={}, desc={}", checkToken.getError(), checkToken.getErrorDescription());
            chain.doFilter(request, response);
            return;
        }
        // 加载当前用户权限
        ApiPrincipalBo principalBo = new ApiPrincipalBo();
        principalBo.setUserName(tokenPo.getMobile().toString());
        principalBo.setRole(tokenPo.getRole());
        Collection<GrantedAuthority> authorities = securityAuthComponent.getPermissionByRoleCode(principalBo.getRole());
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(principalBo, null, authorities);
        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request, response);
        log.info("鉴权:token={}, username={},完毕！", authHeader, principalBo.getUserName());
    }

}
