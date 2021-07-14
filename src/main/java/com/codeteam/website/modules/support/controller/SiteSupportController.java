package com.codeteam.website.modules.support.controller;

import com.codeteam.website.common.core.CommonResult;
import com.codeteam.website.modules.support.service.SiteSupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fyc on 2021-7-12.
 * 技术支持
 */
@RestController
@RequestMapping("/site/support")
public class SiteSupportController
{
    @Autowired
    private SiteSupportService siteSupportService;

    @GetMapping("/list")
    public CommonResult list()
    {
        return CommonResult.success(siteSupportService.list());
    }
}
