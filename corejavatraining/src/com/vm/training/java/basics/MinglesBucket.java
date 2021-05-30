package com.vm.training.java.basics;

public class MinglesBucket implements Cafeteria{

	@Override
	public String order(int quantity) {
		int price=159;
		String item="MinglesBucket";
		return item+","+String.valueOf(price*quantity);
	}
	
}