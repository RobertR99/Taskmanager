package org.school.taskmanager;

import org.school.taskmanager.db.DBTaskImpl;

/**
 * 
 * @author JA - 15.02.2017
 * @version 1.0
 *
 */
public class Application {
	
	public Application(){
		
		new DBTaskImpl();
		
	}
	
	public static void main(String[] args) {
		new Application();
	}

}
