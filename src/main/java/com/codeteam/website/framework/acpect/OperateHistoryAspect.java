package com.codeteam.website.framework.acpect;

import com.alibaba.fastjson.JSON;
import com.codeteam.website.common.utils.ServletUtil;
import com.codeteam.website.framework.acpect.annotation.OperateHistory;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by Fyc on 2021-7-15.
 * 操作历史
 */
@Slf4j
@Aspect
@Component
public class OperateHistoryAspect
{

    @Pointcut("@annotation(com.codeteam.website.framework.acpect.annotation.OperateHistory)")
    public void operatePointcut()
    {
        //System.out.println("自定义注解生效");
    }

    @Before("operatePointcut()")
    public void beforePointcut(JoinPoint joinPoint)
    {
        //log.info("自定义注解生效");
        // 此处进入到方法前  可以实现一些业务逻辑
    }

    @Around("operatePointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable
    {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();// 获取参数值
        String params = argsArrayToString(args);
        return joinPoint.proceed();
    }

    @AfterReturning("operatePointcut()")
    public void doAfterReturning(JoinPoint joinPoint)
    {
        controllerMethodDescription(joinPoint);
    }

    @AfterThrowing(value = "operatePointcut()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Exception e)
    {
        controllerMethodDescription(joinPoint);
        if(null!=e)
        {
            log.info("异常信息={}", StringUtils.substring(e.getMessage(), 0, 2000));
        }
    }

    public void controllerMethodDescription(JoinPoint joinPoint)
    {
        try
        {
            OperateHistory history = getAnnotationHistory(joinPoint);
            //获取方法名称
            String className = joinPoint.getTarget().getClass().getName();
            String methodName = joinPoint.getSignature().getName();
            String methodFullName = className+"."+methodName+"()";
            // 获取请求方式
            String requestMethod = ServletUtil.getRequest().getMethod();
            // 获取请求路径
            String requestUrl = ServletUtil.getRequest().getRequestURI();
            // 获取参数值
            Object[] args = joinPoint.getArgs();
            String requestParams = argsArrayToString(args);
            // 获取业务类型
            String businessType = history.apiType().name();
            // 获取操作类型
            String operatorType = history.operatorType().name();
            // 获取模块标题
            String title = history.title();
            // 获取业务名称
            String name = history.name();
            log.info("模块标题 = {}, 业务名称 = {}, 业务类型 = {}, 操作类型 = {}, 方法名称 = {}, 请求方式 = {}, 请求路径 = {}, 请求参数 = {}",title,name,businessType,operatorType,methodFullName,requestMethod,requestUrl,requestParams);
        }catch (Exception e)
        {
            log.error("===通知异常===");
            log.error("异常信息:{}", e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * 获取注解
     * @param joinPoint
     * @return
     * @throws Exception
     */
    private OperateHistory getAnnotationHistory(JoinPoint joinPoint) throws Exception
    {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if (method != null)
        {
            return method.getAnnotation(OperateHistory.class);
        }
        return null;
    }

    /**
     * 参数拼装
     * @param paramsArray
     * @return
     */
    private String argsArrayToString(Object[] paramsArray)
    {
        String params = "";
        if (paramsArray != null && paramsArray.length > 0)
        {
            for (int i = 0; i < paramsArray.length; i++)
            {
                if (!isFilterObject(paramsArray[i]))
                {
                    Object jsonObj = JSON.toJSON(paramsArray[i]);
                    params += jsonObj.toString() + " ";
                }
            }
        }
        return params.trim();
    }

    /**
     * 判断是否需要过滤的对象
     * @param o 对象信息
     * @return 如果是需要过滤的对象，则返回true；否则返回false
     */
    public boolean isFilterObject(final Object o)
    {
        return o instanceof MultipartFile || o instanceof HttpServletRequest || o instanceof HttpServletResponse;
    }
}
