package com.codeteam.website.modules.portfolio.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeteam.website.modules.portfolio.entity.dto.SitePortfolioResponseDto;
import com.codeteam.website.modules.portfolio.entity.po.SitePortfolioPo;

import java.util.List;

/**
 * Created by Fyc on 2021-7-12.
 * 产品案例
 */
public interface SitePortfolioService extends IService<SitePortfolioPo>
{
    /**
     * 产品案例列表
     * @return
     */
    List<SitePortfolioResponseDto> sitePortfolioList();
}
