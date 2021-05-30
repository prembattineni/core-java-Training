package com.vm.training.java.Java8newFeatures;


interface Bank
{
	default void openAccount()
	{
		System.out.println("you can open online");
	}
	static void holiday()//for all banks same so static
	{
		System.out.println("holiday on 2 and 4 saturday");
	}
	
	abstract int rateOfInterest(int interest);
	abstract int minBalance(int amount);
}


class Axis implements Bank{

	@Override
	public int rateOfInterest(int interest) {
		// TODO Auto-generated method stub
		return interest;
	}

	@Override
	public int minBalance(int amount) {
		// TODO Auto-generated method stub
		return amount;
	}
	
    
	
}
public class NewInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Axis();
		b.openAccount();
		b.minBalance(1000);
		b.rateOfInterest(4);
		Bank.holiday();
	}

}
