package com.vm.training.java.threads;


class Bottle
{
	synchronized public void drink(int time)//at a time only one drinks
	{
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking "+i);
		}
	}
}
class DrinkWater implements Runnable
{

	Bottle bottle=new Bottle();
	
	@Override
	public void run() {
		
		bottle.drink(6);
	}
	
}









public class SynchronizationDemo {

	public static void main(String[] args) {
		
		DrinkWater drinkWater=new DrinkWater();
		
		Thread prem =new Thread(drinkWater);
		Thread kumar=new Thread(drinkWater);
		
		
		prem.setName("prem");
		kumar.setName("kumar");
		prem.start();
		kumar.start();
	}
}
