package com.app.controller;

import com.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("user") User user)
    {

        return "form";
    }


    @RequestMapping("/processForm")
    // you can use @ModelAttribute("user"). you should make sure th attribute name 'user'
    // the same name as home page attribute we added to model
    public String showProcess(User user , Model model)
    {
        model.addAttribute(user);
        return "Result";
    }


//    // another way
//   public String showHomePage( Model model)
//    {
//        User user = new User();
//        model.addAttribute("user" , user);
//
//        return "Test";
//    }


}
