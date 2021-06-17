package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetCursor {

	public static void main(String[] args)
	
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");
			
			//step-2
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","Prembattineni@123");
		   System.out.println("connected to digital database");
		  Statement stmt=con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		 ResultSet rs= stmt.executeQuery("select * from product order by price desc");
		rs.absolute(2);//fetches 2nd row from table
		//rs.last();//fetches last row in table
		rs.first();//fetches first row in table
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

		
	}
}
