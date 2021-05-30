package com.vm.training.java.Exceptions;

import java.io.*;
public class TestWithResourceTest {
public static void main(String[] args) {
	try(FileOutputStream fos=new FileOutputStream(new File("C:\\prem\\prem.txt"))){
		String s="Value Momentum";
		byte[] by= s.getBytes();
		fos.write(by);
		System.out.println("success");
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e1)
	{
		e1.printStackTrace();
	}
}
}
