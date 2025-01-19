package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
@ComponentScan("com.app")
@EnableWebMvc
public class webConfig implements WebMvcConfigurer {
    @Override
    //mapping Requests to Static Resources
    //
    //When a request URL matches a static resource, Spring MVC checks these default directories
    // (or custom ones defined via a ResourceHandler)
    // and serves the resource without involving controllers.
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // will work in it
        registry.addResourceHandler("/resources/**")
                // location of the resource handler
                .addResourceLocations("/resources/").setCachePeriod(3600);
    }

}
