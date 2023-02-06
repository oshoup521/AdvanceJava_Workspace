package com.app.dto;

public class StudentDto {
	
	private String firstName;
	private String lastName;
	private String branch;
	private String email;
	private String password;
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDto(String firstName, String lastName, String branch, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.email = email;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentDto [firstName=" + firstName + ", lastName=" + lastName + ", branch=" + branch + ", email="
				+ email + ", password=" + password + "]";
	}
	
	

}
