package org.school.taskmanager.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class PropertiesLoader {
	
	private static final String PROPERTIES_FILENAME = ".//files//application.properties";

	private Properties prop = new Properties();
	private InputStream input = null;
	
	private static PropertiesLoader instance = new PropertiesLoader();

	/**
	 * Constructor of the PropertiesLoader-Class, Loads the application.properties
	 */
	public PropertiesLoader() {

		try {
			input = new FileInputStream(PROPERTIES_FILENAME);
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns an Instance of this Class
	 * @return the Instance of the Class
	 */
	public static PropertiesLoader getInstance(){
		return instance;
	}

	// ----- PRINTER ----- //

	public void printProperties() {

		for (Map.Entry<Object, Object> entry : prop.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// ------ GETTER / SETTER - METHODS ----- //

	public Properties getProp() {
		return prop;
	}
}