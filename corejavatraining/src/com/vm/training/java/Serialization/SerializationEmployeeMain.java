package com.vm.training.java.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEmployeeMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Employee emp=new  Employee(1, "john");
		
		FileOutputStream fis=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		
		oos.writeObject(emp);
		System.out.println("serialization demo");
		
		
	}

}
