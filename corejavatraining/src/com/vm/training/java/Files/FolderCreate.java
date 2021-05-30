package com.vm.training.java.Files;

import java.io.File;

public class FolderCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("movies");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}
