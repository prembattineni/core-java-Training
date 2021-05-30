package com.vm.tainring.java.oops;

//in aggreagation if whole gets destroyed part will not get destroyed
//Association using aggregation
public class Emp {

	int id;
	String firstname;
	String lastName;
	Address address;
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
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", address=" + address + "]";
	}
}
