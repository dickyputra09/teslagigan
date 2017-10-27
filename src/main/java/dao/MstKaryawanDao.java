package dao;

import java.util.List;

import Entity.MstKaryawan;

public interface MstKaryawanDao {
	public void save(MstKaryawan mstKaryawan);
	public void update(MstKaryawan mstKaryawan);
	public void delete(String kodeKaryawan);
	public List<MstKaryawan> findAll();
	public MstKaryawan findOne(String kodeKaryawan);
	public MstKaryawan findByUsernameAndPassword(String username, String password);
}
