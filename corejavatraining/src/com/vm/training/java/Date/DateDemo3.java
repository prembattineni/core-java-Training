package com.vm.training.java.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("yyyy MM dd");//MM or MMM
                                                                          //MM - number MMM-charcters
		
		DateTimeFormatter dtlong= DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtfull= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtmedium= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtshort= DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        
		

		String afterFormat=today.format(dtf);
		System.out.println("after format : "+afterFormat);
	
		String longdate=today.format(dtlong);
		System.out.println("after format : "+longdate);
		
		String fulldate=today.format(dtfull);
		System.out.println("full date : "+fulldate);

		String mediumdate=today.format(dtmedium);
   System.out.println("medium date : "+mediumdate);
   
		String shortdate=today.format(dtshort);
          System.out.println("short date : "+shortdate);
	
	}
}
	
	/*
	 yy -> year in 2021 -> 21
	 yyyy -> 2021
	 MM  -> month in number - 5
	 MMM  -> months in char ->May
	 M ->  month in the year  jan=1, feb=2, mar=3
	 W -> week in the month 4 i.e., 4th week 
	 
	 * 
	 */ 
	
	 

