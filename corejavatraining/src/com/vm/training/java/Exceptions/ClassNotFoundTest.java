package com.vm.training.java.Exceptions;

public class ClassNotFoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       Class.forName("Hm");
       System.out.println("found class");
	}catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	}

}