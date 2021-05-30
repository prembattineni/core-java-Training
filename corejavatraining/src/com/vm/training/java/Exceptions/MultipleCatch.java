package com.vm.training.java.Exceptions;

public class MultipleCatch {
public static void main(String[] args) {
	try {
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
