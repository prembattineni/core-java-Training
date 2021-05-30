package com.vm.training.java.basics;

public class DipsBucket implements Cafeteria {
 
	public String order(int quantity) {
		int price=999;
		String item="DipsBucket";
		return item+","+String.valueOf(price*quantity);
	}
}
