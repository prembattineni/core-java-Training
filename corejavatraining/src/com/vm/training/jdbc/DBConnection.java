package com.vm.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class DBConnection {

	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		
		Class.forName(JDBCProperties.DRIVER_CLASS);
		return DriverManager.getConnection(JDBCProperties.URL,JDBCProperties.USERNAME,JDBCProperties.PASSWORD);
		
		
	}
}
