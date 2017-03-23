package org.school.taskmanager.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author JA - 15.03.2017
 * @version 1.0
 *
 */
public class DBTransactions {

	private static final String DB_GET_ALL = "SELECT * FROM USER";
	private static final String DB_GET_TABLES = "SHOW TABLES";
	//private static final String DB_CREATE_USER_TABLE = "CREATE TABLE USER (ID INT NOT NULL, NAME VARCHAR(25))";
	//private static final String DB_INSERT_USER = "INSERT INTO USER VALUES(1, 'Jakob')";

	private Connection conn = null;
	private DBConnector dbc = new DBConnector();

	public DBTransactions() {

		if (conn == null) {
			conn = dbc.getConn();
		}

		try {
			//dbGetTables();
			//dbQuery(DB_CREATE_USER_TABLE);
			dbGetTables();
			//dbQuery(DB_INSERT_USER);
			dbGetUser();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void dbGetUser() throws SQLException {

		PreparedStatement ps = conn.prepareStatement(DB_GET_ALL);
		ResultSet rs = ps.executeQuery();
		int col1Pos = rs.findColumn("ID");
		int col2Pos = rs.findColumn("NAME");
		while (rs.next()) {

			int id = rs.getInt(col1Pos);
			String name = rs.getString(col2Pos);

			System.out.println(id + " | " + name);
		}
		ps.close();
	}
	
	private void dbGetTables() throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(DB_GET_TABLES);
		ResultSet rs = ps.executeQuery();
		int col1Pos = rs.findColumn("TABLE_NAME");
		int col2Pos = rs.findColumn("TABLE_SCHEMA");
		while (rs.next()){
			String name = rs.getString(col1Pos);
			String schema = rs.getString(col2Pos);
			
			System.out.println(name + " | " + schema);
		}
		ps.close();		
	}
	
	/*private void dbQuery(String sql) throws SQLException{
		
		PreparedStatement ps = conn.prepareCall(sql);
		ps.execute();
		ps.close();		
	}*/
}
