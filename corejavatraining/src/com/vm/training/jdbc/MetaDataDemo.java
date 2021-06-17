package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			

			System.out.println("driver class loaded");
			
			//step-2
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","Prembattineni@123");
		   System.out.println("connected to digital database");
		   
		   Statement stmt=con1.createStatement();
		   
		   ResultSet rs=stmt.executeQuery("select * from product");
		   
		   //ResultSet
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
