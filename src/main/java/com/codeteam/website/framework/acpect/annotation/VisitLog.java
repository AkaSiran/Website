package com.codeteam.website.framework.acpect.annotation;

import java.lang.annotation.*;

/**
 * Created by Fyc on 2021-7-15.
 * 访问日志
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface VisitLog
{
}
