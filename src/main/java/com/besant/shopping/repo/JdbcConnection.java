package com.besant.shopping.repo;


import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	public static Connection getConnection() {
		
		String url="jdbc:mySql://localhost:3306/shopping";
		String user="root";
		String password= "Pass@123";
		Connection connection =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return connection;
	}

}
