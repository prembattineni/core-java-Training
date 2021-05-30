package com.vm.training.java.basics;
import java.util.*;
public class CafeteriaMain {
	static void Menu() {
		System.out.println("----------------KFC MENU-------------");
		System.out.println("Select the items");
		System.out.println("1.MinglesBucket"+" "+" 159.0");
		System.out.println("2.Big8"+" "+"559.0");
		System.out.println("3.DipsBucket"+" "+"999.0");
		System.out.println("4.TripleTreat"+" "+"1999.0");
		System.out.println("5.Bill");
	}
@SuppressWarnings({ "unused", "resource" })
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);

	Cafeteria cafeteria;
	int n=0;
	 int quantity;
	 int sum=0;
	while(n!=-1) {
		Menu();
	
		n=sc.nextInt(); //for selecting which items
		int g=1;
		String items="";
		String prices="";

		String[] temp ;
	switch (n) {
	  case 1:
		   cafeteria = new MinglesBucket();
		   System.out.println("select Quantity");
		   quantity=sc.nextInt();
		   
		   temp = cafeteria.order(quantity).split(",");
		   System.out.println(temp[0]+" "+temp[1]);
		   items=items+temp[0]+"/";
			prices=prices+temp[1]+"/";
		   

	    
	    break;
	  case 2:
		  cafeteria = new Big8();
		   System.out.println("select Quantity");
		   quantity=sc.nextInt();
		   
		   temp = cafeteria.order(quantity).split(",");
		    items=items+temp[0]+"/";
			prices=prices+temp[1]+"/";

	    break;
	  case 3:
		  cafeteria = new DipsBucket();
		   System.out.println("select Quantity");
		   quantity=sc.nextInt();
		   
		   temp =cafeteria.order(quantity).split(",");
		   items=items+temp[0]+"/";
			prices=prices+temp[1]+"/";
	    break;
	    
	  case 4:
		  cafeteria = new TripleTreat();
		   System.out.println("select Quantity");
		   quantity=sc.nextInt();
		   
		   temp = cafeteria.order(quantity).split(",");
		   System.out.println(temp[0]);
		    items=items+temp[0]+"/";
			prices=prices+temp[1]+"/";
	    break;
	    
	  case 5:
		  n=-1;
		  System.out.println("---------Bill--------");
		  int total=0;
		     String[] it = items.split("/");
		     String[] pri = prices.split("/");
			
			for(int i=0;i<it.length;i++)
			{
				total=total+Integer.parseInt(pri[i]);
				System.out.println(it[i]+"       "+pri[i]+"/-");
			}
			System.out.println("Total     "+total+"/-");
			
	
		  
	   
	    break;
	}
}
}
}
