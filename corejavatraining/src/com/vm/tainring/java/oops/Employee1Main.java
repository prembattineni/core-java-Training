package com.vm.tainring.java.oops;

public class Employee1Main extends Employee1 {
    String email;
	public Employee1Main(int id,String name,String dept,String email)
	{
		super(id,name,dept);
		this.email=email;
	}
	
	
	public static void main(String[]args)
	{
		Employee1Main emp=new Employee1Main(100,"abc","IT","mail.com");
		System.out.println(emp.name);
	}
}
