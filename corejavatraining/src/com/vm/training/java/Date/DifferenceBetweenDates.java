package com.vm.training.java.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DifferenceBetweenDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 String dob=sc.next();
 DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/yyyy/dd");
	LocalDate today=LocalDate.parse(dob,dtf);
		LocalDate today1 = LocalDate.now();
		//LocalDate joiningDate = LocalDate.of(1999,9,10);//year-day-month0
	   
		
		Period period=Period.between(today,today1);
	  System.out.println(period.getYears()+" "+period.getMonths()+" "+period.getDays());
	  
	}

}
