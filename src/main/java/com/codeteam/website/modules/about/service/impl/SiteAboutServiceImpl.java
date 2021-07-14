package com.codeteam.website.modules.about.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeteam.website.modules.about.dao.SiteAboutMapper;
import com.codeteam.website.modules.about.entity.dto.SiteAboutResponseDto;
import com.codeteam.website.modules.about.entity.po.SiteAboutPo;
import com.codeteam.website.modules.about.service.SiteAboutService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fyc on 2021-7-12.
 * 关于我们
 */
@Slf4j
@Service
public class SiteAboutServiceImpl extends ServiceImpl<SiteAboutMapper,SiteAboutPo> implements SiteAboutService
{

    @Override
    public List<SiteAboutResponseDto> siteAboutList()
    {
        List<SiteAboutPo> siteAboutPoList = list(new QueryWrapper<SiteAboutPo>().orderByAsc("media_sort"));
        List<SiteAboutResponseDto> siteAboutResponseDtoList = Lists.newArrayList();
        if(CollectionUtils.isNotEmpty(siteAboutPoList))
        {
            siteAboutPoList.forEach(siteAboutPo ->
            {
                SiteAboutResponseDto siteAboutResponseDto = new SiteAboutResponseDto();
                BeanUtils.copyProperties(siteAboutPo,siteAboutResponseDto);
                siteAboutResponseDtoList.add(siteAboutResponseDto);
            });
        }
        return siteAboutResponseDtoList;
    }
}
