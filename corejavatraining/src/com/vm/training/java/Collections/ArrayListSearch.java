package com.vm.training.java.Collections;

import java.util.*;

public class ArrayListSearch {
// static boolean search(ArrayList al,int num)
//  {
//	  System.out.println(al);
//		int h=0;
//		System.out.println(Collections.binarySearch(al, num));
//		System.out.println(h);
//		if(h>=0)
//		{
//			return true;
//		}
//		else {
//			return false;
//		}
//  }
// static boolean search(ArrayList al,int num)
// {
//	  
//		return al.contains(num);
// }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
   //		ArrayList<Integer> al1=new ArrayList<Integer>();
  //		ArrayList<Integer> al2=new ArrayList<Integer>();
		al.add(173);
		al.add(22);
		al.add(123);
		al.add(78);  
		
//		System.out.println("enter the element to search : ");
//		  int num=sc.nextInt();
		  System.out.println(Collections.binarySearch(al,123));
		// boolean g=search(al,num);
		// System.out.println(g);
//		Collections.sort(al);
//		System.out.println(al);
//		Collections.reverse(al);
//		System.out.println(al);
//		int size=al.size();
//		for(int i=0;i<(size/2);i++)
//		{
//			int a=al.get(i);
//			al1.add(a);
//		}
//		System.out.println(al1);
//		
//		for(int i=(size/2);i<size;i++)
//		{
//			int a=al.get(i);
//			al2.add(a);
//		}
//		System.out.println(al2);
//		
	}

}
