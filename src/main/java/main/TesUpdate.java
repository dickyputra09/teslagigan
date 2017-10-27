package main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entity.MstKaryawan;
import dao.MstKaryawanDao;

public class TesUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/META-INF/spring/app-config.xml");

		MstKaryawanDao mstKaryawanDao = ctx.getBean(MstKaryawanDao.class);
		MstKaryawan mstKaryawan = new MstKaryawan();
		mstKaryawan.setKodeKaryawan("KR003");
		mstKaryawan.setNamaKaryawan("cobra");
		mstKaryawan.setUsername("sa");
		mstKaryawan.setPassword("iglo");
		

		mstKaryawanDao.update(mstKaryawan);

	}

}
