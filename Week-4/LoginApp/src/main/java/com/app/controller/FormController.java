package com.app.controller;

import com.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @RequestMapping("/")
    public String showHomePage()
    {
        return "form";
    }

    @RequestMapping("/processForm")
//    public String showHomePage(@ModelAttribute("user") User user)
//    {
//
//
//
//        return "Test";
//    }


    // another way
   public String showHomePage( Model model)
    {
        User user = new User();
        model.addAttribute("user" , user);

        return "Test";
    }


}
