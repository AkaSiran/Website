package com.codeteam.website.modules.system.controller;

import com.codeteam.website.common.utils.IPUtil;
import com.codeteam.website.modules.system.entity.dto.SysVisitLogRequestDto;
import com.codeteam.website.modules.system.service.SysVisitLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Fyc on 2021-7-13.
 * 系统页面
 */
@Slf4j
@Controller
@RequestMapping("/sys/page")
public class SysPageController
{

    @Autowired
    private SysVisitLogService visitLogService;

    @GetMapping("/index")
    public String index(HttpServletRequest request)
    {
        String visitIp = IPUtil.getOuterNetIp(request);
        Date visitTime = new Date();
        log.info("站点访问记录,IP地址 = {},访问时间 = {}",visitIp,visitTime);
        SysVisitLogRequestDto sysVisitLogRequestDto = new SysVisitLogRequestDto(visitIp,visitTime);
        visitLogService.saveVisitLog(sysVisitLogRequestDto);
        return "index";
    }
}
