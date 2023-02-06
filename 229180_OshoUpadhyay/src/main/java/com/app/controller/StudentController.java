package com.app.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.StudentDto;
import com.app.pojos.Student;
import com.app.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(name = "/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/register")
	public Student registerStudent(@RequestBody StudentDto studentDto) {
		Student student = modelMapper.map(studentDto, Student.class);
		return studentService.addStudent(student);
		
	}

}
