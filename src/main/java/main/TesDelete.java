package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entity.MstKaryawan;
import dao.MstKaryawanDao;

public class TesDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/META-INF/spring/app-config.xml");

		MstKaryawanDao mstKaryawanDao = ctx.getBean(MstKaryawanDao.class);
		

		mstKaryawanDao.delete("KR003");
		

	}

}
