package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld(String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
