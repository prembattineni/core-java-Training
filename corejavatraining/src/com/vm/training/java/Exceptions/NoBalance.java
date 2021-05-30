package com.vm.training.java.Exceptions;

public class NoBalance extends Exception {

	String message;
	NoBalance(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
