package EmployeeUsingCollections;

public class Gst extends IncomeTax {

	@Override
	void tax()
	{
		System.out.println("sub class");
		
	}
	public static void main(String[] args) {
		IncomeTax gst=new IncomeTax();
		gst.tax();
	}
	
}
