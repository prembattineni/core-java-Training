package com.vm.training.java.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo1 {
	
	static void add(HashMap hm1,String name, String mobile)
	{
		
		hm1.put(name,mobile);
		
	}
	static void remove(HashMap hm1,String name)
	{
		
		hm1.remove(name);
		
	}
	static void display(HashMap hm1)
	{
		System.out.println(hm1);
		
	}
	static void options()
	{
		System.out.println("select options :");
		System.out.println("1: ADD");
		System.out.println("2 : Remove");
		System.out.println("3: Display");
		System.out.println("press -1 to exits");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,String> hm1=new HashMap<String,String>();
		
		options();
		int sel=0;
		while(sel!=-1) {
			sel=sc.nextInt();
		switch(sel) {
		case 1:
			System.out.print("enter how many members to add : ");
			int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter name :" );
			String s=sc.next();
			System.out.print("enter mobileno :");
			String mob=sc.next();
			add(hm1,s,mob);
			
		}
		options();
		break;
		
		case 2:
			System.out.print("enter name :" );
			String s=sc.next();
			remove(hm1,s);
			options();
		break;
		
		case 3:
			display(hm1);
			options();
			break;
		default : 
			     sel=-1;
		         break;
		}
		}
	System.out.println(hm1);
	}

}





