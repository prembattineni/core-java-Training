package com.vm.tainring.java.oops;

public class EmployeeMain {
 public static void main(String[] args) {
	Employee customer = new Employee();
		customer.setEmpid(101);
		customer.setName("prem");
		customer.setDept("Bathineni");
		
		System.out.println(customer.getEmpid());
		System.out.println(customer.getName());
		System.out.println(customer.getDept());
 }
}
