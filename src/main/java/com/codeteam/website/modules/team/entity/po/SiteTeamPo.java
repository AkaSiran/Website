package com.codeteam.website.modules.team.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.codeteam.website.common.core.BasePo;
import lombok.Data;

/**
 * Created by Fyc on 2021-7-12.
 * 团队精英
 */
@Data
@TableName("site_team")
public class SiteTeamPo extends BasePo<SiteTeamPo>
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
