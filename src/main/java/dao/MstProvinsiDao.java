package dao;

import java.util.List;


import Entity.MstProvinsi;

public interface MstProvinsiDao {
	public void save(MstProvinsiDao mstProvinsiDao);
	public void update(MstProvinsiDao mstProvinsiDao);
	public void delete(String kodeProvinsi);
	public List<MstProvinsi> findAll();
	public MstProvinsi findOne(String kodeProvinsi);
}
