package com.vm.bean;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class TicketApplication {

	private Train check(int n,TrainDAO tr)
	{
    
	    
	    Train t=tr.findTrain(n);
	    
	    if(t==null)
	    {
	    	System.out.println("Train with given train number does not exist");
	    	System.exit(1);
	    }
	    return t;
	}
	
	private boolean addPassengers(Ticket t,boolean f)
	{
		Scanner sc=new Scanner(System.in);
		Passenger p;
		System.out.println("Enter Number of Passengers");
		int n=sc.nextInt();
		while(n>0)
		{
            
			System.out.println("Enter Passenger Name ");
			String name=sc.next();
			System.out.println("Enter Age ");
			int age=sc.nextInt();
			System.out.println("Enter Gender(M/F) ");
			char gender=sc.next().charAt(0);
			t.addPassenger(name, age, gender);
			n--;
			if(n==0)
			{
				f=true;
			}
		}
		return f;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
		
	
		//Checking Train  exists or not
		System.out.println("Enter the Train Number");
	    int n=sc.nextInt();
	    TrainDAO tr=new TrainDAO();
	    TicketApplication tc=new TicketApplication();
	    Train t=tc.check(n,tr);
	    
	    //Checking Travel date exists or not
	    LocalDate today=LocalDate.now();
		System.out.println("Enter the Travel date in format(yyyy-mm-dd)");
		String str=sc.next();
		LocalDate ld=LocalDate.parse(str);

		if(!ld.isAfter(today))
		{
			System.out.println("Travel Date is before current date");
			System.exit(1);
		}
	
		
		Ticket ticket=new Ticket(ld,t);
		boolean flag=false;
		flag=tc.addPassengers(ticket,flag);
		if(flag)
			ticket.writeTicket();
			
			
		//Adding Passengers
			
		
		
		
	    }

}
