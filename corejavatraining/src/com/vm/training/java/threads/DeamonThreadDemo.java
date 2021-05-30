package com.vm.training.java.threads;


class Company extends Thread
{
	public void run()
	{
		
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
	}
}

class Employee2 extends Thread
{
	public void run()
	{
		
	
	for(int i=1;i<=50;i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
	}
	}
}
public class DeamonThreadDemo {

	public static void main(String[] args) {
		
		Company company =new Company();
		Employee2 employee2=new Employee2();
		company.setName("Company");
		employee2.setName("Employee");
		
		employee2.setDaemon(true);
		
		company.start();
		employee2.start();
		

	}

}
