package com.vm.tainring.java.oops;

public class OuterMain {
public static void main(String[] args) {
	Outer outer=new Outer();
	Outer.Inner inner = outer.new Inner();
	inner.display();
}
}
