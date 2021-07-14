package com.codeteam.website.common.exception;

import com.codeteam.website.common.core.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Fyc on 2021-7-14.
 * 全局异常捕获
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler
{

    /**
     * 业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = CustomException.class)
    public CommonResult handleCustomException(CustomException e)
    {
        log.error("业务异常,异常码={},异常原因={}",e.getCode(),e.getMessage());
        return CommonResult.error(e.getCode(),e.getMessage());
    }

    /**
     * 空指针异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    public CommonResult handleNullPointerException(NullPointerException e)
    {
        log.error("空指针异常,异常原因={}",e.getMessage());
        return CommonResult.error("空指针异常");
    }

    /**
     * 其它异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public CommonResult handleException(Exception e)
    {
        log.error("未知异常,异常原因={}",e.getMessage());
        return CommonResult.error("位置异常");
    }
}
