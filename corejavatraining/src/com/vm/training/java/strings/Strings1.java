package com.vm.training.java.strings;

import java.util.Scanner;

public class Strings1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s ="prem prem kumar prem";
		String[] s1=s.split(" ");//string to string array
		int c=0;
		System.out.print("enter the word :");
		String s2=sc.next();
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(s2))
				c++;
		}
		System.out.println(c);
	}
	}
