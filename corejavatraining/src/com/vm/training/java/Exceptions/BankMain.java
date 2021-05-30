package com.vm.training.java.Exceptions;

import java.util.Scanner;


public class BankMain {
	static void menu() {
		System.out.println("select options");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bank hdfc=new HDFC();
	int sampleaccount=89492;
	System.out.println("Are you account manger");
	String s = sc.next();
	if(s.equals("yes"))
	{
		System.out.println("applying charges");
		hdfc.charges();
	}
	else {
	System.out.println("enter account no");
	int account=sc.nextInt();
	int balance;
	if(account==sampleaccount){
		menu();
		int input=0;
		while(input!=-1) {
			input=sc.nextInt();
		switch(input)
		{
			case 1:
				System.out.println("enter amount to deposit");
				int deposit=sc.nextInt();
				 balance=hdfc.Deposit(deposit);
				System.out.println("succesfully deposited and your balance is"+balance);
				break;
			case 2:
				System.out.println("enter amount to withdraw");
				int withdraw=sc.nextInt();
				balance=hdfc.withdraw(withdraw);
				System.out.println("succesfully withdrawn and your balance is"+balance);
				break;
			case 3:
				hdfc.showbalance();
				break;
			default :
				    input=-1;
				    break;
				
		}
		
		}
	}
	}
}
}
