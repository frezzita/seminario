package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeControllerTest {

    @GetMapping("/test")
    public String home(Model model) {
    	model.addAttribute("message", "Welcome to my application");
        return "index";
    }
}
