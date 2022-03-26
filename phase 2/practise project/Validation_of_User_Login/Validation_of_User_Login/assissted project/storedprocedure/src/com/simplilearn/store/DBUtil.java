package com.simplilearn.store;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDBConnection() {
		
		Connection conn= null;
		try {
			
			class.forName("com.mysql.cj.jdbc.Drive");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student",)
			
			
			
		}
		
		
	}
	
	
	
}
