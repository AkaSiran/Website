package com.codeteam.website.framework.acpect.annotation;

import com.codeteam.website.framework.acpect.enums.ApiType;
import com.codeteam.website.framework.acpect.enums.OperatorType;

import java.lang.annotation.*;

/**
 * Created by Fyc on 2021-7-15.
 * 操作历史
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperateHistory
{
    String title() default "";

    String name() default "";

    ApiType apiType() default ApiType.OTHER;

    OperatorType operatorType() default OperatorType.FRONT;
}
