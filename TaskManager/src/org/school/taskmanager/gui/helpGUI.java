package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class helpGUI extends JPanel implements ActionListener {
	private JFrame helpFrame;

	public helpGUI() {
		// Buttons

		setLayout(null);
		// Add the Elements
		
		JLabel helpText = new JLabel("Hello, this is your Help file. \n"
				+ "If you have questions regarding this program please contact \n" // how do I make a new Line?
				+ "Jakob Abraham: jakob.abraham@gibmit.ch \n"
				+ "or Robert Randles: robert.randles@gibmit.ch \n");
		helpText.setSize(400, 200);
		this.add(helpText);

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
	}

	public void createAndShowGUI() {
		// Create and set up the window.
		this.helpFrame = new JFrame("Taskmanager - Help");
		this.helpFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.helpFrame.setBounds(850, 450, 250, 200);
		// frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add content to the window.
		this.helpFrame.getContentPane().add(this, BorderLayout.CENTER);

		// Display the window.
		this.helpFrame.pack();
		this.helpFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
