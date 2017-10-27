package Entity;

public class TrHeaderPenjualan {
	private String noNota;
	private String tanggalTransaksi;
	private Integer hargaTotal;
	private Integer globalDiskon;
	private MstCustomer customerId;
	private MstKaryawan karyawanId;
	
	public String getNoNota() {
		return noNota;
	}
	public void setNoNota(String noNota) {
		this.noNota = noNota;
	}
	public String getTanggalTransaksi() {
		return tanggalTransaksi;
	}
	public void setTanggalTransaksi(String tanggalTransaksi) {
		this.tanggalTransaksi = tanggalTransaksi;
	}
	public Integer getHargaTotal() {
		return hargaTotal;
	}
	public void setHargaTotal(Integer hargaTotal) {
		this.hargaTotal = hargaTotal;
	}
	public Integer getGlobalDiskon() {
		return globalDiskon;
	}
	public void setGlobalDiskon(Integer globalDiskon) {
		this.globalDiskon = globalDiskon;
	}
	public MstCustomer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(MstCustomer customerId) {
		this.customerId = customerId;
	}
	public MstKaryawan getKaryawanId() {
		return karyawanId;
	}
	public void setKaryawanId(MstKaryawan karyawanId) {
		this.karyawanId = karyawanId;
	}
	
	
}
