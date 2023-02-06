package com.app.dto;

public class CourseDto {
	private String courseName;
	private String courseDesc;
	public CourseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseDto(String courseName, String courseDesc) {
		super();
		this.courseName = courseName;
		this.courseDesc = courseDesc;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	@Override
	public String toString() {
		return "CourseDto [courseName=" + courseName + ", courseDesc=" + courseDesc + "]";
	}
	
	

}
