package com.codeteam.website.modules.team.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeteam.website.modules.team.entity.dto.SiteTeamResponseDto;
import com.codeteam.website.modules.team.entity.po.SiteTeamPo;

import java.util.List;

/**
 * Created by Fyc on 2021-7-13.
 * 团队精英
 */
public interface SiteTeamService extends IService<SiteTeamPo>
{
    /**
     * 团队精英列表
     * @return
     */
    List<SiteTeamResponseDto> siteTeamList();
}
