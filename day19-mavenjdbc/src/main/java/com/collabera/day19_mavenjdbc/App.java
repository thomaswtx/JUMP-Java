package com.collabera.day19_mavenjdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.log4j.Logger;

public class App 
{
	// Create static logger
	static Logger log = Logger.getLogger(App.class.getName());
	
	public static void main( String[] args ) throws IOException {
		log.debug("Hello World!");
		log.info("JDBC test app started.");

		Properties props = new Properties();
		props.load(new FileInputStream("jdbc.properties"));

		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");

		// connect to database
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(dburl, user, password);
			if(conn!=null) {
				System.out.println("mysql connection successfully acquired!");
			}
			String sql = "select * from city";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			rs.close();
			conn.close();
		} catch (Exception ex) {
			//System.out.println(ex.getMessage());
			log.error(ex.getMessage());
		}
	}
}
