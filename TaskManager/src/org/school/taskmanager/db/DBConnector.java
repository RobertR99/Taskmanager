package org.school.taskmanager.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 
 * @author JA - 15.93.2017
 * @version 1.0
 *
 */
public class DBConnector {
	
	private Connection conn;
	private Properties prop = null;
	
	public DBConnector(){
		
		loadProperties();
		conn = connectDB();		
	}
	
	private Connection connectDB(){
		Connection conn = null;		
		String driver = prop.getProperty("driver");
		String dbFile = prop.getProperty("dbFile");
		String dbUser = prop.getProperty("dbUser");
		String dbPassword = prop.getProperty("dbPassword");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dbFile, dbUser, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	private void loadProperties(){
		prop = PropertiesLoader.getInstance().getProp();
	}
	
	// ------ GETTER / SETTER - METHODS ----- //
	
	public Connection getConn() {
		return conn;
	}	
}
