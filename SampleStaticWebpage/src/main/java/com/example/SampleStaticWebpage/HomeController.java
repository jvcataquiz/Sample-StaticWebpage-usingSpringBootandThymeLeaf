package com.example.SampleStaticWebpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class HomeController {
    @GetMapping
    public String Home(Model model){
        model.addAttribute("something", "Welcome to my Landing page!");
        model.addAttribute("listofperson", Arrays.asList(
                new Person("Nora", "Aunor", "E", 56),
                new Person("John", "Dela Cruz", "D", 23),
                new Person("Juan", "Tamad", "G" , 45)
        ));
        return "index";
    }
}
