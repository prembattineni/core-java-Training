package com.vm.tainring.java.oops;

public class Customer {

/*	int id=100;
	String firstName="vijay";
	String lastName="pradeep";
	String account="saving";
	void show()
	{
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(account);
	}*/
	protected int id;
	private String firstName;
	private String lastName;
	private String account;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	
	
	public Customer()
	{
		System.out.println("default");
		
	}
}
