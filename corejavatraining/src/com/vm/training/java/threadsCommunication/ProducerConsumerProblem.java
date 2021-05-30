package com.vm.training.java.threadsCommunication;


import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
public class ProducerConsumerProblem {
public static void main(String[] args) {
	BlockingDeque<Integer> bq=new LinkedBlockingDeque<Integer>();
	
	Producer producer=new Producer(bq);
	Consumer consumer=new Consumer(bq);
	
	Thread producerThread=new Thread(producer);
	Thread consumerThread=new Thread(consumer);
	producerThread.start();
	consumerThread.start();
	
}
}