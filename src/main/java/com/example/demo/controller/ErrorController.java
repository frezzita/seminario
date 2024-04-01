package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/error")
    public String handleError() {
        // Handle error logic here, for example, return a custom error page
        return "error"; // Assuming you have an "error.html" file in your resources/templates directory
    }
}
