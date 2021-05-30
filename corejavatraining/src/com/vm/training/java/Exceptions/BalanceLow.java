package com.vm.training.java.Exceptions;

public class BalanceLow extends Exception{

	String message;
	BalanceLow(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
