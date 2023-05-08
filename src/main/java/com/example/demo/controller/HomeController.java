 package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceimplementation.EmployeeServiceImpl;

@RestController
@CrossOrigin("*")
public class HomeController {
@Autowired
private EmployeeServiceImpl employeeServiceImpl;
@PostMapping(value="saveEmployee")
public Employee  saveEmployee(@RequestBody Employee employee ) {
	System.out.println("Employeesave works properly");
	employeeServiceImpl.saveEmployee(employee);
	return employee;
	
}
@GetMapping(value = "getAllEmployees")
public List<Employee> findAllEmployee(){
	return employeeServiceImpl.findAllEmployee();
	
}
@PutMapping("updateEmployee")
public Employee updateEmployee(@RequestBody Employee employee) {
	return employeeServiceImpl.updateEmployee(employee);
	
}
@DeleteMapping("deleteEmployee")
public String deleteEmployee(@RequestParam int id) {
	employeeServiceImpl.deleteEmplyee(id);
	return "employee deleted";
}
}
