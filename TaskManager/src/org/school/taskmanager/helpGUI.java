package org.school.taskmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class helpGUI extends JPanel implements ActionListener {

	public helpGUI() {
		// Buttons

		setLayout(null);
		// Add the Elements

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
		// Settings for Window
		this.setVisible(true);
		// this.setUndecorated(true); // what does this do?
	}

	public void createAndShowGUI() {
		// Create and set up the window.
		JFrame helpFrame = new JFrame("Taskmanager - Help");
		helpFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		helpFrame.setBounds(850, 450, 250, 200);
		// frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add content to the window.
		helpFrame.getContentPane().add(new helpGUI(), BorderLayout.CENTER);

		// Display the window.
		helpFrame.pack();
		helpFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
