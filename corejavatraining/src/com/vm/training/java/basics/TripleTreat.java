package com.vm.training.java.basics;

public class TripleTreat implements Cafeteria{
 
	public String order(int quantity) {
		int price=1999;
		String item="Triple Treat";
		return item+","+String.valueOf(price*quantity);
	}
}
