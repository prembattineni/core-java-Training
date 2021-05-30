package com.vm.training.java.threadsCommunication;

import java.util.concurrent.BlockingDeque;

public class Producer implements Runnable{

	
	BlockingDeque<Integer> CommonQueue;
	
	public Producer(BlockingDeque<Integer> commonQueue) {
		super();
		CommonQueue = commonQueue;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			CommonQueue.add(i);
			System.out.println("elements are:"+i);
			System.out.println("queue elements are:"+CommonQueue);
		}
	}
		
	

}