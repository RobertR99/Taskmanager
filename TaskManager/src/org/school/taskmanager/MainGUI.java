package org.school.taskmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class MainGUI extends JPanel implements ActionListener {
	private final Action cga = new createGUIAction();
	private final Action ha = new helpAction();
	private final Action ea = new editAction();
	private final Action sa = new saveAction();
	private final Action gha = new goHomeAction();
	private final Action da = new deleteAction();
	private final Action ca = new cancelAction();

	public MainGUI() {
		setLayout(null);
		setVisible(true);

		JLabel lblToDo = new JLabel("To Do");
		lblToDo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblToDo.setBounds(206, 30, 106, 23);
		add(lblToDo);

		JLabel lblDone = new JLabel("Done");
		lblDone.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDone.setBounds(1418, 30, 106, 23);
		add(lblDone);

		JLabel lblInProgress = new JLabel("In Progress");
		lblInProgress.setFont(new Font("Arial", Font.PLAIN, 20));
		lblInProgress.setBounds(778, 30, 106, 23);
		add(lblInProgress);

		JButton btnEdit1 = new JButton("edit");
		ea.putValue(Action.ACTION_COMMAND_KEY, "edit");
		btnEdit1.setAction(ea);
		btnEdit1.setBounds(382, 154, 51, 23);
		add(btnEdit1);

		JButton btnEdit2 = new JButton("edit");
		ea.putValue(Action.ACTION_COMMAND_KEY, "edit");
		btnEdit2.setAction(ea);
		btnEdit2.setBounds(983, 154, 51, 23);
		add(btnEdit2);

		JButton btnEdit3 = new JButton("edit");
		ea.putValue(Action.ACTION_COMMAND_KEY, "edit");
		btnEdit3.setAction(ea);
		btnEdit3.setBounds(1544, 154, 51, 23);
		add(btnEdit3);

		JLabel lblTestprojecttestprojecttestprojecttestprojecttestproject = new JLabel(
				"TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		lblTestprojecttestprojecttestprojecttestprojecttestproject.setBounds(
				169, 158, 264, 19);
		add(lblTestprojecttestprojecttestprojecttestprojecttestproject);

		JLabel label = new JLabel(
				"TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		label.setBounds(738, 158, 264, 19);
		add(label);

		JLabel label_1 = new JLabel(
				"TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		label_1.setBounds(1319, 158, 264, 19);
		add(label_1);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Tasks");
		menuBar.setBounds(0, 0, 1999, 21);
		add(menuBar);

		JMenu mnNewMenu = new JMenu("Tasks");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Create Task");
		cga.putValue(Action.ACTION_COMMAND_KEY, "create");
		mntmNewMenuItem.setAction(cga);
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mHelp = new JMenuItem("Help");
		ha.putValue(Action.ACTION_COMMAND_KEY, "help");
		mHelp.setAction(ha);
		mnHelp.add(mHelp);

		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);

		JMenuItem mHome = new JMenuItem("Home");

		mnHome.add(mHome);

	}

	public void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Taskmanager - Home");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add content to the window.
		frame.getContentPane().add(new MainGUI(), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	private class createGUIAction extends AbstractAction {
		public createGUIAction() {
			putValue(NAME, "create Task");
			putValue(SHORT_DESCRIPTION, "It handles all actions of the class.");
		}

		public void actionPerformed(ActionEvent e) {
	//		if (e.getActionCommand().equals("create")) {
				// open create Task window.
				CreateGUI cg = new CreateGUI();
				cg.createAndShowGUI();
		//	}
		}
	}

	private class helpAction extends AbstractAction {
		public helpAction() {
			putValue(NAME, "Help");
			putValue(SHORT_DESCRIPTION, "Opens the Help GUI.");
		}

		public void actionPerformed(ActionEvent e) {
		//	if (e.getActionCommand().equals("help")) {
				// open the Help Window
				helpGUI hg = new helpGUI();
				hg.createAndShowGUI();
		//	}
		}
	}

	private class editAction extends AbstractAction {
		public editAction() {
			putValue(NAME, "Edit");
			putValue(SHORT_DESCRIPTION,
					"Opens the create new Task GUI and gets Values from DB.");
		}

		public void actionPerformed(ActionEvent e) {
		//	if (e.getActionCommand().equals("edit")) {
				CreateGUI cg = new CreateGUI();
				cg.createAndShowGUI();
				// get values out of DB and put them in the textfield
		//	}
		}
	}

	private class cancelAction extends AbstractAction {
		public cancelAction() {
			putValue(NAME, "Cancel");
			putValue(SHORT_DESCRIPTION,
					"Cancels the current action and goes to Home.");
		}

		public void actionPerformed(ActionEvent e) {
	//		if (e.getActionCommand().equals("Cancel")) {
				// maybe do some logic to cancel
				MainGUI mg = new MainGUI();
				mg.createAndShowGUI();
				//frame.dispose();
		//	}
		}
	}

	private class saveAction extends AbstractAction {
		public saveAction() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Saves changes / new entry to DB.");
		}

		public void actionPerformed(ActionEvent e) {
		//	if (e.getActionCommand().equals("Save")) {
				// if(Entries.contains(Task.getTitle()))
				// {
				// update entries(title, phase, creationDate, dueDate);
				// }
				// else{
				// insert task into entries;
				// }
				//
				// save into db
				MainGUI mg = new MainGUI();
				mg.createAndShowGUI();
	//		}
		}
	}

	private class goHomeAction extends AbstractAction {
		public goHomeAction() {
			putValue(NAME, "Home");
			putValue(SHORT_DESCRIPTION, "Goes to Home.");
		}

		public void actionPerformed(ActionEvent e) {
		//	if (e.getActionCommand().equals("Home")) {
				// discard changes?
				MainGUI mg = new MainGUI();
				mg.createAndShowGUI();
	//		}
		}
	}

	private class deleteAction extends AbstractAction {
		public deleteAction() {
			putValue(NAME, "Delete");
			putValue(SHORT_DESCRIPTION, "Deletes the entry from DB.");
		}

		public void actionPerformed(ActionEvent e) {
	//		if (e.getActionCommand().equals("Delete")) {
				// delete entry from DB. delete task from tasks where title =
				// task.getTitle();
				MainGUI mg = new MainGUI();
				mg.createAndShowGUI();
	//		}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}

// TODO make first window close when opening a new one
