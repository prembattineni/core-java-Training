package com.vm.tainring.java.oops;

public class Employee1MainMain extends Employee1Main {

	String nationality;

	public Employee1MainMain(int id, String name, String dept, String email, String nationality) {
		super(id, name, dept, email);
		this.nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "Employee1MainMain [nationality=" + nationality + ", email=" + email + ", id=" + id + ", name=" + name
				+ ", dept=" + dept + "]";
	}

	public static void main(String[]args)
	{
		Employee1MainMain emp=new Employee1MainMain(100,"abc","IT","mail.com","Indian");
		System.out.println(emp);
	}

}
