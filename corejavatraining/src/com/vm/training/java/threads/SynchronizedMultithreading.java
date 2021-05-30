package com.vm.training.java.threads;

class Bank{
	
	public void Using(int t){
		for(int i=0;i<=t;i++) {
		System.out.println(Thread.currentThread().getName());
		}
	}
	
	
}


class Deposit implements Runnable{
	
	Bank b=new Bank();

	@Override
	public void run() {
		
		b.Using(5);
	}
	
}

public class SynchronizedMultithreading {

	public static void main(String[] args) {
		Deposit dp1=new Deposit();
		Deposit dp2=new Deposit();
		
		Thread deposit =new Thread(dp1);
		Thread withdraw=new Thread(dp2);
		deposit.setName("deposit");
		withdraw.setName("withdraw");
		
		deposit.start();
		withdraw.start();
		
	}
}
