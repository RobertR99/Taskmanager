package gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
/**
 * Defines properties of the CreateGUI class.
 * @author Robert Randles - 29.03.2017
 *@version 1.0
 */
public class CreateGUI extends JPanel implements ActionListener {
	private final Action cga = new createGUIAction();
	private final Action ha = new helpAction();
	private final Action sa = new saveAction();
	private final Action gha = new goHomeAction();
	private final Action da = new deleteAction();
	private final Action ca = new cancelAction();

	private JFrame frame;

	private JButton cancel;
	private JTextField dueDate;
	private JButton btnSave;
	private JButton btnDelete;
	private JLabel lblTitle;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
/**
 * Constructor for CreateGUI defines some properties and all of it's elements
 */
	public CreateGUI() {
		setLayout(null);

		// Buttons
		cancel = new JButton("Cancel");
		cancel.setBounds(1348, 838, 106, 38);
		ca.putValue(Action.ACTION_COMMAND_KEY, "cancel");
		cancel.setAction(ca);
		this.add(cancel);

		dueDate = new JTextField();
		dueDate.setBounds(280, 46, 400, 55);
		this.add(dueDate);

		btnSave = new JButton("Save");
		btnSave.setBounds(1484, 838, 106, 38);
		sa.putValue(Action.ACTION_COMMAND_KEY, "save");
		btnSave.setAction(sa);
		add(btnSave);

		btnDelete = new JButton("Delete");
		btnDelete.setBounds(1484, 36, 106, 38);
		da.putValue(Action.ACTION_COMMAND_KEY, "delete");
		btnDelete.setAction(da);
		add(btnDelete);

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
		gha.putValue(Action.ACTION_COMMAND_KEY, "home");
		mHome.setAction(gha);
		mnHome.add(mHome);
	}
/**
 * defines all the properties for the action that opens a new CreatGUI window
 * @author Robert Randles
 *
 */
	private class createGUIAction extends AbstractAction {
		public createGUIAction() {
			putValue(NAME, "create Task");
			putValue(SHORT_DESCRIPTION, "It handles all actions of the class.");
		}
/**
 * creates a new Object of CreateGUI and displays it
 */
		public void actionPerformed(ActionEvent e) {
			// if (e.getActionCommand().equals("create")) {
			// open create Task window.
			CreateGUI cg = new CreateGUI();
			cg.createAndShowGUI();
			// }
		}
	}
/**
 * defines all the properties for the action that opens the helpGUI window
 * @author Robert Randles
 *
 */
	private class helpAction extends AbstractAction {
		public helpAction() {
			putValue(NAME, "Help");
			putValue(SHORT_DESCRIPTION, "Opens the Help GUI.");
		}
/**
 * creates a new object of the HelpGUI and displays it
 */
		public void actionPerformed(ActionEvent e) {
			// if (e.getActionCommand().equals("help")) {
			// open the Help Window
			helpGUI hg = new helpGUI();
			hg.createAndShowGUI();
			// }
		}
	}
	/**
	 * defines all the properties for the action that cancels the process
	 * @author Robert Randles
	 *
	 */
	private class cancelAction extends AbstractAction {
		public cancelAction() {
			putValue(NAME, "Cancel");
			putValue(SHORT_DESCRIPTION, "Cancels the current action and goes to Home.");
		}
/**
 * closes the CreateGUI frame and resumes the Main frame
 */
		public void actionPerformed(ActionEvent e) {
			// if (e.getActionCommand().equals("Cancel")) {
			// maybe do some logic to cancel
			frame.dispose();
			// }
		}
	}
/**
 * defines all the properties for the action that saves the Task
 * @author Robert Randles
 *
 */
	private class saveAction extends AbstractAction {
		public saveAction() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Saves changes / new entry to DB.");
		}
		/**
		 * Saves the Task, closes the CreateGUI frame and resumes the Main frame
		 */
		public void actionPerformed(ActionEvent e) {
			// if (e.getActionCommand().equals("Save")) {
			// if(Entries.contains(Task.getTitle()))
			// {
			// update entries(title, phase, creationDate, dueDate);
			// }
			// else{
			// insert task into entries;
			// }
			//
			// save into db
			frame.dispose();
			// }
		}
	}
	/**
	 * defines the properties of the action that resumes to the main window
	 */
	private class goHomeAction extends AbstractAction {
		public goHomeAction() {
			putValue(NAME, "Home");
			putValue(SHORT_DESCRIPTION, "Goes to Home.");
		}
/**
 * closes the current Frame and resumes to Main 
 */
		public void actionPerformed(ActionEvent e) {
			// if (e.getActionCommand().equals("Home")) {
			frame.dispose();
			// }
		}
	}
/**
 *defines the properties of the action that deletes a Task
 */
	private class deleteAction extends AbstractAction {
		public deleteAction() {
			putValue(NAME, "Delete");
			putValue(SHORT_DESCRIPTION, "Deletes the entry from DB.");
		}
/**
 * deletes a task and closes the window after
 */
		public void actionPerformed(ActionEvent e) {
			// if (e.getActionCommand().equals("Delete")) {
			// delete entry from DB. delete task from tasks where title =
			// task.getTitle();
			frame.dispose();
			// }
		}
	}
	/**
	 * does general settings for the GUI and makes it's elements visible
	 */
	public void createAndShowGUI() {
		// Create and set up the window.
		this.frame = new JFrame("Taskmanager - Create new Task");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add content to the window.
		frame.getContentPane().add(this, BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent close) {

	}
}
