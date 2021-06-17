package Test;

import java.util.Scanner;

public class SavingsAccount {

	
	static void menu()
	{
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.check rate of interest");
	}
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
	
	int balance;
	double interest;
	
	balance=2000;
	interest=5.6;
	
	
	HDFC hdfc=new HDFC(balance,interest);
	
	boolean b=true;
	int n;
	int amount;
	while(b)
	{
		menu();
		n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("enter amount to deposit");
			 amount=sc.nextInt();
			System.out.println("Your balance after depositing is"+hdfc.deposit(amount));
			break;
			
		case 2:
			System.out.println("enter amount to withdraw");
			 amount=sc.nextInt();
			System.out.println("Your balance after withdrawing is"+hdfc.withdraw(amount));
			break;
		
		case 3:
			System.out.println("Rate of interest is "+hdfc.interest());
		    break;
		 
		default:
			b=false;
		}
		
	}
	
	
	
	
	
	
	
	}

	
	
}
