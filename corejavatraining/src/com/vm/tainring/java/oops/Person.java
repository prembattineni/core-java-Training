package com.vm.tainring.java.oops;

public class Person {
  
	Address address;
	Person(){
		address=new Address(); //person is whole and address is part
		
	}
	int id;
	String firstname;
	String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", address=" + address + "]";
	}
}
