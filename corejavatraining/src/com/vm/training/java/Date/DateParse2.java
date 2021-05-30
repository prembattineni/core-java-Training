package com.vm.training.java.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateParse2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate today=LocalDate.parse(date,dtf);
		System.out.println(today);
		
	}
	
}
