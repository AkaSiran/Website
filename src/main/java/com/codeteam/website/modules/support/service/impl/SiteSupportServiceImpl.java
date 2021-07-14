package com.codeteam.website.modules.support.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeteam.website.modules.support.dao.SiteSupportMapper;
import com.codeteam.website.modules.support.entity.dto.SiteSupportResponseDto;
import com.codeteam.website.modules.support.entity.po.SiteSupportPo;
import com.codeteam.website.modules.support.service.SiteSupportService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fyc on 2021-7-12.
 * 技术支持
 */
@Slf4j
@Service
public class SiteSupportServiceImpl extends ServiceImpl<SiteSupportMapper,SiteSupportPo> implements SiteSupportService
{
    @Override
    public List<SiteSupportResponseDto> siteSupportList()
    {
        List<SiteSupportPo> siteSupportPoList = list(new QueryWrapper<SiteSupportPo>().orderByAsc("support_sort"));
        List<SiteSupportResponseDto> siteSupportResponseDtoList = Lists.newArrayList();
        if(CollectionUtils.isNotEmpty(siteSupportPoList))
        {
            siteSupportPoList.forEach(siteSupportPo ->
            {
                SiteSupportResponseDto siteSupportResponseDto = new SiteSupportResponseDto();
                BeanUtils.copyProperties(siteSupportPo,siteSupportResponseDto);
                siteSupportResponseDtoList.add(siteSupportResponseDto);
            });
        }
        return siteSupportResponseDtoList;
    }
}
