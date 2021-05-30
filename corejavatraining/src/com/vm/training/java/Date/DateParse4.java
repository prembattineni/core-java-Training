package com.vm.training.java.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateParse4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date for booking: ");
		String bdate = sc.next();
		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
	 	LocalDate date = LocalDate.parse(bdate,dtf);
		System.out.println(date);
		String s = String.valueOf(date.format(dtf));
		String s1 = String.valueOf(today.format(dtf));
		System.out.println(s);
		if(date.isBefore(today))
			System.out.println("Booking cant be done before "+today);
		else
			System.out.println("Booking was Successfull on "+s);
			
	}

}