package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public List<Employee> getAllEmpDetails() {
		return empRepository.findAll();
	}

	@Override
	public Employee insertEmployeeDetails(Employee newEmployee) {
		return empRepository.save(newEmployee);
		
	}

	@Override
	public String deleteEmpDetails(Long empId) {
		
		if(empRepository.existsById(empId)) 
		{
			empRepository.deleteById(empId);
			return "Emp details deleted ....";
		}
		return "Deletion Failed : Invalid Emp Id !!!!!!!!!!!";
	}
	

}
