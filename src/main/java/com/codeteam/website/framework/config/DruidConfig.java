package com.codeteam.website.framework.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by Fyc on 2021-7-12.
 * 数据源配置
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class DruidConfig
{
    private String url;

    private String username;

    private String password;

    @Bean
    public DataSource getDataSource()
    {
        DruidDataSource source=new DruidDataSource();
        source.setUrl(this.url);
        source.setUsername(this.username);
        source.setPassword(this.password);
        return source;
    }
}
