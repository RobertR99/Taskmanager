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
		save.setBounds(1511, 893, 57, 23);
		delete = new JButton("Delete");
		delete.setBounds(1542, 37, 63, 23);
		//Textfields
		title = new JTextField();
		title.setBounds(305, 6, 6, 20);
		phase = new JTextField();
		phase.setBounds(316, 6, 6, 20);
		creationDate = new JTextField();
		creationDate.setBounds(327, 6, 6, 20);
		dueDate = new JTextField();
		dueDate.setBounds(338, 6, 6, 20);
		setLayout(null);
		//Add the Elements
		this.add(cancel);
		this.add(save);
		this.add(delete);
		this.add(title);
		this.add(phase);
		this.add(creationDate);
		this.add(dueDate);
		//And set their size & area
		cancel.setBounds(1348, 874, 106, 38);
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
		frame.getContentPane().add(new CreateGUI(), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}



