package com.codeteam.website.modules.about.controller;

import com.codeteam.website.common.core.CommonResult;
import com.codeteam.website.framework.acpect.annotation.Sign;
import com.codeteam.website.modules.about.service.SiteAboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fyc on 2021-7-12.
 * 关于我们
 */
@RequestMapping("/site/about")
@RestController
public class SiteAboutController
{
    @Autowired
    private SiteAboutService siteAboutService;

    @Sign
    @GetMapping("/list")
    public CommonResult list()
    {
        return CommonResult.success(siteAboutService.list());
    }
}
