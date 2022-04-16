//package com.my_blogs_system.config;
//
//import com.my_blogs_system.handler.LoginInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//public class NewWebMVCConfig extends WebMvcConfigurationSupport {
//    @Autowired
//    private LoginInterceptor loginInterceptor;
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry){
//        registry.addMapping("/**").allowedOrigins("http://localhost:8080");
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(loginInterceptor)
//                .addPathPatterns("/test")
//                .addPathPatterns("/comments/create/change")
//                .addPathPatterns("/articles/publish");
//        super.addInterceptors(registry);
//    }
//}
