package com.codeteam.website.modules.support.entity.dto;

import com.codeteam.website.common.core.BaseResponseDto;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-12.
 * 技术支持
 */
@Data
public class SiteSupportResponseDto extends BaseResponseDto
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
