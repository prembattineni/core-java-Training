package com.vm.training.java.Collections;

import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("sachin", "batsman");
		lhm.put("rahul", "coach");
		lhm.put("sachin", "coach");
		lhm.put("dhoni", "wicketkeeper");
		System.out.println(lhm);
		System.out.println(lhm.get("sachin"));
		lhm.remove("rahul");
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm.entrySet());//gives both key and values
		
		for(Object s: lhm.keySet())
		{
			System.out.println(s);
		}
		
	}
}
