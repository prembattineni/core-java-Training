package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayStudentsById {

	public static void displayById(int id) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.getConnection();
	PreparedStatement ps=con.prepareStatement("select * from college1 where id=?");
	ps.setInt(1,id );
	ResultSet rs=ps.executeQuery();
	System.out.println("ID  Name  Address");
	System.out.println("--  ----  --------");
	while(rs.next())
    {
    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"    "+rs.getString(3));
    }
	}
}
