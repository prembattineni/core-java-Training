package com.vm.training.java.Date;

import java.time.LocalDate;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println("today "+today);
		System.out.println("next day"+today.plusDays(1));//adding 1 day 
		System.out.println("next day"+today.plusWeeks(2));
		System.out.println("next day"+today.plusMonths(1));
		System.out.println("next day"+today.plusYears(1));
	
	LocalDate bookingdate=  LocalDate.of(2021, 05,31);
	if(bookingdate.isAfter(today))
	{
		System.out.println("correct date you can book");
	}
	else {
		System.out.println("invalid date booking date cannot be previous");
	}

}
}