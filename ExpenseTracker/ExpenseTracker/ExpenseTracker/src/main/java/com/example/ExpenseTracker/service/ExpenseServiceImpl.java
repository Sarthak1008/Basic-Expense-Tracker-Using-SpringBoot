package com.example.ExpenseTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExpenseTracker.model.Expense;
import com.example.ExpenseTracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public void save(Expense expense) {
        expense.setCreatedAt(System.currentTimeMillis());
        expenseRepository.save(expense);
    }

    @Override
    public Expense findById(Long id) {
        if(expenseRepository.findById(id).isPresent()){
            expenseRepository.findById(id).get();
        }
        return null;
    }
    
}
