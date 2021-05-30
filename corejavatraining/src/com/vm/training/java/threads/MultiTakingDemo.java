package com.vm.training.java.threads;


class Prem extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("prem"+i);
		}
	}
}

class Kumar extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			System.out.println("Kumar"+i);
		}
	}
}
class Battineni extends Thread
{
	public void run()
	{
		for(int i=31;i<=40;i++)
		{
			System.out.println("Battineni"+i);
		}
	}
}
public class MultiTakingDemo {
	public static void main(String[] args) {
		
		Prem prem=new Prem();
		Kumar kumar=new Kumar();
		Battineni battineni=new Battineni();
		
		//prem.run();//normal method call
		//kumar.run();
		//battineni.run();
		
		prem.start();//multithreading
		kumar.start();//multithreading
		battineni.start();//multithreading
		
		//random answer for multithreading answer changes each time we execute
	}

}
