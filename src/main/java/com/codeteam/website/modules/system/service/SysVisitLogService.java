package com.codeteam.website.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeteam.website.modules.system.entity.dto.SysVisitLogRequestDto;
import com.codeteam.website.modules.system.entity.po.SysVisitLogPo;

/**
 * Created by Fyc on 2021-7-15.
 * 访问日志
 */
public interface SysVisitLogService extends IService<SysVisitLogPo>
{
    /**
     * 新增访问日志
     * @param sysVisitLogRequestDto
     */
    void saveVisitLog(SysVisitLogRequestDto sysVisitLogRequestDto);
}
