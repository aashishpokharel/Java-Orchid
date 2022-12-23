package SwingIntro;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class MainForm extends JFrame{
	/* Menu Format
	 * Record Operation |   Reports   | Help
	 * ----------------------------------------
	 *  Add New record  | Individual  | About
	 *  Modify
	 *  Delete
	 *  */
	JMenuBar mb;
	JMenu mnuro, mnure, mnuhelp;
	JMenuItem miedit, miadd, midel, miexit;
	JMenuItem miindv, miall;
	JMenuItem miabt;
	
	public MainForm() {
		Dimension screSize = Toolkit.getDefaultToolkit().getScreenSize();
		mb = new JMenuBar();
		mnuro = new JMenu("Record Operation"); // <Record Operation
		mnure = new JMenu("Report Operation"); // Report Operation
		mnuhelp = new JMenu("Help Operation"); // Help Operation
		
		miadd = new JMenuItem("Add New Record");
		miedit = new JMenuItem("Edit Record");
		midel = new JMenuItem("Delete Record");
		miexit = new JMenuItem("Exit");
		
		miindv = new JMenuItem("Individual Report");
		miall = new JMenuItem("All Reports");
		
		miabt = new JMenuItem("About Us");

		// Setting <Menu-Bar>
		setJMenuBar(mb);
		mb.add(mnuro); // add menu to menubar
		mb.add(mnure); // add report to menubar
		mb.add(mnuhelp); // add help to menubar
		
	// Add Menu Items to menu
		// RO Operations<add>
		mnuro.add(miadd);
		mnuro.add(miedit);
		mnuro.add(midel);
		mnuro.add(miexit);
		
		//RE Operations
		mnure.add(miindv);
		mnure.add(miall);
		// help
		mnuhelp.add(miabt);
		
		
		setVisible(true);
//		setSize(600,600);
		setSize(screSize);
		
	}
	
}
