package com.codeteam.website.modules.about.entity.dto;

import com.codeteam.website.common.core.BaseResponseDto;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-12.
 * 关于我们
 */
@Data
public class SiteAboutResponseDto extends BaseResponseDto
{
    /**
     * 标题
     */
    private String mediaHeading;

    /**
     * 内容
     */
    private String mediaBody;

    /**
     * 排序
     */
    private int mediaSort;

    /**
     * 图标
     */
    private String mediaIcon;
}
