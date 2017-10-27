package Entity;

public class MstCustomer {
	private String CustomerId;
	private String namaCustomer;
	private String alamatCustomer;
	private String jenisKelamin;
	private String emailCustomer;
	private MstKota kotaId;
	
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getNamaCustomer() {
		return namaCustomer;
	}
	public void setNamaCustomer(String namaCustomer) {
		this.namaCustomer = namaCustomer;
	}
	public String getAlamatCustomer() {
		return alamatCustomer;
	}
	public void setAlamatCustomer(String alamatCustomer) {
		this.alamatCustomer = alamatCustomer;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getEmailCustomer() {
		return emailCustomer;
	}
	public void setEmailCustomer(String emailCustomer) {
		this.emailCustomer = emailCustomer;
	}
	public MstKota getKotaId() {
		return kotaId;
	}
	public void setKotaId(MstKota kotaId) {
		this.kotaId = kotaId;
	}
	
	
	
}
