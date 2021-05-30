package com.vm.tainring.java.oops;

public class GrandFatherMain {
public static void main(String[] args) {
	Son s=new Son(20,30,40);
	s.walk();
	GrandFather f=new Son(12,24,42);
	f.walk();
}
}
