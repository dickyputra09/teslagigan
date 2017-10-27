package Entity;

public class MstBarang {
	private String barangId;
	private String namaBarang;
	private int stokBarang;
	private MstSupplier supplierId;
	
	public String getKodeBarang() {
		return barangId;
	}
	public void setKodeBarang(String kodeBarang) {
		this.barangId = kodeBarang;
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	public Integer getStokBarang() {
		return stokBarang;
	}
	public void setStokBarang(Integer stokBarang) {
		this.stokBarang = stokBarang;
	}
	public MstSupplier getKodeSupplier() {
		return supplierId;
	}
	public void setKodeSupplier(MstSupplier kodeSupplier) {
		this.supplierId = kodeSupplier;
	}
	
	
}
