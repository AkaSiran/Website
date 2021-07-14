package com.codeteam.website.modules.support.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeteam.website.modules.support.entity.dto.SiteSupportResponseDto;
import com.codeteam.website.modules.support.entity.po.SiteSupportPo;

import java.util.List;

/**
 * Created by Fyc on 2021-7-12.
 * 技术支持
 */
public interface SiteSupportService extends IService<SiteSupportPo>
{
    /**
     * 技术支持列表
     * @return
     */
    List<SiteSupportResponseDto> siteSupportList();
}
