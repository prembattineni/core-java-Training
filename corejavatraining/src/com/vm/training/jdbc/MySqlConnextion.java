package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlConnextion {

	public static void main(String[] args) {

		
		try {
			
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("driver class loaded");
			
			//step-2
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","Prembattineni@123");
		   System.out.println("connected to digital database");

			Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/prem?autoReconnect=true&useSSL=false","root","Prembattineni@123");
			System.out.println("connected to prem database");
		      
		
		Statement stmt=con1.createStatement();
		
//		stmt.execute("insert into product values(5,'charger',400,'electronics')");
//		      //OR execute returns boolean,executeUpdate returns int 
//		stmt.executeUpdate("insert into product values(5,'charger',400,'electronics')");
		
		//step3
		stmt.execute("create table college(id int,name varchar(20))");
		int i=stmt.executeUpdate("insert into college values(1,'prem')");
		System.out.println(i);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      		
		
	}

}
