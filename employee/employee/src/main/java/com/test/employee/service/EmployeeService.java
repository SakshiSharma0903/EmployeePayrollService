package com.test.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.employee.model.Employee;
import com.test.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}


	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}


	public void deleteEmployeeById(long id) {
		repo.deleteById(id);
		
	}

}
