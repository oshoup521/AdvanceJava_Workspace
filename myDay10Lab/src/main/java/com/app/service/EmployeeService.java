package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
	List<Employee> getAllEmpDetails();
	
	Employee insertEmployeeDetails(Employee newEmployee);
	
	String deleteEmpDetails(Long empId);

}
