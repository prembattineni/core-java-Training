package com.vm.training.java.threadsCommunication;

public class InterThreadCommunicationCustomerMain {

	public static void main(String[] args) {
		Customer customer=new Customer();
		
		
		Thread t1=new Thread()
		{
			public void run() {
				System.out.println(customer.withdraw(7000));
			}
		};
		
		Thread t2=new Thread()
		{
			public void run() {
				System.out.println(customer.deposit(7000));
			}
			
		};
		
		t1.setName("withdraw");
		t2.setName("deposit");
		
		t1.start();
		t2.start();
	}
}
