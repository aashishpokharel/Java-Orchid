package SwingIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConStr {
		/* To read info from Database 
		 * We will need 
		 * Connection class instance
		 * Statement Class instance
		 * ResultSet class instance
		 * */
		public Connection con;
		Statement stmt;
		ResultSet rs;
		public ConStr() {
		try {
//			We can use both drivers CJ one and the first one
//			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connecting 
			con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "aashish", "aashish");
			
		}catch(Exception ex) {
			System.out.print("Exception OCCURED\n");
			ex.printStackTrace();	}
		}

}
