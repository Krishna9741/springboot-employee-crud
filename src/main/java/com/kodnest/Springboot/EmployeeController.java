package com.kodnest.Springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getemployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/insertorupdateemployee")
	public Employee createorupdateEmployee(@RequestBody Employee employee) {
		return employeeService.createorupdateEmployee(employee);
	}
	
	@DeleteMapping("/deleteemployee")
	public String deleteEmployee(@RequestParam("id") int id) {
		employeeService.deleteEmployee(id);
		return "employee deleted sucessfully";
	}
}
