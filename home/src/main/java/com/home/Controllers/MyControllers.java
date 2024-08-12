package com.home.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyControllers {
    @RequestMapping("/home")
    public String home(Model model)
    {
        model.addAttribute("name","Welcome To The Home Page.");
        model.addAttribute("youtubeChannel","Learn Code With Durgesh");
        model.addAttribute("githubRepo", "https://www.youtube.com/watch?v=SAqi7zmW1fY");
        return "home";
    }


    //about page
    @RequestMapping("/about")
    public String aboutPage(Model model)
    {
        model.addAttribute("isLogin", false);
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicesPage()
    {
        return "services";
    }
}
