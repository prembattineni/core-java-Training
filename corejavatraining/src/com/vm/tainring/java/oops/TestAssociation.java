package com.vm.tainring.java.oops;

public class TestAssociation {

	public static void main(String[] args) {
		//showAggregation();
		showComposition();
	}
	static void showAggregation() {
		Address address=new Address();
		address.setCity("Vijaywada");
		address.setState("AP");
		address.setCountry("India");
		
		Emp emp=new Emp();
		emp.setId(101);
		emp.setFirstname("prem");
		emp.setLastName("battineni");
		emp.setAddress(address);         //we need to create toString() also for address
		System.out.println(emp);
		System.out.println("-----------------------------------");
		emp=null;
		System.out.println(emp);
		System.out.println(address);
		
	}
	static void showComposition()
	{
		
		
		Person per=new Person();
		per.setId(101);
		per.setFirstname("prem");
		per.setLastName("battineni");
		per.setLastName("abc");
		per.getAddress().setCity("hyd");
		per.getAddress().setState("ap");
		per.getAddress().setCountry("india");
		System.out.println(per);
		per=null;
		System.out.println(per);
		//System.out.println(per.getAddress());
		
	}
}
