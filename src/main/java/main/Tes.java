package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entity.MstKaryawan;
import dao.MstKaryawanDao;

public class Tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/META-INF/spring/app-config.xml");

		MstKaryawanDao mstKaryawanDao = ctx.getBean(MstKaryawanDao.class);

		// MstKaryawan mstKaryawan = new MstKaryawan();
		// mstKaryawan.setKodeKaryawan("KR003");
		// mstKaryawan.setNamaKaryawan("coy");
		// mstKaryawan.setUsername("admin");
		// mstKaryawan.setPassword("admin");
		//
		// mstKaryawanDao.save(mstKaryawan);

		List<MstKaryawan> listKaryawan = mstKaryawanDao.findAll();

		for (MstKaryawan k : listKaryawan) {
			System.out.println("data karyawan:");
			System.out.println("Kode: " + k.getKodeKaryawan());
			System.out.println("Nama: " + k.getNamaKaryawan());
			System.out.println("Username: " + k.getUsername());
			System.out.println("Password: " + k.getPassword());

		}
	}
}
