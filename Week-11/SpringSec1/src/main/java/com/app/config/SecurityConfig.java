package com.app.config;

import org.apache.catalina.filters.HttpHeaderSecurityFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Ebrahim").password("{noop}123").roles("ADMIN")
                .and()
                .withUser("Mohamed").password("{noop}456").roles("SYSTEM");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .antMatchers("/adminPage").hasAnyRole("ADMIN")
                .antMatchers("/systemPage").hasRole("SYSTEM")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/showLoginPage")
                .loginProcessingUrl("/authenticateUser")
                //.defaultSuccessUrl("/", true)
                    .and()
                    .logout()
                    .permitAll();


    }

}
