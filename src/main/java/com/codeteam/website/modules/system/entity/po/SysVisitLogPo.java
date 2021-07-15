package com.codeteam.website.modules.system.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.codeteam.website.common.core.BasePo;
import lombok.Data;

import java.util.Date;

/**
 * Created by Fyc on 2021-7-15.
 * 访问日志
 */
@Data
@TableName("sys_visit_log")
public class SysVisitLogPo extends BasePo<SysVisitLogPo>
{
    private String visitIp;

    private Date visitTime;
}
