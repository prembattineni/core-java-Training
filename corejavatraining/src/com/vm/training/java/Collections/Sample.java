package com.vm.training.java.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Sample {

	
	static HashMap add(String s,String s1)
	{
		HashMap<String,String> hm1=new  HashMap<String,String>();
		hm1.put(s,s1);
		return hm1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     HashMap<String,String> hm=new  HashMap<String,String>();
     
     String [] s=new String[3];
     String [] s1=new String[3];
     for(int i=0;i<3;i++)
     {
    	 s[i]=sc.next();
    	  s1[i]=sc.next();
    	 hm=add(s[i],s1[i]);
     }
     System.out.println(hm);
	}

}
