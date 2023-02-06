package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.dao.DeptDaoImpl;

@Controller
public class DepartmentController {
	
	private DeptDaoImpl deptDao;
	
	public DepartmentController() {
		System.out.println("in default constructor of "+getClass());
	}
	
	@GetMapping("/")
	public String getAllDepartments(Model map) {
		System.out.println("in method get all departments");
		map.addAttribute("dept_names",deptDao.getAllDepartments());
		return "/department/dept";
	}
}
