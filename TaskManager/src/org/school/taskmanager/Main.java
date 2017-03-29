package org.school.taskmanager;

import org.school.taskmanager.db.DBTask;
import org.school.taskmanager.db.DBTaskImpl;

public class Main {

	public Main() {
		
		DBTask dbt = new DBTaskImpl();
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
