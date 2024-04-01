package com.example.demo.controller;

import com.example.demo.model.Expense;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

//@RestController
@Controller
public class ExpenseController {

    private static final Logger log = LoggerFactory.getLogger(ExpenseController.class);
    @Autowired
    private ExpenseRepository expenseRepository;
	
    @GetMapping("/load-expenses")
    public String home(Model model) {
    	model.addAttribute("message", "Welcome to my application");
        return "load_expenses";
    }
    
    @GetMapping("/view-expenses")
    public String viewExpenses(Model model) {
        List<Expense> expenses = expenseRepository.findAll();
        // log.info("Expenses: " + expenses);
        // log the expenses
        model.addAttribute("expenses", expenses);
        return "view_expenses";
    }

    @PostMapping("/save-expense")
    public String addExpense(@RequestParam("description") String description, @RequestParam("amount") double amount) {
        System.out.println("Description: " + description + " Amount: " + amount);
        Expense expense = new Expense(description, amount);
        // log description and amount
        
        expenseRepository.save(expense);
        return "redirect:/view-expenses"; // Redirect to the view expenses page
    }

}
