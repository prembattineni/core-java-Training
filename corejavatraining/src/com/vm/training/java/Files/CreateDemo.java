package com.vm.training.java.Files;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("pre.txt");
		File f1=new File("C:\\prem\\pre.txt");
		//System.out.println(f.exists());//checks file exists or not
	if(f1.exists())
	{
		System.out.println("file alredy exists");
	}
	else {
		System.out.println("file not present we are creating");
		f1.createNewFile();
		System.out.println("file created");
	}
	
	}
}
