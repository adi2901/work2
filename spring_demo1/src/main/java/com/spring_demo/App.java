package com.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class App 
{
	@Autowired
	@Qualifier("department")
	Department department1 ;
	
	@Autowired
	Employee employee;
	
	public App() {
		super();
		 
	}
	
	public App(Department department, Employee employee) {
		super();
		this.department1 = department;
		this.employee = employee;
	}

	public Department getDepartment() {
		return department1;
	}
	public void setDepartment(Department department) {
		this.department1 = department;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "App [department=" + department1 + ", employee=" + employee + "]";
	}
	

}
