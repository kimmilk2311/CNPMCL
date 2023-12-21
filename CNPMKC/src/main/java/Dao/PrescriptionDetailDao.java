package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.Patient;
import Model.PrescriptionDetail;

public class PrescriptionDetailDao implements DaoInterface<PrescriptionDetail> {
	public static PrescriptionDetailDao getInstance() {
		return new PrescriptionDetailDao();
		
	}
	@Override
	public boolean insert(PrescriptionDetail t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(PrescriptionDetail t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PrescriptionDetail t) {
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "UPDATE PrescriptionDetail SET  , Dose = ? , Frequency = ? , Quanitity = ? ";
			PreparedStatement pst;
			pst = c.prepareStatement(sql);
			pst.setString(1, t.getDose());
		    pst.setString(2, t.getFrequency());
		    pst.setString(3, t.getQuantity());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<PrescriptionDetail> selectAll() {
		ArrayList<PrescriptionDetail> prescriptionDetail = new ArrayList<>();
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "SELECT * FROM PrescriptionDetail";
			PreparedStatement pst = c.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String idPD = rs.getString("IDPrescriptionDetail");
				String idPR = rs.getString("IDPrescription");
				String idMe = rs.getString("IDMedicine");
				String dose = rs.getString("Dose");
				String frequency = rs.getString("Frequency");
				String quantity = rs.getString("Quantity");
				PrescriptionDetail prd = new PrescriptionDetail(idPD,idPR,idMe,dose,frequency,quantity);
			    prescriptionDetail.add(prd);
			}
		    rs.close(); 
	        pst.close(); 
	        c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prescriptionDetail;
	}

	@Override
	public PrescriptionDetail selectByid(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleleAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<PrescriptionDetail> find(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
