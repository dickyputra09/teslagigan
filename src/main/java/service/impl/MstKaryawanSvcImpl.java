package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MstKaryawanDao;
import Entity.MstKaryawan;
import service.MstKaryawanSvc;

@Service("mstKaryawanSvc")
public class MstKaryawanSvcImpl implements MstKaryawanSvc {

	@Autowired
	private MstKaryawanDao mstKaryawanDao;
	
	@Override
	public List<MstKaryawan> findAllData() {
		// TODO Auto-generated method stub
		return mstKaryawanDao.findAll();
	}

	@Override
	public void save(MstKaryawan mstKaryawan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MstKaryawan mstKaryawan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String kodeKaryawan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MstKaryawan findOne(String kodeKaryawan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MstKaryawan login(String username, String password) {
		// TODO Auto-generated method stub
		
		return mstKaryawanDao.findByUsernameAndPassword(username, password);
	}

}
