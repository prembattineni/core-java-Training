package com.vm.tainring.java.oops;

public class Employee1 {

	
	//program for use of toString()
	//toString() is predifined method
	int id;
	String name;
	String dept;
	Employee1(){
		
	}
	public Employee1(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	//we no need to create method to access variables.where toString() directly sends variables to object
	/*public String toString() {
		return id+" "+name+" "+dept;
	}*/
	/*public static void main(String[]args)
	{
		Employee1 e=new Employee1();
		Employee1 e1=new Employee1(100,"prem","cse");
		System.out.println(e);
		System.out.println(e1);
	}*/
}
