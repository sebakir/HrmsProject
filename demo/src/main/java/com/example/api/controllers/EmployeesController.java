package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.abstracts.EmployeeService;
import com.example.core.utilities.results.DataResult;
import com.example.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

//	@PostMapping("/add")
//	public Result add(@RequestBody Employee employee){
//		return this.employeeService.add(employee);
//	}
//	
//	@PostMapping("/update")
//	public Result update(@RequestBody Employee employee){
//		return this.employeeService.update(employee);
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id){
//		return this.employeeService.delete(id);
//	}
//	
//	@GetMapping("/getbyid")
//	public DataResult<Employee> getById(@PathVariable("id") int id){
//		return this.employeeService.getById(id);
//	}

	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll() {
		return this.employeeService.getAll();
	}
}
