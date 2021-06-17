
package com.vm.training.jdbc;
import java.util.Scanner;

public class CollegeMain {

	
	static void display()
	{
		System.out.println("1.Insert");
		System.out.println("2.DisplayAll");
		System.out.println("3.Display by id");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
		try {
			
		  // stmt.execute("create table college1(id int,name varchar(20),address varchar(30))");
		   System.out.println("created");
		   
		   int n=-1;
		   
		   while(n!=0)
		   {
			   System.out.println();
			   display();
			  
			   n=sc.nextInt(); 
			   
			   switch(n)
			   {
			   case 1:
				   System.out.println("How many records you want to enter");
				   int num=sc.nextInt();
				   for(int i=0;i<num;i++)
				   {
					   College college=new College();
					   System.out.print("enter id: ");
					   college.setId(sc.nextInt());
					   System.out.print("enter name: ");
					   college.setName(sc.next());
					   System.out.print("enter address: ");
					  college.setAddress(sc.next());
					  CollegeDAO.addStudent(college);
					  
				   }
				   break;
			   
			   case 2:
				   DisplayStudents.displayStudents();
				   break;
				   
			   case 3:
				   System.out.print("enter id : ");
				   int id=sc.nextInt();
				   DisplayStudentsById.displayById(id);
				   break;
			   }
		   }
		   
		   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
