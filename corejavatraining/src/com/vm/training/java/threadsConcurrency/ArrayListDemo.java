package com.vm.training.java.threadsConcurrency;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(3);
		obj.add(12);
		
		System.out.println("elements are "+obj);
		
		
		for(Integer i:obj)
		{
			System.out.println(i);
			obj.add(20);//exception because we cannot add at runtime
		}
	}
}
