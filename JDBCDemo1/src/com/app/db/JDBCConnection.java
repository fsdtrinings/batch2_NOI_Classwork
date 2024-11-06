package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCConnection 
{
	public static Connection con;  // responsible for Connection
	
	   
	static
	{
		String host = "localhost:3306";
		String database = "noi";
		String url = "jdbc:mysql://"+ host+"/"+database;
		
		try {
			  Class.forName("com.mysql.jdbc.Driver");
			    con = DriverManager.getConnection(url,"root","root");
			    System.out.println("con "+con);
		} catch (Exception e) {
			System.out.println("Exception during DB Connectionnb "+con);
		}
	  
	}
	
	
	
}//end of class
