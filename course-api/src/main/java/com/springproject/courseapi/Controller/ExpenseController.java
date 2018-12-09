package com.springproject.courseapi.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.courseapi.DTO.ExpenseDetail;
import com.springproject.courseapi.DTO.Topic;
import com.springproject.courseapi.serviceInterface.ExpenseServiceInterface;

@RestController
public class ExpenseController {
	@Autowired
	private ExpenseServiceInterface expenses;
	
	@RequestMapping(method=RequestMethod.POST,value="/expenses")
	public ExpenseDetail  addExpensedetails(@RequestBody ExpenseDetail expense) {
		 
		
		return expenses.addExpense(expense);
	}
	
	@RequestMapping("/allexpenses")
	public Set<String> getAllExpense() {
		System.out.println("Came to loop1 <><><><>");
		return expenses.getexpenselist();
	}
	
	
	

}
