package com.vm.tainring.java.oops;

public class Bus implements IVehicle{

	public void steering() {
		System.out.println("Max Power Steering");	
		}
	public void brakes() {
			System.out.println("hper disk brakes");
		}
	public void accelerator() {
		System.out.println("30hp accelerator");
	}
	public void clutches() {
		System.out.println("clutches");
	}
	public int gears() {
		return 1;
	}
	}

