package org.Vehicles.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.Vehicles")
@PropertySource("classpath:application.properties")
public class config {
    public  config(){
    }

}
