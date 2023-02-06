package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Course;
import com.app.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public Course addCourse(Course newCourse) {
		return courseRepo.save(newCourse);
	}

}
