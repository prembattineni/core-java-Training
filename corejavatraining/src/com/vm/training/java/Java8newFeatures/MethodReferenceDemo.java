package com.vm.training.java.Java8newFeatures;


interface Validate{
	void validateLogin();
}

class Car{
	void myLogin()
	{
		System.out.println("you can login using id and password");
	}
}

class Bus{
	static void login()
	{
		System.out.println("this is login");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Validate v=()->System.out.println("login validation");
	v.validateLogin();
	Car c=new Car();
	Validate v1=c::myLogin;
	v1.validateLogin();
	
	Validate v2=Bus::login;
	v2.validateLogin();
	}

}
