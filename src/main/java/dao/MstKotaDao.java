package dao;

import java.util.List;

import Entity.MstKota;



public interface MstKotaDao {
	public void save(MstKotaDao mstKotaDao);
	public void update(MstKotaDao mstKotaDao);
	public void delete(String kodeKota);
	public List<MstKota> findAll();
	public MstKota findOne(String kodeKota);
}
