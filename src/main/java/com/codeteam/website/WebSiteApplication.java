package com.codeteam.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Fyc on 2021-7-9.
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.codeteam.website.modules.*.dao")
public class WebSiteApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WebSiteApplication.class, args);
    }
}
