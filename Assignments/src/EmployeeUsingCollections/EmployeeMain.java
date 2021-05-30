package EmployeeUsingCollections;

import java.util.*;
import java.util.Scanner;

public class EmployeeMain {

	static void selection(){
		System.out.println("*****Select Options*****");
		System.out.println("1. Add Employee");
		System.out.println("2. Display all employees");
		System.out.println("3. Update Employee");
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		Employee e = null;
		int id;
		String firstname;
		String lastname;
		String address;
		String mobileno;
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		int a=-1;
		while(a!=0) {
			selection();
			System.out.println("\n");
			
			a=sc.nextInt();
		switch(a)
		{
		
		case 1: 
			e=new Employee();
			  System.out.print("enter id :");
			  id=sc.nextInt();
			  e.setId(id);
			  System.out.print("enter firstname :");
			  firstname=sc.next();
			  e.setFirstname(firstname);
			  System.out.print("enter lastname :");
			  lastname=sc.next();
			  e.setLastname(lastname);
			  System.out.print("enter address :");
			  address=sc.nextLine();
			  address=sc.nextLine();
			  e.setAddress(address);
			  System.out.print("enter mobileno :");
			  mobileno=sc.next();
			  e.setMobileno(mobileno);
			  emp.add(e);
			  System.out.println("\n");
			  break;
		
		case 2:
			  System.out.println("enter id : ");
			  
			  for(int i=0;i<emp.size();i++)
			  {
				  System.out.println(emp.get(i));
			  }
			  System.out.println("\n");
			  break;
			  
		case 3:
			System.out.println("enter id");
			  id=sc.nextInt();
			  for(int i=0;i<emp.size();i++)
			  {
			  if(emp.get(i).getId()==id)
			  {
				  System.out.print("what you want to update");
				  String s1=sc.next();
				  System.out.print("enter value :");
				  String s;
				   
				  if(s1.equalsIgnoreCase("firstname"))
				  {
					 
					  s=sc.next();
					  e.setFirstname(s);
				   }
				  else if(s1.equalsIgnoreCase("lastname"))
				  {
					 
					  s=sc.next();
					  e.setLastname(s);
					  
				   }
				  else if(s1.equalsIgnoreCase("address"))
				  {
					 
					  s=sc.next();
					  e.setAddress(s);
					  
				   }
				  else if(s1.equalsIgnoreCase("mobileno"))
				  {
					  
					  s=sc.next();
					  e.setMobileno(s);
				   }
				  
			  }
			  }
			  System.out.println("\n");
			  break;
		default:
			   a=0;
			   break;
			
		}
		}
	}
}
