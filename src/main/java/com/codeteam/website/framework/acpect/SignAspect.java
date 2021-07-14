package com.codeteam.website.framework.acpect;

import com.codeteam.website.common.utils.ServletUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Fyc on 2021-7-14.
 * 接口鉴权
 */
@Slf4j
@Aspect
@Component
public class SignAspect
{
    @Pointcut("@annotation(com.codeteam.website.framework.acpect.annotation.Sign)")
    public void historyPointcut()
    {
        System.out.println("自定义注解生效");
    }

    @Before("historyPointcut()")
    public void beforePointcut(JoinPoint joinPoint)
    {
        HttpServletRequest request = ServletUtil.getRequest();
        //log.info("自定义注解生效");
        // 此处进入到方法前  可以实现一些业务逻辑
    }

}
