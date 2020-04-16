package com.pranav.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pranav.springboot.thymeleafdemo.entity.Employee;
import com.pranav.springboot.thymeleafdemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	//load employee data
	
	
	//add mapping for /list
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployees = employeeService.findAll();
		theModel.addAttribute("employees", theEmployees);
		
		return "employees/list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		return "employees/employee-form";
	}
}
