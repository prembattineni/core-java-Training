package Cafeteria;

public class Cappucchino  implements VendingMachine{
	public String make(int q)
	{
		double price= 140.00;
		String item="Cappucchino";
		return item+","+String.valueOf(q*price);	
	}
}
