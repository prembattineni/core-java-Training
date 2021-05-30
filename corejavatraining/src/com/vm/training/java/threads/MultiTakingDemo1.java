package com.vm.training.java.threads;


class Prem1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i==4)
			{
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);
		}
	}
}

class Kumar1 extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			if(i==24)
			{
				stop();
			}
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);
		}
	}
}
class Battineni1 extends Thread
{
	public void run()
	{
		for(int i=31;i<=40;i++)
		{
			System.out.println("Name = "+Thread.currentThread().getName()+" "+i);
		}
	}
}
public class MultiTakingDemo1 {
	public static void main(String[] args) {
		System.out.println("Name = "+Thread.currentThread().getName());
		Prem1 prem=new Prem1();
		Kumar1 kumar=new Kumar1();
		Battineni1 battineni=new Battineni1();
		
		//prem.run();//normal method call
		//kumar.run();
		//battineni.run();
		prem.setName("prem");
		kumar.setName("kumar1");
		battineni.setName("Battineni");
		
		prem.start();//multithreading
		kumar.start();//multithreading
		battineni.start();//multithreading
		
		//random answer for multithreading answer changes each time we execute
	}

}
