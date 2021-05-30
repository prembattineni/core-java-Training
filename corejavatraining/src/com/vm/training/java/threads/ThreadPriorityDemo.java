package com.vm.training.java.threads;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		Prem prem=new Prem();
		Kumar kumar=new Kumar();
		Battineni battineni=new Battineni();
		
		
		//prem.setPriority(10);//10 max priority
		//kumar.setPriority(9);
		prem.setPriority(Thread.MAX_PRIORITY);
		kumar.setPriority(Thread.MIN_PRIORITY);
		System.out.println(prem.getPriority());
		System.out.println(kumar.getPriority());
		prem.start();
		kumar.start();
		
	}
}
