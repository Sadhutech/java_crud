package studinfo;


import java.sql.*;
public class studinfo {
	static Connection con;
	public static Connection createc() {
		
		try {
			
			
			//create the Connection
			String user = "root"; //user of mysql
			String password = "Admin420$"; //password of mysql
			String url = "jdbc:mysql://localhost:3306/student_info";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}

;
