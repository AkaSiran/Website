package com.codeteam.website.modules.about.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeteam.website.modules.about.entity.dto.SiteAboutResponseDto;
import com.codeteam.website.modules.about.entity.po.SiteAboutPo;

import java.util.List;

/**
 * Created by Fyc on 2021-7-12.
 * 关于我们
 */
public interface SiteAboutService extends IService<SiteAboutPo>
{

    /**
     * 关于我们列表
     * @return
     */
    List<SiteAboutResponseDto> siteAboutList();
}
