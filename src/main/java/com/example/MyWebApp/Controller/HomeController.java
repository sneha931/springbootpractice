package com.example.MyWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")

    public String demo(){
        return "Hello sneha";
    }
    @RequestMapping("/about")
    public String about(){
        return "this is about me section";
    }
}
