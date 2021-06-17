package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlConnection {

	public static void main(String[] args) {
	
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from product");
			ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
