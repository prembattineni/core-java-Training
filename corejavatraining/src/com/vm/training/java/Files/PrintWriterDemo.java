package com.vm.training.java.Files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		PrintWriter pw= new PrintWriter("def.txt");
		pw.write(97);//writes a
		pw.print(98);//writes 98
	
	    pw.flush();
	    pw.close();
	}

}
