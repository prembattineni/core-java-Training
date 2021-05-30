package com.vm.training.java.basics;

public class Big8 implements Cafeteria{

	public String order(int quantity) {
		int price=559;
		String item="Big8";
		return item+","+String.valueOf(price*quantity);
	}
}
