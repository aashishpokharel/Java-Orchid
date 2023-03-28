package SwingIntro;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.*;

import javax.swing.*;

public class MainForm extends JFrame{
	/* Menu Format
	 * Record Operation |   Reports   | Help
	 * ----------------------------------------
	 *  Add New record  | Individual  | About
	 *  Modify
	 *  Delete
	 *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setDefaultLookAndFeelDecorated(true);
		new MainForm();
	}
	JMenuBar mb;
	JMenu mnuro, mnure, mnuhelp;
	JMenuItem miedit, miadd, midel, miexit;
	JMenuItem miindv, miall;
	JMenuItem miabt;
	JLabel lbluser, lblpass;
	JTextField txtuser; 
	JTextField txtpass;
	JButton btnlogin, btnnew;
	
	PreparedStatement pmstmt;
	ResultSet rs;
	ConStr conn;
	
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
		
		
		// Items to add for database
		
		
		conn = new ConStr();
		// Labels
		
		lbluser = new JLabel("Username");
		lblpass = new JLabel("Password");
		// Text 
		txtuser = new JTextField();
		txtpass = new JTextField();
		// button
		btnlogin = new JButton("Save");
		btnnew = new JButton("create User");
		
		// display the data in GUI/frame
		add(lbluser);
		add(txtuser);
		add(lblpass);
		add(txtpass);
		add(btnlogin);
//		add(btnnew);
//		btnlogin.addActionListener(this);
		// seting frame size and visibility
		setSize(400,450);
		setVisible(true);
		setTitle("Login!");
		setResizable(false);
		setLocation(400, 600); //kaha rakhne ?? (x,y)
		// <SetLayout: sets layout> <FlowLayout: Add in a flow/sequence>
		setLayout(null);
		// syntax setBounds<startx, start-y, length , height>
		lbluser.setBounds(20,50,100, 25);
		txtuser.setBounds(120,50,100, 25);
		lblpass.setBounds(20,100,100, 25);
		txtpass.setBounds(120,100,100, 25);
		btnlogin.setBounds(120, 150,100,25);
//		btnnew.setBounds(120, 200,100,25);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		String user = "Aashish";
//		String pwd = "Aashish";
//		if(user.equals(txtuser.getText().toString()) && pwd.equals(txtpass.getText().toString())) {
////			JOptionPane.showMessageDialog(null, "Hurray! Login Successful.");
//			new MainForm();
//			this.setVisible(false);
//		}else {
//			JOptionPane.showMessageDialog(null, "Oops! Login Failed.");
//		}
		// UPDATE ma COMBOBOX ma ni event halne cbox.addEventListener() => e.getSource() == cbox
		// box = getSelectedItem().toString()
		
		if(e.getSource() == btnlogin) {
//			ConStr conn = new ConStr();
			try {
				pmstmt = conn.con.prepareStatement("INSERT into STUDENT(firstname, lastname) VALUES(?,?)");
				pmstmt.setString(1, txtuser.getText());
				pmstmt.setString(2, txtpass.getText());
				rs= pmstmt.executeQuery();
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,"Login SUccess");
				}else {
					JOptionPane.showMessageDialog(null,"Login Fail");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}//catch
			
		}//if btnlogin	
		}
	
}
