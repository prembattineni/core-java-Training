package com.vm.tainring.java.oops;

public class TestInterface {
public static void main(String[] args) {
	/*IVehicle vehicle = new Car();
	vehicle.accelerator();
	vehicle.brakes();
	vehicle.clutches();
	vehicle.gears();
	vehicle.steering();*/
	Car car = new BMW();
	
	car.ac();
	car.indicator();
	car.accelerator();
	car.brakes();
	car.clutches();
	car.gears();
	car.steering();
	
	//IVehicle v1=new BMW();  wrong
	//v1.ac();  error
}
}
