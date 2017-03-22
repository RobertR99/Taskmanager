package org.school.taskmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateGUI extends JPanel implements ActionListener {
	private JButton cancel; 
	private JTextField dueDate;
	private JButton btnSave;
	private JButton btnDelte;
	private JLabel lblTitle;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public CreateGUI(){
		//Buttons
		cancel = new JButton("Cancel");
		dueDate = new JTextField();
		dueDate.setBounds(280, 46, 400, 55);
		setLayout(null);
		//Add the Elements
		this.add(cancel);
		this.add(dueDate);
		//And set their size & area
		cancel.setBounds(1348, 838, 106, 38);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(1484, 838, 106, 38);
		add(btnSave);
		
		btnDelte = new JButton("Delete");
		btnDelte.setBounds(1484, 36, 106, 38);
		add(btnDelte);
		
		lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 25));
		lblTitle.setBounds(34, 55, 87, 29);
		add(lblTitle);
		
		JLabel lblPhase = new JLabel("Phase:");
		lblPhase.setFont(new Font("Arial", Font.PLAIN, 25));
		lblPhase.setBounds(34, 233, 87, 29);
		add(lblPhase);
		
		textField = new JTextField();
		textField.setBounds(280, 224, 400, 55);
		add(textField);
		
		JLabel lblDateOfCreation = new JLabel("Date of creation:");
		lblDateOfCreation.setFont(new Font("Arial", Font.PLAIN, 25));
		lblDateOfCreation.setBounds(34, 446, 197, 29);
		add(lblDateOfCreation);
		
		textField_1 = new JTextField();
		textField_1.setBounds(280, 437, 400, 55);
		add(textField_1);
		
		JLabel lblDueDate = new JLabel("Due date:");
		lblDueDate.setFont(new Font("Arial", Font.PLAIN, 25));
		lblDueDate.setBounds(34, 641, 120, 29);
		add(lblDueDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(280, 632, 400, 55);
		add(textField_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Tasks");
		menuBar.setBounds(0, 0, 1615, 21);
		add(menuBar);
		
		JMenu mnTask = new JMenu("Tasks");
		menuBar.add(mnTask);
		
		JMenuItem menuItem = new JMenuItem("Create Task");
		mnTask.add(menuItem);
		
		JMenu menu = new JMenu("Help");
		menuBar.add(menu);
		
		JMenuItem menuItem_1 = new JMenuItem("Help");
		menu.add(menuItem_1);
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



