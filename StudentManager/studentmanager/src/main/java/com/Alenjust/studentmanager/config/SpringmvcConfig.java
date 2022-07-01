package com.Alenjust.studentmanager.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.Alenjust.studentmanager.interceptors.LoginInterceptor;

/**
 * @Classname SpringmvcConfig
 * @Description 扩展springmvc功能
 * @Date 2021/7/26
 * @Created Alenjust
 */
@Component
public class SpringmvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/system/login","/system/checkCode",
        		"/easyui/**","/h-ui/**","/upload/**",
        		"/tostudent","/studentregister",
        		"/toteacher","/teacherregister",
        		"/toadmin","/adminregister"
        		);
    }
}
