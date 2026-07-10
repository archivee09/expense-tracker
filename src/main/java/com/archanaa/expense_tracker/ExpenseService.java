package com.archanaa.expense_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService{

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public Expense addExpense(Expense expense){

        return expenseRepository.save(expense);
    }

    public void deleteExpense(Long id){

        expenseRepository.deleteById(id);
    }

    public double getTotalByCategory(String category){
        List<Expense> all=expenseRepository.findAll();
        double total=0;
        for(Expense expense:all){
            if(expense.getCategory().equals(category)){
                total+=expense.getAmount();
            }
        }
        return total;
    }
}