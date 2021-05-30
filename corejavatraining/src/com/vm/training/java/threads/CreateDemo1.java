package com.vm.training.java.threads;
class Employee3 extends Thread
{
	public void run()
	{
		System.out.println("this is task of employee");
	}
}
class Student implements Runnable{

	public void run()
	{
		System.out.println("this is task of Student");
	}
}

public class CreateDemo1 {
  
	public static void main(String[] args) {
		
		Employee3 emp=new Employee3();
		emp.start();//it automatically calls run() method
		Student s=new Student();
		Thread t1=new Thread(s);
		t1.start();
	}
}
