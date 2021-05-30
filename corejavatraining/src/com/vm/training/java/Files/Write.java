package com.vm.training.java.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Write {
public static void main(String[] args) throws IOException {
	File f=new File("hiii.txt");
	FileReader fr=new FileReader(f);
	int readChar=fr.read();
	while(readChar!=-1)
	{
		char ch=(char)readChar;
		int a=Character.getNumericValue(ch);
		if(a%2==0)
		{
			System.out.println(a);
		}
		readChar=fr.read();
	}
}
}
