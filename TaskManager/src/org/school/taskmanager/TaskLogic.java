package org.school.taskmanager;

import java.util.ArrayList;

public class TaskLogic {

	ArrayList<Task> tasks = new ArrayList<Task>();

	private void createTask(String title, String phase, java.time.LocalDate dueDate) {
		Task t = new Task(title, phase, dueDate);
		tasks.add(t);
	}
	
	private void deleteTask(String title){
		tasks.remove(title); // sehen womit man den Task entfernen kann.
	}
}