package com.codeteam.website.framework.acpect;

import com.codeteam.website.modules.system.service.SysVisitLogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Fyc on 2021-7-15.
 * 访问日志
 */
@Slf4j
@Aspect
@Component
public class VisitLogAspect
{

    @Autowired
    private SysVisitLogService sysVisitLogService;

    @Pointcut("@annotation(com.codeteam.website.framework.acpect.annotation.VisitLog)")
    public void visitPointcut()
    {
        //System.out.println("自定义注解生效");
    }

    @Before("visitPointcut()")
    public void beforePointcut(JoinPoint joinPoint)
    {
        /*HttpServletRequest request = ServletUtil.getRequest();
        String visitIp = IPUtil.getOuterNetIp(request);
        Date visitTime = new Date();
        log.info("站点访问记录,IP地址={},访问时间={}",visitIp,visitTime);
        SysVisitLogRequestDto sysVisitLogRequestDto = new SysVisitLogRequestDto(visitIp,visitTime);
        sysVisitLogService.saveVisitLog(sysVisitLogRequestDto);*/
    }
}
