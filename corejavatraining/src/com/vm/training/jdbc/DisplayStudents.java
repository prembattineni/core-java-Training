package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayStudents {

	public static void displayStudents() throws ClassNotFoundException, SQLException
	{
		Connection con=DBConnection.getConnection();
		 Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from college1");
		System.out.println("ID  Name  Address");
		System.out.println("--  ----  --------");
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"    "+rs.getString(3));
	    }
	}
}
