package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
/**Creates the Main GUI window
 * 
 * @author Robert Randles - 29.03.2017
 * @version 1.0
 */
public class MainGUI extends JPanel implements ActionListener {
	private final Action cga = new createGUIAction();
	private final Action ha = new helpAction();
	private final Action ea = new editAction();
	private final Action gha = new goHomeAction();

	private JFrame frame;
/**
 * Constructor of MainGUI. Adds all of the Elements and sets their properties
 */
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
		btnEdit1.setBounds(382, 154, 70, 23);
		add(btnEdit1);

		JButton btnEdit2 = new JButton("edit");
		ea.putValue(Action.ACTION_COMMAND_KEY, "edit");
		btnEdit2.setAction(ea);
		btnEdit2.setBounds(983, 154, 70, 23);
		add(btnEdit2);

		JButton btnEdit3 = new JButton("edit");
		ea.putValue(Action.ACTION_COMMAND_KEY, "edit");
		btnEdit3.setAction(ea);
		btnEdit3.setBounds(1544, 154, 70, 23);
		add(btnEdit3);

		JLabel lblTestprojecttestprojecttestprojecttestprojecttestproject = new JLabel(
				"TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		lblTestprojecttestprojecttestprojecttestprojecttestproject.setBounds(169, 158, 264, 19);
		add(lblTestprojecttestprojecttestprojecttestprojecttestproject);

		JLabel label = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
		label.setBounds(738, 158, 264, 19);
		add(label);

		JLabel label_1 = new JLabel("TESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECTTESTPROJECT");
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
		// JMenuItem mRefresh = new JMenuItem("Refresh");
		// mnHome.add(mRefresh);

	}
/**
 * does general settings for the GUI and makes it's elements visible
 */
	public void createAndShowGUI() {
		// Create and set up the window.
		this.frame = new JFrame("Taskmanager - Home");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Add content to the window.
		frame.getContentPane().add(new MainGUI(), BorderLayout.CENTER);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
/**
 * Defines the settings for the Action that opens the createGUI
 * @author Robert Randles
 *
 */
	private class createGUIAction extends AbstractAction {
		public createGUIAction() {
			putValue(NAME, "create Task");
			putValue(SHORT_DESCRIPTION, "It handles all actions of the class.");
		}
/**
 * Makes a new Object of CreateGUI and displays it.
 */
		public void actionPerformed(ActionEvent e) {
			// open create Task window.
			CreateGUI cg = new CreateGUI();
			cg.createAndShowGUI();
		}
	}
	/**
	 * Defines the settings for the Action that opens the helpGUI
	 * @author Robert Randles
	 *
	 */
	private class helpAction extends AbstractAction {
		public helpAction() {
			putValue(NAME, "Help");
			putValue(SHORT_DESCRIPTION, "Opens the Help GUI.");
		}
/**
 * creates a new Object of the helpGUI and displays it
 */
		public void actionPerformed(ActionEvent e) {
			// open the Help Window
			helpGUI hg = new helpGUI();
			hg.createAndShowGUI();
		}
	}
	/**
	 * Defines the settings for the Action that opens the createGUI with the Data from DB loaded into it
	 * @author Robert Randles
	 *
	 */
	private class editAction extends AbstractAction {
		public editAction() {
			putValue(NAME, "Edit");
			putValue(SHORT_DESCRIPTION, "Opens the create new Task GUI and gets Values from DB.");
		}
/**
 * creates a new Object of the CreateGUI, loads the Data from DB and displays it
 */
		public void actionPerformed(ActionEvent e) {
			CreateGUI cg = new CreateGUI();
			cg.createAndShowGUI();
			// get values out of DB and put them in the textfield
		}
	}
	/**
	 * Defines the settings for the Action that refreshes the MainGUI
	 * @author Robert Randles
	 *
	 */
	private class goHomeAction extends AbstractAction {
		public goHomeAction() {
			putValue(NAME, "Home");
			putValue(SHORT_DESCRIPTION, "Goes to Home.");
		}
/**
 * Refreshes the MainGUI
 */
		public void actionPerformed(ActionEvent e) {
			// discard changes?
			// refresh here?
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}

// TODO make first window close when opening a new one
