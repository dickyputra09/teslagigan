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




import Entity.MstKota;
import Entity.MstProvinsi;
import dao.MstKotaDao;
import dao.MstProvinsiDao;

@Repository
public class MstKotaDaoImpl implements MstKotaDao {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private MstProvinsiDao mstProvinsiDao;

	@Override
	public void save(MstKotaDao mstKotaDao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(MstKotaDao mstKotaDao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String kodeKota) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MstKota> findAll() {
		// TODO Auto-generated method stub
		String query =  "select KODE_KOTA, NAMA_KOTA, KODE_PROVINSI from MST_KOTA";
		List<MstKota> listKota = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			String kode = null;
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
		
		MstKota mstKota = new MstKota();
		MstProvinsi mstProvinsi = new MstProvinsi();
		System.out.println("Kode kota : " + rs.getString("KODE_KOTA"));
		System.out.println("Nama kota : " + rs.getString("NAMA_KOTA"));
		System.out.println("Kode provinsi : " + rs.getString("KODE_PROVINSI"));

		mstKota.setKodeKota(rs.getString("KODE_KOTA"));
		mstKota.setNamaKota(rs.getString("NAMA_KOTA"));
		
		kode = (rs.getString("KODE_PROVINSI"));
		mstProvinsi = mstProvinsiDao.findOne(kode);
		mstKota.setMstProvinsi(mstProvinsi);
		listKota.add(mstKota);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		
		return listKota;
	}

	@Override
	public MstKota findOne(String kodeKota) {
		// TODO Auto-generated method stubString query =
		
		String query = "select * from MST_KOTA where KODE_KOTA = '"+kodeKota+"'";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MstKota mstKota = new MstKota();
		MstProvinsi mstProvinsi	= new MstProvinsi();
		
		try {
			
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				mstKota.setKodeKota(rs.getString("KODE_KOTA"));
				mstKota.setNamaKota(rs.getString("NAMA_KOTA"));
				mstProvinsi.setProvinsiId(rs.getString("KODE_PROVINSI"));
				
				
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
		return mstKota;
	}

}
