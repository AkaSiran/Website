package com.codeteam.website.modules.portfolio.entity.dto;

import com.codeteam.website.common.core.BaseResponseDto;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-12.
 * 产品案例
 */
@Data
public class SitePortfolioResponseDto extends BaseResponseDto
{
    /**
     * 产品名称
     */
    private String portfolioHeading;

    /**
     * 内容简介
     */
    private String portfolioBody;

    /**
     * 背景图片
     */
    private String portfolioImg;

    /**
     * 详情链接
     */
    private String portfolioDetail;

    /**
     * 排序
     */
    private int portfolioSort;
}
