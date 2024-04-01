package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Expense;
import java.util.List;


public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByAmount(double amount);
}
