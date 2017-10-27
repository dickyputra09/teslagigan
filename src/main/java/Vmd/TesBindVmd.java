package Vmd;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.Messagebox;

public class TesBindVmd {
	private String nama;
	private double alas;
	private double tinggi;
	private double luas;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public double getAlas() {
		return alas;
	}
	public void setAlas(double alas) {
		this.alas = alas;
	}
	public double getTinggi() {
		return tinggi;
	}
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	public double getLuas() {
		return luas;
	}
	public void setLuas(double luas) {
		this.luas = luas;
	}
	
	@Command("hitung")
	@NotifyChange("luas")
	public void Hitungluas() {
		// TODO Auto-generated method stub
		luas = 0.5 * alas * tinggi;
		
		System.out.println("luas adalah : " + luas);
		Messagebox.show("luas segitiga : " + luas);
	}
	
	@Command("cliks")
	public void klik() {
		// TODO Auto-generated method stub
		System.out.println("klik di eksekusi" + nama);
		
		Messagebox.show("anda menuliskan kata" + nama);
	}
}
