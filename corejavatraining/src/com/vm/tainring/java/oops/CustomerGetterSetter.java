package com.vm.tainring.java.oops;

public class CustomerGetterSetter {
public static void main(String[] args) {
	Customer customer = new Customer();
	customer.setId(101);
	customer.setFirstName("prem");
	customer.setLastName("Bathineni");
	customer.setAccount("savings");
	System.out.println(customer.getId());
	System.out.println(customer.getFirstName());
	System.out.println(customer.getLastName());
	System.out.println(customer.getAccount());
}
}
