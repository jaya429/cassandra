package com.example.cassandra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cassandra.model.Employee;
import com.example.cassandra.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Iterable<Employee> getEmployees(){
		return employeeRepository.findAll();
		
	}
}
