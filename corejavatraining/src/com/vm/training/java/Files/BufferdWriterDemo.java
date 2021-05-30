package com.vm.training.java.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("prem.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello welcome");
		bw.newLine();
		bw.write("thanks");
		
		bw.flush();
		bw.close();
	}

}
