package com.example.ExpenseTracker.service;
import java.util.List;

import com.example.ExpenseTracker.model.Expense;

public interface ExpenseService {
    List<Expense> findAll();
    void save(Expense expense);
    Expense findById(Long id);
}
