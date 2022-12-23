package GUI;

import java.awt.*;
import java.awt.event.*; // For event listening
import javax.swing.*;
public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
class Login extends Frame implements ActionListener{
	Label lbluser, lblpass;
	TextField txtuser, txtpass;
	Button btnlogin;
	public Login() {
		// Labels
		lbluser = new Label("Username");
		lblpass = new Label("Password");
		// Text 
		txtuser = new TextField();
		txtpass = new TextField();
		// button
		btnlogin = new Button("Login");
		
		// display the data in GUI/frame
		add(lbluser);
		add(txtuser);
		add(lblpass);
		add(txtpass);
		add(btnlogin);
		btnlogin.addActionListener(this);
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
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = "Aashish";
		String pwd = "Aashish";
		if(user.equals(txtuser.getText().toString()) && pwd.equals(txtpass.getText().toString())) {
//			JOptionPane.showMessageDialog(null, "Hurray! Login Successful.");
			new Login();
			this.setVisible(false);
		}else {
			JOptionPane.showMessageDialog(null, "Oops! Login Failed.");
		}
	}
	
}
