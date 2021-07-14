package com.codeteam.website.modules.team.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeteam.website.modules.team.dao.SiteTeamMapper;
import com.codeteam.website.modules.team.entity.dto.SiteTeamResponseDto;
import com.codeteam.website.modules.team.entity.po.SiteTeamPo;
import com.codeteam.website.modules.team.service.SiteTeamService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fyc on 2021-7-13.
 * 团队精英
 */
@Slf4j
@Service
public class SiteTeamServiceImpl extends ServiceImpl<SiteTeamMapper,SiteTeamPo> implements SiteTeamService
{
    @Override
    public List<SiteTeamResponseDto> siteTeamList()
    {
        List<SiteTeamPo> siteTeamPoList = list(new QueryWrapper<SiteTeamPo>().orderByAsc("team_sort"));
        List<SiteTeamResponseDto> siteTeamResponseDtoList = Lists.newArrayList();
        if(CollectionUtils.isNotEmpty(siteTeamPoList))
        {
            siteTeamPoList.forEach(siteTeamPo ->
            {
                SiteTeamResponseDto siteTeamResponseDto = new SiteTeamResponseDto();
                BeanUtils.copyProperties(siteTeamPo,siteTeamResponseDto);
                siteTeamResponseDtoList.add(siteTeamResponseDto);
            });
        }
        return siteTeamResponseDtoList;
    }
}
