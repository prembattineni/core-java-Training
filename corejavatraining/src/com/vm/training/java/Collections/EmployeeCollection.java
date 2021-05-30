package com.vm.training.java.Collections;

public class EmployeeCollection {

	int id;
	String name;
	String dept;
	public EmployeeCollection(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		
	}
	@Override
	public String toString() {
		return "EmployeeCollection [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}
