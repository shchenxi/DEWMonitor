package com.microraindrop.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by 田圃森 on 2019/2/11.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
// 换成下面的方法有问题
// public class WebMvcConfig extends WebMvcConfigurationSupport {


    // 跨域问题　https://www.cnblogs.com/yuansc/p/9076604.html
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }
}
