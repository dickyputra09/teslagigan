package Entity;

public class MstKaryawan {
	String karyawanId;
	String namaKaryawan;
	String username;
	String password;
	
	public String getKodeKaryawan() {
		return karyawanId;
	}
	public void setKodeKaryawan(String kodeKaryawan) {
		this.karyawanId = kodeKaryawan;
	}
	public String getNamaKaryawan() {
		return namaKaryawan;
	}
	public void setNamaKaryawan(String namaKaryawan) {
		this.namaKaryawan = namaKaryawan;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
