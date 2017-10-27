package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MstKotaDao;
import Entity.MstKota;

public class MainKota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/app-config.xml");

		MstKotaDao mstKotaDao = ctx.getBean(MstKotaDao.class);
		List<MstKota> listKota = mstKotaDao.findAll();

		for (MstKota mk : listKota) {
			System.out.println("data kota:");
			System.out.println("Kode kota: " + mk.getKodeKota());
			System.out.println("Nama kota: " + mk.getNamaKota());
			System.out.println("Kode provinsi: "
					+ mk.getMstProvinsi().getNamaProvinsi());

		}
	}

}
