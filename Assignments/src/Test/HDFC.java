package Test;

public class HDFC implements Bank {

	
	int balance;
	double interest;
	
	public HDFC(int balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}

	@Override
	
	public int withdraw(int amount) {
		
		if(balance-amount>=1000)
		{
			balance=balance-amount;
			return balance;
		}
		else {
		  System.out.println("you are withdrawing more than minimum balance");
		}
		return balance;
	}

	@Override
	public int deposit(int amount) {
		balance=balance+amount;
		return balance;
	}

	@Override
	public double interest() {
		
		return interest;
	}

}
