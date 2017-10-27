package Entity;

public class MstKota {
	private String kotaId;
	private String namaKota;
	
	private MstProvinsi provinsiId;
	
	public String getKodeKota() {
		return kotaId;
	}
	public void setKodeKota(String kodeKota) {
		this.kotaId = kodeKota;
	}
	public String getNamaKota() {
		return namaKota;
	}
	public void setNamaKota(String namaKota) {
		this.namaKota = namaKota;
	}
	public MstProvinsi getMstProvinsi() {
		return provinsiId;
	}
	public void setMstProvinsi(MstProvinsi kodeProvinsi) {
		this.provinsiId = kodeProvinsi;
	}
	
	
}
