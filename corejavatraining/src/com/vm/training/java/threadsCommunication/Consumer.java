package com.vm.training.java.threadsCommunication;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable{

	BlockingDeque<Integer> commonQueue;

	public Consumer(BlockingDeque<Integer> commonQueue) {
		super();
		this.commonQueue = commonQueue;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				
				commonQueue.take();
				System.out.println("consumer is taking:"+commonQueue.take());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}




	

}