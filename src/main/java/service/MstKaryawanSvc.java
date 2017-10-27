package service;

import java.util.List;

import Entity.MstKaryawan;

public interface MstKaryawanSvc {
	
	public List<MstKaryawan> findAllData();
	public void save(MstKaryawan mstKaryawan);
	public void update(MstKaryawan mstKaryawan);
	public void delete(String kodeKaryawan);
	public MstKaryawan findOne(String kodeKaryawan);
	public MstKaryawan login(String username, String password);
}
