package SwingIntro;


//import java.awt.*;
import java.awt.event.*; // For event listening
import java.sql.*;
import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{
	JLabel lbluser, lblpass;
	JTextField txtuser; 
	JPasswordField txtpass;
	JButton btnlogin, btnnew;
	
	PreparedStatement pmstmt;
	ResultSet rs;
	ConStr conn;
	public SwingLogin() {
		conn = new ConStr();
		// Labels
		
		lbluser = new JLabel("Username");
		lblpass = new JLabel("Password");
		// Text 
		txtuser = new JTextField();
		txtpass = new JPasswordField();
		// button
		btnlogin = new JButton("Login");
		btnnew = new JButton("create User");
		
		// display the data in GUI/frame
		add(lbluser);
		add(txtuser);
		add(lblpass);
		add(txtpass);
		add(btnlogin);
		add(btnnew);
		btnlogin.addActionListener(this);
		btnnew.addActionListener(this);
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
		btnnew.setBounds(120, 200,100,25);
	}
	@Override
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
		
		
		if(e.getSource() == btnlogin) {
//			ConStr conn = new ConStr();
			try {
				pmstmt = conn.con.prepareStatement("Select * from STUDENT where firstname = ?");
				pmstmt.setString(1, txtuser.getText());
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
		if(e.getSource() == btnnew) {
			try {
				pmstmt = conn.con.prepareStatement("INSERT into STUDENT(firstname, faculty, level) values(?, ?, ?)");
				pmstmt.setString(1, txtuser.getText());
				pmstmt.setString(2, "CSIT");
				pmstmt.setString(3, "SEVEN");
				int result= pmstmt.executeUpdate();
				if(result > 0) {
					JOptionPane.showMessageDialog(null,"Creation Success");
				}else {
					JOptionPane.showMessageDialog(null,"Cration Fail");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}//catch
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setDefaultLookAndFeelDecorated(true);
		new SwingLogin();
	}
}