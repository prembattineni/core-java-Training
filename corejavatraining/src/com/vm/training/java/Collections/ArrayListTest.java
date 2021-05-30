package com.vm.training.java.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		/*ArrayList<Object> arraylist = new ArrayList<Object>();
		arraylist.add("prem");
		arraylist.add("kumar");
		arraylist.add("battineni");
		arraylist.add(Integer.valueOf(10));
		arraylist.add(Float.valueOf(10));
		System.out.println(arraylist);
		arraylist.remove(0);
		arraylist.add(2,"c++");
		System.out.println(arraylist.contains("c++"));
		System.out.println(arraylist.get(3));*/
		
		
		/*ArrayList<String> a = new ArrayList<>();
		a.add("abc");
		a.add("bcd");
		a.add("wdq");
		String s=a.get(0);
		System.out.println(s);*/
		
//		ArrayList a = new ArrayList();
//		a.add("abc");
//		a.add("bcd");
//		a.add("wdq");
//		String s=(String)a.get(0);//arraylist is not string type so we need to cast this
//		System.out.println(s);
		
//		ArrayList<String> al=new ArrayList<String>();//ArrayList in ArrayLists
//		al.add("Dell");
//		al.add("Hp");
//		al.add("acer");
//		
//		ArrayList<String> al1=new ArrayList<String>();
//		al1.add("adj");
//		al1.add("asc");
//		al1.add("sjx");
//		
//		
//		ArrayList<ArrayList> al2=new ArrayList<ArrayList>();//ArrayLists in ArrayList
//		al2.add(al);
//		al2.add(al1);
//		for(ArrayList a: al2)
//		{
//			System.out.println(a);
//		}
//		ArrayList<ArrayList> al3=new ArrayList<ArrayList>();
//		al3.add(al2);
//		System.out.println(al3);
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(34);
		al3.add(45);
		al3.add(432);
		System.out.println(Collections.binarySearch(al3, 432));

	}
	
}
