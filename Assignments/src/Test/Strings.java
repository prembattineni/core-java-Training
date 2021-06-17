package Test;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("enter word :");
		String word=sc.nextLine();
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(ch!=' ')
			{
				count++;
			}
		}
		String[] word1=word.split(" ");
		System.out.println("Word-> "+word1.length);
		System.out.println("Character "+count);
		
	}

}
