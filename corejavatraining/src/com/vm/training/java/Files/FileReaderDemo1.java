package com.vm.training.java.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		File f=new File("prem.txt");
		FileReader fr=new FileReader(f);
		int readChar=fr.read();
		while(readChar!=-1)
		{
			System.out.println((char)readChar);
			readChar=fr.read();//to read next character
		}
		
	}

}
