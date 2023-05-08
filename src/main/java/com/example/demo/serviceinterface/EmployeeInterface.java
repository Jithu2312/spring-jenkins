package com.example.demo.serviceinterface;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeInterface {
public Employee saveEmployee(Employee employee);

public Employee updateEmployee(Employee employee);

public List<Employee> findAllEmployee();

public void deleteEmplyee(int id);
}
