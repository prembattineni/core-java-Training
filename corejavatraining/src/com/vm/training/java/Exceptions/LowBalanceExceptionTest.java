package com.vm.training.java.Exceptions;

public class LowBalanceExceptionTest {
 public static void main(String[] args) {
	int balance=900;
	try {
		if(balance<1000)
		{
			throw new LowBalanceException("your balance is less than 1000");
		}
		System.out.println(balance);
	}
		catch(LowBalanceException e)
		{
			e.printStackTrace();
		}
	}
}

