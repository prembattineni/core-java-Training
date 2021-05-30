package com.vm.training.java.threadsConcurrency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo1 {

	public static void main(String[] args) {
		
		
		//HashMap<String, Integer> hm=new tHashMap<String, Integer>();
		ConcurrentHashMap<String, Integer> hm=new ConcurrentHashMap<String, Integer>();
		
		hm.put("prem",78);
		hm.put("kumar", 67);
		hm.put("battineni",80);
		System.out.println("elements of map "+ hm);
		
		for(Integer val:hm.values())
		{
			System.out.println(val);//hm.computeIfAbsent it throws exception if done with normal HashMap
			hm.computeIfAbsent("mahesh",a->90);//it adds element after execution of for loop  //at last it will add
		       hm.put("adf",12);//we can use all methods not only hm.computeIfAbsent
		
		}                                      
		
		System.out.println("elements of hashmap" +hm);
	}
}
