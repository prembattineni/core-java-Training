package com.vm.training.java.Java8newFeatures;

import java.util.function.Predicate;

import java.util.function.Function;

public class InBuiltFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p=(var1)->var1>2;//predicate is functional interface .it is inbuilt interface
		System.out.println(p.test(3));
		//predicate will give only boolean
		Predicate<String> p2=(v1)->v1.startsWith("a");
		System.out.println(p2.test("abc"));
		 
		         //input  output
		Function <String,String> f1=(var)->var.concat("hello welcome");
		
		System.out.println(f1.apply("sachin "));
     Function <String,Integer> f2=(f)->f.length();
		
		System.out.println(f2.apply("sachin"));
		
	}

}
