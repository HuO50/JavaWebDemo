package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	static{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		String url = "jdbc:mysql://123.207.153.24:3306/work?useSSL=true";
		try {
			conn = DriverManager.getConnection(url, "root", "root");
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return conn;
	}
}
