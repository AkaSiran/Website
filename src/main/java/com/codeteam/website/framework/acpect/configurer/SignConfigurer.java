package com.codeteam.website.framework.acpect.configurer;

import com.codeteam.website.framework.interceptor.SignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Fyc on 2021-7-14.
 * 拦截配置
 */
@Configuration
public class SignConfigurer implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        // 登录拦截器
        InterceptorRegistration registration =  registry.addInterceptor(getSignInterceptor());

        registration.addPathPatterns("/**");

        registration.addPathPatterns("/site/**")
                .excludePathPatterns("/sys")
                .excludePathPatterns("/sys/login")
                .excludePathPatterns("/**/*.js","/**/*.css","/**/*.jpg","/**/*.png",
                                     "/**/*.woff2","/**/*.woff","/**/*.ttf","/**/*.otf",
                                     "/**/*.eot","/**/*.svg","/**/*.html");
    }

    @Bean
    public SignInterceptor getSignInterceptor()
    {
        return new SignInterceptor();
    }
}
