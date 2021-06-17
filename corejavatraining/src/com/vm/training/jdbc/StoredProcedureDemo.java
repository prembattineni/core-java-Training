package com.vm.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class StoredProcedureDemo {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	
	Connection conn = DBConnection.getConnection();
	String query ="call insertNewEmployee(?,?,?,?,?)";
	CallableStatement cs = conn.prepareCall(query);
	cs.setInt(1, sc.nextInt());
	cs.setString(2,sc.next());
	cs.setInt(3, sc.nextInt());
	cs.setString(4, sc.next());
	cs.setInt(5, sc.nextInt());
	 cs.executeUpdate();
//	 CallableStatement cs1 = conn.prepareCall("call EmployeebyID(?)");
//	 cs1.setInt(1,id);
//	 ResultSet rs=cs1.executeQuery();
//	ResultSetMetaData rsd = rs.getMetaData();
//	System.out.println(rsd.getColumnName(1)+" "+rsd.getColumnName(2)+" "+rsd.getColumnName(3));
//	System.out.println("----------------------------------------------");
//	while(rs.next())
//	{
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//	}
	
}
}