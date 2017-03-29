package org.school.taskmanager.dto;

import java.util.Date;

/**
 * 
 * @author JA && RR - 29.03.2017
 * @version 1.0
 *
 */
public class Task extends DBElement {

	private int id;
	private String title;
	private String phase;
	private Date creationDate;
	private Date dueDate;

	public Task(int id, String title, String phase, Date creationDate, Date dueDate){
		
		setId(id);
		setTitle(title);
		setPhase(phase);
		setCreationDate(creationDate);
		setDueDate(dueDate);
		
	}
	
	// ----- PRINTER -----//
	
	public void print(){
		
		System.out.println("ID: " + this.getId() + "\n"
						+ "TITLE: " + this.getTitle() + "\n"
						+ "PHASE: " + this.getPhase() + "\n"
						+ "CREATIONDATE: " + this.getCreationDate().toString() + "\n"
						+ "DUEDATE: " + this.getDueDate().toString()); 		
	}
	
	// ----- GETTER / SETTER - METHODS ----- //

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
