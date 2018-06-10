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
		String url = "jdbc:mysql://10.119.64.7:3306/work?useSSL=true";
		try {
			conn = DriverManager.getConnection(url, "root", "mzy6893");
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		return conn;
	}
}
