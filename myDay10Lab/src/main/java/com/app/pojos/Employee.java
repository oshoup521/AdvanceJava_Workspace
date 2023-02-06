package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="new_emps")
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Employee extends BaseEntity {
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 20,nullable = false)
	private String password;
	//@JsonProperty(value = "workLocation")//if did this change in react too
	private String location;
	private LocalDate joinDate;
	private double salary;
	public Employee(String firstName, String lastName, String email, String password, String location,
			LocalDate joinDate, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.location = location;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	
	
}
