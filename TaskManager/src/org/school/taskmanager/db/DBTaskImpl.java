package org.school.taskmanager.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.school.taskmanager.dto.Task;

/**
 * 
 * @author JA - 15.03.2017
 * @version 1.0
 *
 */
public class DBTaskImpl implements DBTask {

	private static final String DB_CREATE_TASK = "INSERT INTO TASK (TITLE, PHASE, CREATION_DATE, DUE_DATE) VALUES(?,?,?,?)";
	private static final String DB_CHANGE_TASK = "";
	private static final String DB_GET_TASKS = "SELECT * FROM TASK";
	// private static final String DB_CREATE_USER_TABLE = "CREATE TABLE USER (ID
	// INT NOT NULL, NAME VARCHAR(25))";
	// private static final String DB_INSERT_USER = "INSERT INTO USER VALUES(1,
	// 'Jakob')";

	private Connection conn = null;
	private DBConnector dbc = new DBConnector();

	public DBTaskImpl() {

		if (conn == null) {
			conn = dbc.getConn();
		}

		try {
			PreparedStatement ps = conn.prepareStatement("SHOW TABLES");
			ResultSet rs = ps.executeQuery();
			int col1Pos = rs.findColumn("TABLE_NAME");
			int col2Pos = rs.findColumn("TABLE_SCHEMA");
			while (rs.next()){
				System.out.println(rs.getString(col1Pos));
				System.out.print(rs.getShort(col2Pos));
			}
			
			//dbGetTasks();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void dbCreateTask(Task task) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void dbChangeTaskPhase(Task task) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Task> dbGetTasks() throws SQLException {
		// TODO Auto-generated method stub

		List<Task> tasks = new ArrayList<Task>();

		PreparedStatement ps = conn.prepareStatement(DB_GET_TASKS);
		ResultSet rs = ps.executeQuery();
		int col1Pos = rs.findColumn("ID");
		int col2Pos = rs.findColumn("TITLE");
		int col3Pos = rs.findColumn("PHASE");
		int col4Pos = rs.findColumn("CREATION_DATE");
		int col5Pos = rs.findColumn("DUE_DATE");
		while (rs.next()) {

			int id = rs.getInt(col1Pos);
			String title = rs.getString(col2Pos);
			String phase = rs.getString(col3Pos);
			Date creationDate = rs.getDate(col4Pos);
			Date dueDate = rs.getDate(col5Pos);
			Task task = new Task(id, title, phase, creationDate, dueDate);
			task.print();
			tasks.add(task);
		}
		
		ps.close();
		return tasks;
	}
}
