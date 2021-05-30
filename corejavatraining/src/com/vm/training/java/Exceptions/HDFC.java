package com.vm.training.java.Exceptions;

public class HDFC implements Bank {

	int deposit;
	int balance=1000;
	int charge=100;
	public int Deposit(int deposit) {
		this.deposit=deposit;
		balance=balance+deposit;
		return balance;
	}
	
	public int withdraw(int withdraw) {
		if(balance>=withdraw)
		{
		balance=withdraw-balance;
		if( balance>=1000)
		{
			return balance;
		}
		else if(balance>0) {
			try{
			throw new MaintainMinimumBalance("your are withdrawing more than minimum balance");
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else {
			try {
			throw new NoBalance("you have 0 balance and no minimum balance so account on hold ");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		}
		return balance;
		
	}

	
	public void showbalance() {
		if(balance<1000) {
		try {
			throw new BalanceLow("your balance is low please maintain minimum balance");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		else {
			System.out.println(balance);
		}
		
		
	}


	
	public void charges() {
		int charges=100;
		if(charges>balance)
		{
			try {
				throw new ChargeException("charge is greater than minimum balance");
			}catch(Exception e )
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
