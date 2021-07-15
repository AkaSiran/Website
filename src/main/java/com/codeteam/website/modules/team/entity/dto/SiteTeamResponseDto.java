package com.codeteam.website.modules.team.entity.dto;

import com.codeteam.website.common.core.BaseResponseDto;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-13.
 * 团队精英
 */
@Data
public class SiteTeamResponseDto extends BaseResponseDto
{
    /**
     * 姓名
     */
    private String teamName;

    /**
     * 职务
     */
    private String teamPosition;

    /**
     * 头像
     */
    private String teamImg;

    /**
     * 简介
     */
    private String teamDescription;

    /**
     * 排序
     */
    private int teamSort;
}
