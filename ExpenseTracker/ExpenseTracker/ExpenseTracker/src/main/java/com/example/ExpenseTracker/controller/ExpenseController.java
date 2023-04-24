package com.example.ExpenseTracker.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ExpenseTracker.model.Expense;
import com.example.ExpenseTracker.service.ExpenseService;


@Controller
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;
    
    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("message","List Of Expenses");
        List<Expense> expenses = expenseService.findAll();
        modelAndView.addObject("expenses", expenses);
        System.out.println(expenses);
        return modelAndView;
    }

    @RequestMapping("/expense")
    public ModelAndView addExpense(){
        ModelAndView modelAndView = new ModelAndView("expense");
        modelAndView.addObject("expense",new Expense());
        return modelAndView;
    }
    @RequestMapping(value = "/expense",method = RequestMethod.POST)
    public String save(@ModelAttribute("expense") Expense expense){
        expenseService.save(expense);
        return "redirect:/";
    }

    @RequestMapping(value = "/expense/{id}")
    public ModelAndView edit(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("expenseEdit");
        Expense expense = expenseService.findById(id);
        modelAndView.addObject("expense",expense);
        return modelAndView;
    }
}
