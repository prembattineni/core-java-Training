package com.vm.training.java.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//serializable is marker interface .it does not have any methods
	int id;
	transient String name;
	//transient does make serialize
	//in deserialization becomes null if we use transient
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
