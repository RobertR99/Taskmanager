package org.school.taskmanager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class MainGUI extends JPanel implements ActionListener {
	private final Action createGUI = new SwingAction();
	private final Action help = new SwingAction();
	private final Action edit = new SwingAction();
	
	public MainGUI() {
		setLayout(null);
		setVisible(true);
		
		JLabel lblToDo = new JLabel("To Do");
		lblToDo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblToDo.setBounds(79, 30, 106, 23);
		add(lblToDo);
		
		JLabel lblDone = new JLabel("Done");
		lblDone.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDone.setBounds(1283, 30, 106, 23);
		add(lblDone);
		
		JLabel lblInProgress = new JLabel("In Progress");
		lblInProgress.setFont(new Font("Arial", Font.PLAIN, 20));
		lblInProgress.setBounds(638, 30, 106, 23);
		add(lblInProgress);
		
		JButton btnEdit = new JButton("edit");
		edit.putValue(Action.ACTION_COMMAND_KEY, "edit");
		btnEdit.setAction(edit);
		btnEdit.setBounds(255, 154, 51, 23);
		add(btnEdit);
		
		JButton button = new JButton("edit");
		button.setBounds(843, 154, 51, 23);
		add(button);
		
		JButton button_1 = new JButton("edit");
		button_1.setBounds(1409, 154, 51, 23);
		add(button_1);
		
		JLabel lblTestprojecttestprojecttestprojecttestprojecttestproject = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		lblTestprojecttestprojecttestprojecttestprojecttestproject.setBounds(42, 158, 264, 19);
		add(lblTestprojecttestprojecttestprojecttestprojecttestproject);
		
		JLabel label = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		label.setBounds(598, 158, 264, 19);
		add(label);
		
		JLabel label_1 = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		label_1.setBounds(1184, 158, 264, 19);
		add(label_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Tasks");
		menuBar.setBounds(0, 0, 1615, 21);
		add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Tasks");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Create Task");
		createGUI.putValue(Action.ACTION_COMMAND_KEY, "create");
		mntmNewMenuItem.setAction(createGUI);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mHelp = new JMenuItem("Help");
		help.putValue(Action.ACTION_COMMAND_KEY, "help");
		mHelp.setAction(help);
		mnHelp.add(mHelp);
	}
	
	public void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Taskmanager - Home");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add content to the window.
		frame.getContentPane().add(new MainGUI(), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "create Task");
			putValue(SHORT_DESCRIPTION, "It handles all actions of the class.");
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("create")){
			//open create Task window. 
			CreateGUI cg = new CreateGUI();
			cg.createAndShowGUI();
			}
		}
	}
	
	private class helpAction extends AbstractAction {
		public helpAction() {
			putValue(NAME, "Help");
			putValue(SHORT_DESCRIPTION, "Opens the Help GUI.");
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("help")){
				//open the Help Window
				//helpGUI h = new helpGUI();
				//h.createAndSHowGUI();
			}
		}
	}
	
	private class editAction extends AbstractAction {
		public editAction() {
			putValue(NAME, "Edit");
			putValue(SHORT_DESCRIPTION, "Opens the create new Task GUI and gets Values from DB.");
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("edit")){
				CreateGUI cg = new CreateGUI();
				cg.createAndShowGUI();
				//get values out of DB and put them in the textfield
			}
		}
	}
	
	
}

//Edit Button - Change Text.

