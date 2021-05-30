package com.vm.training.java.Exceptions;

public class ProductException extends Exception {
	String message;
	ProductException(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}

