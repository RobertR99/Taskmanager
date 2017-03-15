package org.school.taskmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateGUI extends JPanel implements ActionListener {
	private JButton cancel, save, delete; 
	private JTextField title, phase, creationDate, dueDate;
	
	public CreateGUI(){
		//Buttons
		cancel = new JButton("Cancel");
		save = new JButton("Save");
		delete = new JButton("Delete");
		//Textfields
		title = new JTextField();
		phase = new JTextField();
		creationDate = new JTextField();
		dueDate = new JTextField();
		//Add the Elements
		this.add(cancel);
		this.add(save);
		this.add(delete);
		this.add(title);
		this.add(phase);
		this.add(creationDate);
		this.add(dueDate);
		//And set their size & area
		cancel.setBounds(1700, 900, 100, 100);
		//Settings for Window
		this.setVisible(true);
		//this.setUndecorated(true); 								// what does this do?
	}
	
	public void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Taskmanager - Create new Task");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add content to the window.
		frame.add(new CreateGUI(), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}



