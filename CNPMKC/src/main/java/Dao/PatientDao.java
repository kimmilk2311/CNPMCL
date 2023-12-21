package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Database.JDBCUtil;
import Model.Patient;

public class PatientDao implements DaoInterface<Patient> {
	public static PatientDao getInstance() {
		return new PatientDao();
		
	}

	@Override
	public boolean insert(Patient t) {
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "INSERT INTO Patient(IDPatient,NamePatient,Condition,Phone,AddressPatient)" + "VALUES (?,?,?,?,?)";
			PreparedStatement pst = c.prepareStatement(sql);
		    pst.setString(1, t.getIDpatient());
		    pst.setString(2, t.getNamepatient());
		    pst.setString(3, t.getConditon());
		    pst.setString(4, t.getPhone());
		    pst.setString(5, t.getAdrresspatient());
		    pst.executeUpdate();
		    JDBCUtil.closeConnection(c);		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Patient t) {
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "DELETE FROM Patient WHERE IDPatient =?";
			PreparedStatement pst = c.prepareStatement(sql);
		    pst.setString(1, t.getIDpatient());
		    pst.executeUpdate();
		    JDBCUtil.closeConnection(c);		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Patient t) {
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "UPDATE Patient SET NamePatient = ?, Condition = ?, Phone = ?, AddressPatient = ? WHERE IDPatient = ?";
			PreparedStatement pst;
			pst = c.prepareStatement(sql);
			pst.setString(1, t.getNamepatient());
		    pst.setString(2, t.getConditon());
		    pst.setString(3, t.getPhone());
		    pst.setString(4, t.getAdrresspatient());
		    pst.setString(5, t.getIDpatient());
		    int rowsUpdated = pst.executeUpdate();
	        
	        if (rowsUpdated > 0) {
	            System.out.println("Update successful!");
	        } else {
	            System.out.println("Update failed!");
	        }
	        JDBCUtil.closeConnection(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Patient> selectAll() {
		ArrayList<Patient> patient = new ArrayList<>();
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Patient";
			PreparedStatement pst = c.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String Id = rs.getString("IDPatient");
				String name = rs.getString("NamePatient");
				String con = rs.getString("Condition");
				String phone = rs.getString("Phone");
				String address = rs.getString("AddressPatient");
			    Patient pt = new Patient(Id,name,con,phone,address);
			patient.add(pt);
			}
		rs.close(); 
	        pst.close(); 
	        c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return patient;
	}
	@Override
	public Patient selectByid(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleleAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Patient> find(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PatientDao inf = new PatientDao();
		inf.selectAll();
		System.out.println(inf);
	}
		
	
	

}
