package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			//step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("driver class loaded");
			
			//step-2
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","Prembattineni@123");
		   System.out.println("connected to digital database");

			Statement stmt=con1.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from product");
			
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		    }
		    
		   
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
