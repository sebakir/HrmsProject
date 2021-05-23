package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.entities.concretes.Employee;



public interface EmployeeService {

//	Result add(Employee employee);
//	Result update(Employee employee);
//	Result delete(int id);
//	DataResult<Employee> getById(int id);
	
	DataResult<List<Employee>> getAll();
}
