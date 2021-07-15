package com.codeteam.website.modules.system.entity.dto;

import com.codeteam.website.common.core.BaseRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Fyc on 2021-7-15.
 * 访问日志
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysVisitLogRequestDto extends BaseRequestDto
{
    private String visitIp;

    private Date visitTime;
}
