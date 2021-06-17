package com.vm.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedure {

	public static void main(String[] args) {
		try {
			Connection con=DBConnection.getConnection();
			
			CallableStatement stmt=con.prepareCall("call findAllRecord");
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
