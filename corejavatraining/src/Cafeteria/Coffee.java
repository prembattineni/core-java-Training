package Cafeteria;

public class Coffee implements VendingMachine {
	public String make(int q)
	{
		double price= 50.00;
		String item="Coffee";
		return item+","+String.valueOf(q*price);
	}
}
