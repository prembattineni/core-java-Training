package com.vm.training.java.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate todaydate = LocalDate.now();//present date
		System.out.println("today date= "+todaydate);
		LocalDateTime todaydatetime = LocalDateTime.now();
	  System.out.println("Todays date and time = "+todaydatetime);
	
	  System.out.println("day of the year = "+todaydate.getDayOfYear());
	  System.out.println("month of the year = "+todaydate.getDayOfMonth());
	  System.out.println("week of the year = "+todaydate.getDayOfWeek());
	  
	}

}
