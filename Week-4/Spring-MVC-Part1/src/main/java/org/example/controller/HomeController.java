package org.example.controller;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        return "homePage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request , Model model){
        // get data from request
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        // processing
        int years = LocalDate.now().getYear() - Integer.parseInt(year);
        int months = LocalDate.now().getMonthValue() - Integer.parseInt(month);
        int days = LocalDate.now().getDayOfMonth()-  Integer.parseInt(day);

        // adding data to the model
        model.addAttribute("year" , years);
        model.addAttribute("month" , months);
        model.addAttribute("day" , days);

        // return model with view page
        return "resultPage";
    }


}

