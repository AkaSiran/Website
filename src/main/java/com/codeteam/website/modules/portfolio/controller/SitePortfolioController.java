package com.codeteam.website.modules.portfolio.controller;

import com.codeteam.website.common.core.CommonResult;
import com.codeteam.website.framework.acpect.annotation.OperateHistory;
import com.codeteam.website.framework.acpect.annotation.Sign;
import com.codeteam.website.framework.acpect.enums.ApiType;
import com.codeteam.website.modules.portfolio.service.SitePortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fyc on 2021-7-12.
 * 产品案例
 */
@RestController
@RequestMapping("/site/portfolio")
public class SitePortfolioController
{

    @Autowired
    private SitePortfolioService sitePortfolioService;

    @Sign
    @OperateHistory(title = "产品案例",name = "产品案例列表",apiType = ApiType.SELECT)
    @GetMapping("/list")
    public CommonResult list()
    {
        return CommonResult.success(sitePortfolioService.sitePortfolioList());
    }
}
