package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		System.out.println("in default constructor of "+getClass());
	}
	@GetMapping
	public List<Employee> getEmps(){
		System.out.println("in get emps");
		return empService.getAllEmpDetails();
	}
	
	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee newEmployee)
	{
		System.out.println("in save emp "+newEmployee+" id "+newEmployee.getId());
		return empService.insertEmployeeDetails(newEmployee);
		
	}
	
	@DeleteMapping("/{empId}")
	public String deleteEmpDetails(@PathVariable Long empId)
	{
		System.out.println("in del emp "+empId);
		return empService.deleteEmpDetails(empId);
	}

}
