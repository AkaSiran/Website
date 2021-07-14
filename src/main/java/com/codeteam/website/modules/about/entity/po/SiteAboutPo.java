package com.codeteam.website.modules.about.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.codeteam.website.common.core.BasePo;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-12.
 * 关于我们
 */
@Data
@TableName("site_about")
public class SiteAboutPo extends BasePo<SiteAboutPo>
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
