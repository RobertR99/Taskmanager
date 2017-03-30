package org.school.taskmanager.db;

import java.sql.SQLException;
import java.util.List;

import org.school.taskmanager.dto.Task;

/**
 * 
 * @author JA & RR - 29.03.2017
 * @version 1.0
 *
 */
public interface DBTask {
	
	/**
	 * Creates a new Task in the DB
	 * 
	 * @param task Task-Object to be created
	 */
	public void dbCreateTask(Task task) throws SQLException;
	
	/**
	 * Changes the Phase of the Task in the DB
	 * 
	 * @param task Task.Objected to be edited
	 */
	public void dbChangeTaskPhase(Task task, String phase) throws SQLException;
	
	/**
	 * Returns a List of all Tasks in the DB
	 */
	public List<Task> dbGetTasks() throws SQLException;
	

}
