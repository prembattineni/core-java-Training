package com.vm.training.java.Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		
		
		String read=br.readLine();
		
		while(read!=null)
		{
			System.out.println(read);
			read=br.readLine();//to read next character
		}
		
		
	}
}
