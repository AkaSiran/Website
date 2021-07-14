package com.codeteam.website.modules.portfolio.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.codeteam.website.common.core.BasePo;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-12.
 * 产品案例
 */
@Data
@TableName("site_portfolio")
public class SitePortfolioPo extends BasePo<SitePortfolioPo>
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
