package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Entity.MstKaryawan;
import dao.MstKaryawanDao;

@Repository
public class MstKaryawanDaoImpl implements MstKaryawanDao {

	@Autowired
	private DataSource dataSource;

	@Override
	public void save(MstKaryawan mstKaryawan) {
		// TODO Auto-generated method stub
		String query = "insert into MST_KARYAWAN "
				+ "(KODE_KARYAWAN, NAMA_KARYAWAN, USERNAME, PASSWORD)"
				+ "values(?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, mstKaryawan.getKodeKaryawan());
			ps.setString(2, mstKaryawan.getNamaKaryawan());
			ps.setString(3, mstKaryawan.getUsername());
			ps.setString(4, mstKaryawan.getPassword());

			int out = ps.executeUpdate();
			if (out != 0) {
				System.out.println("sukses");
			} else {
				System.out.println("failed");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(MstKaryawan mstKaryawan) {
		// TODO Auto-generated method stub
		String query = "update MST_KARYAWAN "
				+ "set NAMA_KARYAWAN=?,USERNAME=?,PASSWORD=? "
				+ "where KODE_KARYAWAN =? ";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, mstKaryawan.getNamaKaryawan());
			ps.setString(2, mstKaryawan.getUsername());
			ps.setString(3, mstKaryawan.getPassword());
			ps.setString(4, mstKaryawan.getKodeKaryawan());

			int out = ps.executeUpdate();
			if (out != 0) {
				System.out.println("update sukses");
			} else {
				System.out.println("update gagal");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	@Override
	public void delete(String kodeKaryawan) {
		// TODO Auto-generated method stub
		String query = "delete from MST_KARYAWAN where KODE_KARYAWAN=?";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, kodeKaryawan);
			
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("karyawan deleted with id = " + kodeKaryawan);
			}
			else {
				System.out.println("No karyawan found with id = " + kodeKaryawan);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<MstKaryawan> findAll() {
		// TODO Auto-generated method stub
		String query = "select KODE_KARYAWAN, NAMA_KARYAWAN, USERNAME, PASSWORD from MST_KARYAWAN";
		List<MstKaryawan> listKaryawan = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				MstKaryawan mstKaryawan = new MstKaryawan();
				mstKaryawan.setKodeKaryawan(rs.getString("KODE_KARYAWAN"));
				mstKaryawan.setNamaKaryawan(rs.getString("NAMA_KARYAWAN"));
				mstKaryawan.setUsername(rs.getString("USERNAME"));
				mstKaryawan.setPassword(rs.getString("PASSWORD"));
				listKaryawan.add(mstKaryawan);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return listKaryawan;
	}

	@Override
	public MstKaryawan findOne(String kodeKaryawan) {
		// TODO Auto-generated method stub
		String query = "select * from MST_KARYAWAN where KODE_KARYAWAN = '"+kodeKaryawan+"'";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MstKaryawan mstKaryawan	= new MstKaryawan();
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				mstKaryawan.setKodeKaryawan(rs.getString("KODE_KARYAWAN"));
				mstKaryawan.setNamaKaryawan(rs.getString("NAMA_KARYAWAN"));
				mstKaryawan.setUsername(rs.getString("USERNAME"));
				mstKaryawan.setPassword(rs.getString("PASSWORD"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return mstKaryawan;
	}

	@Override
	public MstKaryawan findByUsernameAndPassword(String username,
			String password) {
		// TODO Auto-generated method stub
		String query = "select * from MST_KARYAWAN where USERNAME = '"+username+"'and PASSWORD = '"+password+"'";
		Connection con = null;
		PreparedStatement ps = null;
		MstKaryawan mstKaryawan = new MstKaryawan();
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				mstKaryawan.setKodeKaryawan(rs.getString("KODE_KARYAWAN"));
				mstKaryawan.setKodeKaryawan(rs.getString("NAMA_KARYAWAN"));
				mstKaryawan.setKodeKaryawan(rs.getString("USERNAME"));
				mstKaryawan.setKodeKaryawan(rs.getString("PASSWORD"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		return mstKaryawan;
	}

}
