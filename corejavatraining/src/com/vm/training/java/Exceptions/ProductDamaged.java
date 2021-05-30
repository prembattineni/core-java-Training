package com.vm.training.java.Exceptions;

public class ProductDamaged extends Exception {
 
	String message;
	ProductDamaged(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}
