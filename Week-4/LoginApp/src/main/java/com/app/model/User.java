package com.app.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class User {
    private String username,
            password,
            country,
            programmingLanguage,
            operatingSystem;


}
