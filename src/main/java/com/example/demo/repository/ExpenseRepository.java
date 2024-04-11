package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Expense;
import java.util.List;


public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByAmount(double amount);
    @Query("SELECT e FROM Expense e WHERE MONTH(e.date) = ?1 AND YEAR(e.date) = ?2")
    List<Expense> getItemsForMonthAndYear(int month, int year);
}
