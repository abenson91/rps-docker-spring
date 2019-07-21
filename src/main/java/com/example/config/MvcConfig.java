package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.html");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("/WEB-INF/view/login-view/build/static/");
        registry.addResourceHandler("/*.js")
                .addResourceLocations("/WEB-INF/view/login-view/build/");
        registry.addResourceHandler("/*.json")
                .addResourceLocations("/WEB-INF/view/login-view/build/");
        registry.addResourceHandler("/*.ico")
                .addResourceLocations("/WEB-INF/view/login-view/build/");
        registry.addResourceHandler("/index.html")
                .addResourceLocations("/WEB-INF/view/login-view/build/index.html");
        registry.addResourceHandler("/game.html")
                .addResourceLocations("/WEB-INF/view/login-view/build/game.html");
    }

}
