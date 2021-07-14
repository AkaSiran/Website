package com.codeteam.website.framework.acpect.annotation;

import java.lang.annotation.*;

/**
 * Created by Fyc on 2021-7-14.
 * 接口鉴权
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Sign
{

}
