package org.school.taskmanager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.school.taskmanager.db.DBTask;
import org.school.taskmanager.db.DBTaskImpl;
import org.school.taskmanager.dto.Phase;
import org.school.taskmanager.dto.Task;

/**
 * 
 * @author JA & RR - 29.03.2017
 * @version 1.0
 *
 */
public class TaskLogic {
	
	private List<Phase> phases;
	private List<Task> tasks = new ArrayList<Task>();
	
	private DBTask dbt = new DBTaskImpl();
	
	public TaskLogic(){
		updateTaskLogic();
	}
	
	private void updateTaskLogic(){
		try {
		setTasks(dbt.dbGetTasks());
		} catch (SQLException e){
			e.printStackTrace();			
		}
		phases = new ArrayList<Phase>();
		phases.add(new Phase(1, "Todo"));
		phases.add(new Phase(2, "In Progress"));
		phases.add(new Phase(3, "Done"));
	}
	
	public void createTask(Task task){
		
		try {
			dbt.dbCreateTask(task);
		} catch (SQLException e){
			e.printStackTrace();
		}
		updateTaskLogic();
	}
	
	public void changeTaskPhase (Task task, String phase){
		
		try{
			dbt.dbChangeTaskPhase(task, phase);
		} catch (SQLException e){
			e.printStackTrace();
		}
		updateTaskLogic();		
	}
	
	// ----- GETTER / SETTER - METHODS ----- //

	public List<Phase> getPhases() {
		return phases;
	}

	public void setPhases(List<Phase> phases) {
		this.phases = phases;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
}