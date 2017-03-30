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
	private static final String DB_CHANGE_TASK_PHASE = "ALTER TABLE TASK SET PHASE=? WHERE ID=?";
	private static final String DB_GET_TASKS = "SELECT * FROM TASK";

	private Connection conn = null;
	private DBConnector dbc = new DBConnector();

	public DBTaskImpl() {

		if (conn == null) {
			conn = dbc.getConn();
		}
	}

	@Override
	public void dbCreateTask(Task task) throws SQLException {

		PreparedStatement ps = conn.prepareStatement(DB_CREATE_TASK);
		ps.setString(1, task.getTitle());
		ps.setString(2, task.getPhase());
		ps.setString(3, task.getCreationDate());
		ps.setString(4, task.getDueDate());
		ps.execute();
		ps.close();
	}

	@Override
	public void dbChangeTaskPhase(Task task, String phase) throws SQLException {

		PreparedStatement ps = conn.prepareStatement(DB_CHANGE_TASK_PHASE);
		ps.setString(1, phase);
		ps.setInt(2, task.getId());
		ps.execute();
		ps.close();
	}

	@Override
	public List<Task> dbGetTasks() throws SQLException {
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
			String creationDate = rs.getString(col4Pos);
			String dueDate = rs.getString(col5Pos);
			Task task = new Task(id, title, phase, creationDate, dueDate);
			task.print();
			tasks.add(task);
		}

		ps.close();
		return tasks;
	}
}
