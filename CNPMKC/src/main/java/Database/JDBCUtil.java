package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() throws SQLException {
		Connection c = null;
		
	
		try {
			// Dang ky sqlserver 
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			//Cacthongso
			String url = "jdbc:sqlserver://localhost:1433;databaseName=CKKPDL;encrypt=true;trustServerCertificate=true";
			String username = "sa";
			String password = "12345";
			//Tạo ket noi
			c = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;	
		
	}
	public static void closeConnection(Connection c) {
		try {
			if (c != null){
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
