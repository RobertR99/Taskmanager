package org.school.taskmanager;
/**
 * 
 * @author Robert Randles, Jakob Abraham
 *
 */
public class Task {
	String title;
	String phase;
	java.time.LocalDate dueDate;
	long creationDate;
	
	public Task(String title, String phase, java.time.LocalDate dueDate){
		this.title = title;
		this.phase = phase;
		this.dueDate = dueDate;
		this.creationDate = System.currentTimeMillis();
	}
	
	public void editTask(String title, String phase, java.time.LocalDate dueDate){
		this.title = title;
		this.phase = phase;
		this.dueDate = dueDate;
		this.creationDate = System.currentTimeMillis();
	}
	
	public String getTitle(){ //do we need this?
		return this.title;
	}

	public String getPhase() {
		return phase;
	}

	public java.time.LocalDate getDueDate() {
		return dueDate;
	}

	public long getCreationDate() {
		return creationDate;
	}

}
