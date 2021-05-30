package com.vm.training.java.Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		   //		ArrayList<Integer> al1=new ArrayList<Integer>();
		  //		ArrayList<Integer> al2=new ArrayList<Integer>();
				al.add(173);
				al.add(22);
				al.add(123);
				al.add(78);
				al.add(173);
				al.add(22);
				System.out.println(al);

				LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>(al);
				System.out.println(lhs);
				
}
}
