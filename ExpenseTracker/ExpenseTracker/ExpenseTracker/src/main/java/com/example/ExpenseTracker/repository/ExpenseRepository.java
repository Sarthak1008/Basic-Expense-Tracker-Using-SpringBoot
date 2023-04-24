package com.example.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ExpenseTracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long>{
    
}
