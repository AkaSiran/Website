package com.codeteam.website.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeteam.website.modules.system.dao.SysVisitLogMapper;
import com.codeteam.website.modules.system.entity.dto.SysVisitLogRequestDto;
import com.codeteam.website.modules.system.entity.po.SysVisitLogPo;
import com.codeteam.website.modules.system.service.SysVisitLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Fyc on 2021-7-15.
 * 访问日志
 */
@Slf4j
@Service
public class SysVisitLogServiceImpl extends ServiceImpl<SysVisitLogMapper,SysVisitLogPo> implements SysVisitLogService
{
    @Override
    public void saveVisitLog(SysVisitLogRequestDto sysVisitLogRequestDto)
    {
        SysVisitLogPo sysVisitLogPo = new SysVisitLogPo();
        BeanUtils.copyProperties(sysVisitLogRequestDto,sysVisitLogPo);
        save(sysVisitLogPo);
    }
}
