package Test;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws LengthException {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
    System.out.print("enter firstname : ");
    String firstname=sc.next();
    System.out.print("enter lastname : ");
    String lastname=sc.next();
		
		Employee emp=new Employee(firstname,lastname);
		
		emp.Validation();
		
	}

}
