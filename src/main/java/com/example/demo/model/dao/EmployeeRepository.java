package com.example.demo.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
