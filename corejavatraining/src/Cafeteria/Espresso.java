package Cafeteria;

public class Espresso  implements VendingMachine{
	public String make(int q)
	{
		double price= 100.00;
		String item="Espresso";
		return item+","+String.valueOf(q*price);
	}


}
