package com.example.demo.controller;

import com.example.demo.model.Config;
import com.example.demo.model.Expense;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.repository.ConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

//@RestController
@Controller
public class ConfigController {

    private static final Logger log = LoggerFactory.getLogger(ConfigController.class);
    @Autowired
    private ConfigRepository configRepository;
	
    @GetMapping("/config")
    public String home(Model model) {
        // List<Config> config = configRepository.findAll();
        // model.addAttribute("config", config);
        return "config";
    }
    
    @GetMapping("/view-config")
    public String viewConfig(Model model) {
        List<Config> config = configRepository.findAll();
        model.addAttribute("config", config);
        return "view_config";
    }

    @PostMapping("/save-config")
    public String addConfig(@RequestParam Map<String, String> requestParams, Model model) {
        List<String> apartments = new ArrayList<>();
        List<Double> percentages = new ArrayList<>();

        // Process the received parameters
        for (Map.Entry<String, String> entry : requestParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            // Check if the parameter is an apartment parameter
            if (key.startsWith("apartment[")) {
                apartments.add(value);
            }
            
            // Check if the parameter is a percentage parameter
            if (key.startsWith("percentage[")) {
                percentages.add(Double.parseDouble(value));
            }
        }

        // Process the collected arrays
        for (int i = 0; i < apartments.size(); i++) {           
            // Process apartment and percentage here
            // System.out.println("Apartment: " + apartments.get(i) + ", Percentage: " + percentages.get(i));
            String apartment = apartments.get(i);
            double percentage = percentages.get(i);
            Config config = new Config(apartment, percentage, 1);
            configRepository.save(config);
        }

        return "redirect:/view-config"; // Redirect to the view config page
    }

}
