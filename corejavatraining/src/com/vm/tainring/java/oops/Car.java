package com.vm.tainring.java.oops;

public abstract class Car implements IVehicle {

	
	public void steering() {
	System.out.println("Power Steering");	
	}
public void brakes() {
		System.out.println("disk brakes");
	}
public void accelerator() {
	System.out.println("120hp accelerator");
}
public void clutches() {
	System.out.println("clutches");
}
public int gears() {
	return 10;
}
abstract void ac();
abstract void indicator();//no abstract keyword we get error

}
