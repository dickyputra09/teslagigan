package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Entity.MstKaryawan;
import Entity.MstProvinsi;
import dao.MstProvinsiDao;

@Repository
public class MstProvinsiDaoImpl implements MstProvinsiDao {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public void save(MstProvinsiDao mstProvinsiDao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MstProvinsiDao mstProvinsiDao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String kodeProvinsi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MstProvinsi> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MstProvinsi findOne(String kodeProvinsi) {
		// TODO Auto-generated method stub
		String query = "select * from MST_PROVINSI where KODE_PROVINSI = '"+kodeProvinsi+"'";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MstProvinsi mstProvinsi	= new MstProvinsi();
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				mstProvinsi.setProvinsiId(rs.getString("KODE_PROVINSI"));
				mstProvinsi.setNamaProvinsi(rs.getString("NAMA_PROVINSI"));
				
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
		return mstProvinsi;
	}

}
