package com.atguigu.admin.config;

import com.atguigu.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Administrator
 * @title: AdminWebConfig
 * @projectName admin
 * @description: TODO
 * @date 2022-04-20-14:05
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//所有请求都会拦截，包括静态请求
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/js/**");//放行请求
    }
}
