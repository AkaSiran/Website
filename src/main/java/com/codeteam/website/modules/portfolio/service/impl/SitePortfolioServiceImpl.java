package com.codeteam.website.modules.portfolio.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeteam.website.modules.portfolio.dao.SitePortfolioMapper;
import com.codeteam.website.modules.portfolio.entity.dto.SitePortfolioResponseDto;
import com.codeteam.website.modules.portfolio.entity.po.SitePortfolioPo;
import com.codeteam.website.modules.portfolio.service.SitePortfolioService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fyc on 2021-7-12.
 * 产品案例
 */
@Slf4j
@Service
public class SitePortfolioServiceImpl extends ServiceImpl<SitePortfolioMapper,SitePortfolioPo> implements SitePortfolioService
{
    @Override
    public List<SitePortfolioResponseDto> sitePortfolioList()
    {
        List<SitePortfolioPo> sitePortfolioPoList = list(new QueryWrapper<SitePortfolioPo>().orderByAsc("portfolio_sort"));
        List<SitePortfolioResponseDto> sitePortfolioResponseDtoList = Lists.newArrayList();
        if(CollectionUtils.isNotEmpty(sitePortfolioPoList))
        {
            sitePortfolioPoList.forEach(sitePortfolioPo ->
            {
                SitePortfolioResponseDto sitePortfolioResponseDto = new SitePortfolioResponseDto();
                BeanUtils.copyProperties(sitePortfolioPo,sitePortfolioResponseDto);
                sitePortfolioResponseDtoList.add(sitePortfolioResponseDto);
            });
        }
        return sitePortfolioResponseDtoList;
    }
}
