package org.school.taskmanager.dto;

/**
 * 
 * @author JA & RR - 29.03.2017
 * @version 1.0
 *
 */
public class Phase extends DBElement{
	
	private int id;
	private String name;
	
	public Phase(int id, String name){
		
		setId(id);
		setName(name);
		
	}
	
	// ----- PRINTER ----- //
	
	public void print(){
		
		System.out.println("ID: " + this.getId() + "\n"
				+ "NAME: " + this.getName());
	}
	
	// ----- GETTER / SETTER - METHODS ----- //

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
