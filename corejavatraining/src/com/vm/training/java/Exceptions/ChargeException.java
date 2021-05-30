package com.vm.training.java.Exceptions;

public class ChargeException extends Exception {

	String message;
	ChargeException(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}

