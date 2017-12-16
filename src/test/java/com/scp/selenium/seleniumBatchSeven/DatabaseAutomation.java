package com.scp.selenium.seleniumBatchSeven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseAutomation {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * Database is installed on your machine
		 * --username
		 * --password
		 * --port
		 * --machineip/hostname
		 * --schemaname -- 
		 * --table
		 * --your queries
		 * 
		 * 
		 * 5 steps to connect to any database in java
		 * 1. Load the drivers
		 * 2. Create the connection
		 * 3. Create statement/preparedstatment
		 * 4. Execute Queries
		 * 5. releasing resources-- Resultset/Stmt/pstmt/connection
		 * 
		 */
		
		Class.forName("org.hsqldb.jdbcDriver");
		//Ack -- 
		
		/**
		 * 
		 * String name='John or 1=1';
		 * select * from student where studentname=John or 1=1;
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter student id");
		int id=sc1.nextInt();
		//sc1.close();
		
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","SA","");
		//communication channel
		PreparedStatement pstmt = conn.prepareStatement("select * from student where studentid<?");
		pstmt.setInt(1,id);
		//pstmt.setString(2,name);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			int studid = rs.getInt("studentid");
			String studName = rs.getString("studentname");
			System.out.println("StudId --" +studid +" StudName--"+studName);
			System.out.println("--------------------------------");
		}
		rs.close();
		pstmt.close();
		conn.close();
		/**
		 *Statement -- single string-- constant string -- 
		 *Preparedstmt -- you can pass paramter to the query
		 */
		
		/**
		 * 3-- Database password
		 * 2-- Database Username
		 * 1 -- DB Connection String
		 * 		1> Protocal to connect with db
		 *		2> Machine name or ip address or hostname
		 *      3> Port no
		 *      4> Database schema
		 *      
		 *         
		 * jdbc:hsqldb:hsql://localhost/
		 */
		
		
		
		
	}

}
