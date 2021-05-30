package com.vm.training.java.Collections;

import java.util.ArrayList;

class  Customer{
	int id;

	public Customer(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + "]";
	}
}
public class Test {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add(new Customer(101));
		arr.add("gsggs");
		for(Object c:arr)
		{
			System.out.println(c);
		}
	}
}
