package com.vm.training.java.Collections;

import java.util.HashMap;

public class HashMapOperations {

	HashMap<String,String> hm1=new HashMap<String,String>();
	
	public HashMap<String,String> add(String name,String mobile)
	{
		hm1.put(name, mobile);
		System.out.println("After ading "+hm1);
	return this.hm1;
			
	}
	public HashMap<String,String> remove(String name)
	{
		hm1.remove(name);
		System.out.println("After removing "+hm1);
	return this.hm1;		
	}
	public void printnames()
	{
		System.out.println("Nmaes in HashMap: ");
		for(Object o:hm1.keySet())
		{
			System.out.println(o);
		}
		
	}
	public void printcontacts()
	{
		System.out.println("Contacts in HashMap: ");
		for(Object o:hm1.values())
		{
			System.out.println(o);
		}
		
		
	}
	public void printAll()
	{System.out.println("Nmaes in HashMap: ");
	for(Object hmp:hm1.entrySet())
	{
		System.out.println(hmp);
	}
	
		System.out.println(hm1);
	}
}
