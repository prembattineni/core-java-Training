package com.vm.training.java.threads;

class Bank1{
	
	public void Using(int t){
		synchronized(this) {
		for(int i=0;i<=t;i++) {
		System.out.println(Thread.currentThread().getName());
		}
	}
	}
		
		public void Using1(int t){
			
			for(int i=0;i<=t;i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	
	
}



class Deposit1 implements Runnable{
	
	Bank b=new Bank();

	@Override
	public void run() {
		
		b.Using(5);
	}
	
}

public class SynchronizedMultithreading1 {

	public static void main(String[] args) {
		Deposit1 dp1=new Deposit1();
		Deposit1 dp2=new Deposit1();
		
		Thread deposit =new Thread(dp1);
		Thread withdraw=new Thread(dp2);
		deposit.setName("deposit");
		withdraw.setName("withdraw");
		
		deposit.start();
		withdraw.start();
		
	}
}
