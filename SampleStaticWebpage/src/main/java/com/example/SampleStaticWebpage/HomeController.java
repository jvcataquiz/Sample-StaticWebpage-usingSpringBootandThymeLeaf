package com.example.SampleStaticWebpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String Home(Model model){
        model.addAttribute("something", "Welcome to my Landing page!");
        return "index";
    }
}
