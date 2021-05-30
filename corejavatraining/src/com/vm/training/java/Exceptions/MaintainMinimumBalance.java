package com.vm.training.java.Exceptions;


public class MaintainMinimumBalance extends Exception {

	String message;
	MaintainMinimumBalance(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
