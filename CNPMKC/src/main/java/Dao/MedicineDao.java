package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.JDBCUtil;

public class MedicineDao implements DaoInterface<MedicineDao> {
	public static MedicineDao getInstance() {
		return new MedicineDao();
		
	}

	@Override
	public boolean insert(MedicineDao t) {
		try {
			Connection c = JDBCUtil.getConnection();
			String sql = "INSERT INTO Medicine (IDMedicine,NameMedicine,DoseMin,DoseMax,FrequencyMax,DayDoseMin,DayDoseMax)" + "VALUES (?,?,?,?,?,?,?)";
			PreparedStatement pst = c.prepareStatement(sql);
		    pst.setString(1, t.getIDmedicine());
		    pst.setString(2, t.getNamemedicine());
		    pst.setString(3, t.getDosemin());
		    pst.setString(4, t.getDosemax());
		    pst.setString(5, t.getFrequencymax());
		    pst.setString(6, t.getDayDosemin());
		    pst.setString(7, t.getDayDosemax());
		    pst.executeUpdate();
		    JDBCUtil.closeConnection(c);		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private String getDayDosemax() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getIDmedicine() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getFrequencymax() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDayDosemin() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getNamemedicine() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDosemin() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDosemax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(MedicineDao t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MedicineDao t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<MedicineDao> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicineDao selectByid(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleleAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<MedicineDao> find(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
