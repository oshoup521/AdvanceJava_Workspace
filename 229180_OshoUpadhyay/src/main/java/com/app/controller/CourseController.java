package com.app.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CourseDto;
import com.app.pojos.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping(name = "/courses")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@Autowired
	ModelMapper mapper;
	
	@GetMapping
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@PostMapping
	public Course addCourse(@RequestBody CourseDto courseDto) {
		Course course = mapper.map(courseDto, Course.class);
		return courseService.addCourse(course);
	}

}
