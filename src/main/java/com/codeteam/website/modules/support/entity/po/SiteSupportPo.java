package com.codeteam.website.modules.support.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.codeteam.website.common.core.BasePo;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-12.
 * 技术支持
 */
@Data
@TableName("site_support")
public class SiteSupportPo extends BasePo<SiteSupportPo>
{
    /**
     * 标题
     */
    private String supportHeading;

    /**
     * 内容
     */
    private String supportBody;

    /**
     * 排序
     */
    private int supportSort;

    /**
     * 图标
     */
    private String supportIcon;
}
