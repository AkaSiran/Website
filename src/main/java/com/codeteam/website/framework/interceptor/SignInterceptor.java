package com.codeteam.website.framework.interceptor;

import com.codeteam.website.common.exception.CustomException;
import com.codeteam.website.framework.acpect.annotation.Sign;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;
import org.springframework.util.DigestUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Fyc on 2021-7-14.
 */
@Slf4j
@Component
public class SignInterceptor implements HandlerInterceptor
{

    @Override
    //preHandle:在方法调用前使用
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        Sign annotation;
        if (handler instanceof HandlerMethod)
        {
            annotation = ((HandlerMethod) handler).getMethodAnnotation(Sign.class);
        }
        else
        {
            return true;
        }
        if (annotation == null)
        {
            return true;
        }
        String sign = request.getHeader("sign");
        if(StringUtils.isBlank(sign))
        {
            throw new CustomException("未获取到鉴权签名值");
        }
        String decodeStr = new String(Base64Utils.decodeFromString(sign));
        String[] params = decodeStr.split("_");
        if(params.length<3)
        {
            throw new CustomException("鉴权签名值解释失败");
        }
        String apiName = params[0];
        String currentTime = params[1];
        String md5Value = params[2];
        String md5Param = DigestUtils.md5DigestAsHex((apiName+"_"+currentTime).getBytes());
        if(!md5Value.equals(md5Param))
        {
            log.info("传入签名值={},转换签名值={}",md5Value,md5Param);
            throw new CustomException("鉴权签名值验证失败");
        }else
        {
            log.info("success");
        }
        return true;
    }
}
