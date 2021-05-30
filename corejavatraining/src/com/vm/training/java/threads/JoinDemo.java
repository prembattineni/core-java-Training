package com.vm.training.java.threads;

class ProjectCall extends Thread
{
	public void run()
	{
		
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
	}
}
class WorkingOnProject extends Thread
{
	public void run()
	{
		
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName());
	}
	}
}
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ProjectCall projectCall = new ProjectCall();
		WorkingOnProject workingonproject = new WorkingOnProject();
		
		projectCall.setName("project dicussion call");
		workingonproject.setName("working on project");
		projectCall.start();
		projectCall.join();//it blocks projectCall and executes projectCall till it dies
		workingonproject.start();
		
		
		
	}
}
