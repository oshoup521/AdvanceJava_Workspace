package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course_tbl")
public class Course extends BaseEntity {
	@Column(name = "course_name",length = 20)
	private String courseName;
	@Column(name = "course_desc")
	private String courseDesc;
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	public Course(String courseName, String courseDesc, Student student) {
		super();
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.student = student;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [courseDesc=" + courseDesc + ", courseName=" + courseName + ", student=" + student + ", getId()="
				+ getId() + "]";
	}
	
	
	

}
