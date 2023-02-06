package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "depts")
public class Department extends BaseEntity{
	//name,location
	@Column(name = "dept_name",length = 20,unique = true)
	private String deptName;
	@Column(length = 50)
	String location;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + getId() + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	

}
