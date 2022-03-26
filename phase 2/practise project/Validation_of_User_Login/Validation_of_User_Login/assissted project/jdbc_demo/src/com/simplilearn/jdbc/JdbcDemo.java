package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcDemo {

	
	public static void main(String[] args) {
		
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		
   Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root", "raushanraj@1");
  
		Statement stmt=  conn.createStatement();
		
		
		/*String query="insert into student values(111,'raushan',current_date,55500)";
		int count= stmt.executeUpdate(query);
		System.out.println(count +" inserted succesfully...");
		*/
		String query= "select * from student";
		
		ResultSet rs= stmt.executeQuery(query);
		
		while(rs.next()){
			int stid=rs.getInt("stid");
			String ename= rs.getString("ename");
			int fee= rs.getInt("fee");// use also column number instead column name 
			
			System.out.println(stid+" "+ename+" "+fee+" "+rs.getDate("doj"));
			
			
		}
		
		
		conn.close();
		
	}catch(SQLException e) {
		
		e.printStackTrace();
	}
		

		
		
		
	
		
		
		
	}
	
		
		
		
		
		
		
		
		
	
	
	
	
}
