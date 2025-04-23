package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showHome(){
        return "homePage";
    }

    @GetMapping("/adminPage")
    public String showAdmin(){
        return "adminPage";
    }

    @GetMapping("/systemPage")
    public String showSystem(){
        return "systemPage";
    }
    @GetMapping("/showLoginPage")
    public String login(){
        return "loginPage";
    }

}
