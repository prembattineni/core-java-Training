package com.vm.training.java.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File f=new File("prem.txt");
		//FileWriter fw =new FileWriter(f);
		
		           //OR
		
		FileWriter fw =new FileWriter(new File("pre.txt"),true);//true will append data in file.if we donot write true it will override
		fw.write("a \n");
		fw.write("hello  \n");
		fw.write("kumar \n");
		
		fw.flush();//data will go to file
		fw.close();//close the file
		System.out.println("data written");
		
		
	}

}
