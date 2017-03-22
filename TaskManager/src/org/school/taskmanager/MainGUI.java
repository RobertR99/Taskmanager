package org.school.taskmanager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class MainGUI extends JPanel implements ActionListener {
	private final Action action = new SwingAction();
	public MainGUI() {
		setLayout(null);
		setVisible(true);
		
		JLabel lblToDo = new JLabel("To Do");
		lblToDo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblToDo.setBounds(79, 30, 106, 23);
		add(lblToDo);
		
		JLabel lblDone = new JLabel("Done");
		lblDone.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDone.setBounds(865, 30, 106, 23);
		add(lblDone);
		
		JLabel lblInProgress = new JLabel("In Progress");
		lblInProgress.setFont(new Font("Arial", Font.PLAIN, 20));
		lblInProgress.setBounds(447, 30, 106, 23);
		add(lblInProgress);
		
		JButton btnEdit = new JButton("edit");
		btnEdit.setBounds(255, 154, 51, 23);
		add(btnEdit);
		
		JButton button = new JButton("edit");
		button.setBounds(652, 154, 51, 23);
		add(button);
		
		JButton button_1 = new JButton("edit");
		button_1.setBounds(991, 154, 51, 23);
		add(button_1);
		
		JLabel lblTestprojecttestprojecttestprojecttestprojecttestproject = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		lblTestprojecttestprojecttestprojecttestprojecttestproject.setBounds(42, 158, 264, 19);
		add(lblTestprojecttestprojecttestprojecttestprojecttestproject);
		
		JLabel label = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		label.setBounds(407, 158, 264, 19);
		add(label);
		
		JLabel label_1 = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		label_1.setBounds(766, 158, 264, 19);
		add(label_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Tasks");
		menuBar.setBounds(0, 0, 1615, 21);
		add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Tasks");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Create Task");
		mntmNewMenuItem.setAction(action);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Help");
		mnHelp.add(mntmNewMenuItem_1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
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
			putValue(NAME, "Create Task");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}

