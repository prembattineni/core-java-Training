package com.vm.training.java.Collections;


import java.util.Hashtable;
import java.util.Map;

public class EmployeeCollectionMain {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<EmployeeCollection,EmployeeDetails> hm=new Hashtable<EmployeeCollection,EmployeeDetails>();
		hm.put(new EmployeeCollection(123,"prem","cse") , new EmployeeDetails(123,"prem","cse","guntur","bhdcbw980"));
		hm.put(new EmployeeCollection(123,"prem","cse") , new EmployeeDetails(123,"prem","cse","guntur","bhdcbw980"));
		for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
	}

}
