package com.vm.training.java.threadsConcurrency;

import java.util.HashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm =new HashMap<String,Integer>();
		hm.put("prem",78);
		hm.put("kumar", 67);
		hm.put("battineni",80);
		System.out.println("elements of map "+ hm);
		
		
			hm.computeIfAbsent("sam",a->90);
			hm.computeIfAbsent("xj",a->23);
	System.out.println(hm.containsValue(23));
			
			
		System.out.println("elements of map "+ hm);
		
	}

}
