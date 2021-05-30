package com.vm.training.java.Collections;

import java.util.HashMap;

class HashMapCollection{
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "prem");
		hm.put(102, "prem");
		hm.put(103, null);
		hm.put(104, null);
		hm.put(null, "nufw");
		hm.put(null, "nufw");
		System.out.println(hm);
	}
}