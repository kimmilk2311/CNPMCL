package Test;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import Database.JDBCUtil;

public class TestJDBCUntil {
	public static void main(String[] args) throws SQLException {
	    //Tao ket noi
		Connection c = JDBCUtil.getConnection();
		System.out.println(c);
try {
			//		Tao doi tuong statement
			Statement st = (Statement) c.createStatement();
			
	   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Ngat ket noi 
		JDBCUtil.closeConnection(c);
	}

}
