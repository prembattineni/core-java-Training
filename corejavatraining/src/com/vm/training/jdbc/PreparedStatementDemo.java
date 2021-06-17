package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
try {
			
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("driver class loaded");
			
			//step-2
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","Prembattineni@123");
		   System.out.println("connected to digital database");

//			PreparedStatement ps=con1.prepareStatement("insert into product values(?,?,?,?)");
//			int id=sc.nextInt();
//			ps.setInt(1, id);
//			String s=sc.next();
//			ps.setString(2, s);
//			int cost=sc.nextInt();
//			ps.setInt(3, cost);
//			String cat=sc.next();
//			ps.setString(4, cat);
			
			//ps.execute();
		    System.out.println("inserted");
		    
		    PreparedStatement ps2=con1.prepareStatement("insert into student40(name,dept,year) values(?,?,?)");
		   ps2.setString(1,"battineni");
		   ps2.setString(2, "ece");
		   ps2.setString(3,"4th year");
		   
		   ps2.execute();
		   
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
