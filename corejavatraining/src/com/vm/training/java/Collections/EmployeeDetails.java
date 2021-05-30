package com.vm.training.java.Collections;

public class EmployeeDetails extends EmployeeCollection {

	String address;
	String pan;
	public EmployeeDetails(int id, String name, String dept,String address,String pan) {
		super(id, name, dept);
		this.address=address;
		this.pan=pan;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [address=" + address + ", pan=" + pan + "]";
	}

	
}
