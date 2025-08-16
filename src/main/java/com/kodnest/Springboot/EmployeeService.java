package com.kodnest.Springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
	
	
	EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo=employeeRepo;
	}
	
	List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}
	
	Employee getEmployee(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
	
	Employee createorupdateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}
}
