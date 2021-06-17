package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CollegeDAO {

  public static void addStudent(College college) throws ClassNotFoundException, SQLException
  {
	  Connection con=DBConnection.getConnection();
	  PreparedStatement ps=con.prepareStatement("insert into college1 values(?,?,?)");
	  
	  ps.setInt(1, college.getId());
		
		ps.setString(2,college.getName());
	
		ps.setString(3, college.getAddress());
		ps.executeUpdate();
	  
  }
}
