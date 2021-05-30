package com.vm.training.java.threads;


class Interview implements Runnable
{

	@Override
	synchronized public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is interviewing "+i);
		}
		
	}
	
}

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		
		Interview interview1=new Interview();
		
		
		
		Thread t1=new Thread(interview1);
		Thread t2=new Thread(interview1);
		
		t1.setName("prem");
		t2.setName("kumar");
		
		t1.start();
		t2.start();
		
		
	}

}
