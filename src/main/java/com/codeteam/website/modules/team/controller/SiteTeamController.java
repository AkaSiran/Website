package com.codeteam.website.modules.team.controller;

import com.codeteam.website.common.core.CommonResult;
import com.codeteam.website.framework.acpect.annotation.Sign;
import com.codeteam.website.modules.team.service.SiteTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fyc on 2021-7-13.
 * 团队精英
 */
@RequestMapping("/site/team")
@RestController
public class SiteTeamController
{

    @Autowired
    private SiteTeamService siteTeamService;

    @Sign
    @GetMapping("/list")
    public CommonResult list()
    {
        return  CommonResult.success(siteTeamService.siteTeamList());
    }
}
