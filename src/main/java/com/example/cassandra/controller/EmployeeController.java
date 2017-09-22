package com.example.cassandra.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cassandra.model.Employee;
import com.example.cassandra.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<Employee> getEMployees(){
		List<Employee> employees = new ArrayList<>();
		employeeService.getEmployees().forEach(e->employees.add(e));
		return employees;
	}
}
