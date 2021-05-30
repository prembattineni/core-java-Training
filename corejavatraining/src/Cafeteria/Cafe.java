package Cafeteria;
import java.util.*;
public class Cafe {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		VendingMachine vm;
		String[] temp;
		String items="";
		String prices="";
		System.out.println("--------------VM Caffetteria--------------");
		boolean repeat = true;
		int quantity;
		while(repeat){
			int choice = printMenu();
			switch(choice){
			case 1: 
				vm= new Coffee();
				System.out.println("enter quantity");
				quantity = s.nextInt();
				temp = vm.make(quantity).split(",");
				System.out.println(temp[0]);
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
			break;
			case 2: 
				vm= new Espresso();
				System.out.println("enter quantity");
				quantity = s.nextInt();
				temp = vm.make(quantity).split(",");
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
				break;
			case 3: 
				vm= new WhiteCoffee();
				System.out.println("enter quantity");
				quantity = s.nextInt();
				temp = vm.make(quantity).split(",");
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
				break;
			case 4: 
				vm= new Cappucchino();
				System.out.println("enter quantity");
				quantity = s.nextInt();
				temp = vm.make(quantity).split(",");
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
				break;
			default:repeat = false;
			double total=0.00;
			     String[] it = items.split("/");
			     String[] pri = prices.split("/");
				System.out.println("----------Bill----------");
				for(int i=0;i<it.length;i++)
				{
					total=total+Double.parseDouble(pri[i]);
					System.out.println(it[i]+"       "+pri[i]+"/-");
				}
				System.out.println("Total     "+total+"/-");
				break;
			}
		}
		}
	
	private static int printMenu(){
		System.out.println("------------------------------------------");
		System.out.println("1. Coffee");
		System.out.println("2. Espresso");
		System.out.println("3. White Coffee with Milk");
		System.out.println("4. Cappucchino");
		System.out.println("0. Bill");
		System.out.println("------------------------------------------");
		return s.nextInt();
	}
//	private static int SelectQuantity(){
//		int q;
//		System.out.print("Select Quantity: ");
//		q=s.nextInt();
//		return q;
//	}
	}
