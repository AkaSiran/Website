package com.codeteam.website.framework.acpect.configurer;

import com.codeteam.website.framework.interceptor.SignInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Fyc on 2021-7-14.
 */
@Configuration
public class SignConfigurer implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        //加载登录适配器
        registry.addInterceptor(new SignInterceptor())
                .addPathPatterns("/site/**")
                .excludePathPatterns("/sys")
                .excludePathPatterns("/sys/login")
                .excludePathPatterns("/static/**", "/templates/**");
    }
}
