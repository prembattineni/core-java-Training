package com.vm.tainring.java.oops;

public class Manager {
	public static void main(String[] args) {
		//HavellsAppliances havellsAppliances = new HavellsAppliances();
		SwitchListener switchListener = new GEAppliances();
				//new HavellsAppliances();
		SwitchListener switchListener1 = new HavellsAppliances();
				//new GEAppliances();
				
		switchListener.switchOne();
		switchListener.switchTwo();
		switchListener.switchThree();
		switchListener.switchFour();
		switchListener.wifiSwitch();

	}
}
