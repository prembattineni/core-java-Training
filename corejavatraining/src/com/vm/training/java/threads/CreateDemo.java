package com.vm.training.java.threads;
class Employee extends Thread
{
	public void run()
	{
		System.out.println("this is task of employee");
	}
}

public class CreateDemo {
  
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.start();//it automatically calls run() method
		emp.run();//this is normal execution
	}
}
