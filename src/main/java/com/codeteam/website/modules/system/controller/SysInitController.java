package com.codeteam.website.modules.system.controller;

import com.codeteam.website.framework.acpect.annotation.Sign;
import com.codeteam.website.framework.acpect.annotation.VisitLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fyc on 2021-7-23.
 * 系统初始化
 */
@RequestMapping("/site/init")
@RestController
public class SysInitController
{

    /**
     * 站点访问记录
     */
    @Sign
    @VisitLog
    @GetMapping("/record")
    public void visitRecord()
    {

    }
}
