package Cafeteria;

public class WhiteCoffee  implements VendingMachine {
	public String make(int q)
	{
		double price= 80.00;
		String item="White Coffee with Milk";
		return item+","+String.valueOf(q*price);		
	}
}
