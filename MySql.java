/**
 * 
 */
/**
 * @author Pamela Anang
 * @author Jefferson Welbeck
 * @author Rahul Srinivas
 * @author Albert Hodo
 */
package javaconnector;

import java.sql.*;

public class MySql{
	public static void main(String []args) {
		String localhost = "jdbc:mysql://localhost:3306/JavaPro?";
		String username = "root";
		String password = "God+R";
		
		Connection data = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			data = DriverManager.getConnection(localhost, username, password);
					
			if (data != null) {
				System.out.println("Finished Connecting");
			}
		}
		catch(Exception e) {
			System.out.println("unable to connect");
			System.out.println(e);
			
		}
		
	}
}