package Assignment;

public class IBankMain {
public static void main(String[] args) {
	IBank sbank = new SBI();
	IBank ibank = new ICICI();
	IBank abank = new Axis();
	System.out.println("The rate of intrest of sbi is : "+ sbank.rateOfInterest());
	System.out.println("The rate of intrest of icici is : "+ ibank.rateOfInterest());
	System.out.println("The rate of intrest of axix is : "+ abank.rateOfInterest());
}
}
