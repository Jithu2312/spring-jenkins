 package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.dao.EmployeeRepository;
import com.example.demo.serviceinterface.EmployeeInterface;

@Service

public class EmployeeServiceImpl implements EmployeeInterface {
    @Autowired
    private EmployeeRepository employeeRepo;
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>)  employeeRepo.findAll();
	}

	@Override
	public void deleteEmplyee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
		
	}

}
