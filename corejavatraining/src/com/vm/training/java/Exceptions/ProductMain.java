package com.vm.training.java.Exceptions;

import java.util.Scanner;

public class ProductMain {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=0;
		System.out.println("*******Select the option*******\n");
		System.out.println("1.Product didnot receive");
		System.out.println("2.Product damaged or missed");
		System.out.println("3.Exceeded number of days refund");
		int prb=sc.nextInt();
		switch(prb)
		{
			
			case 1:
				try {
				throw new ProductException("product will be received soon sorry");
				}
				catch(ProductException e)
				{
					e.printStackTrace();
				}
				break;
				
			case 2:
				try {
				throw new ProductDamaged("you will receive new product");
				}
				catch(ProductDamaged e)
				{
					e.printStackTrace();
				}
				break;	
			case 3:
				try {
					System.out.println("enter nuber of days");
					int days=sc.nextInt();
					if(days>15) {
						 balance=1000;
						 
				throw new ExceededDays("refunded your amount "+balance);
				
				
					}
					else {
						System.out.println("you will receive in within 15 working days");
					}
				}
				catch(ExceededDays e)
				{
					e.printStackTrace();
				}
				break;	
				
				}
	
	}
	
}
