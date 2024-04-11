package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;

import org.springframework.ui.Model;

@Controller
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(ExpenseController.class);
    private int month;
    private int year;
    @Autowired
    private ExpenseRepository expenseRepository;


    @GetMapping("/")
    public String home(Model model, @RequestParam(value = "month", defaultValue = "0") int m, @RequestParam(value = "year", defaultValue = "0") int y) {
        // if m is empty
        if (m == 0) {
            month = java.time.Month.valueOf(java.time.LocalDate.now().getMonth().name()).getValue();
        } else {
            month = m;
        }
        // if y is empty
        if (y == 0) {
            year = (int) java.time.Year.now().getValue();
        } else {
            year = y;
        }

        List<Expense> expenses = expenseRepository.getItemsForMonthAndYear(month, year);
        log.info("Expenses: " + expenses);
        model.addAttribute("expenses", expenses);
        return "index";
    }
}
