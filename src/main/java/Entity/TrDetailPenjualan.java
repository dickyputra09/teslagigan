package Entity;

public class TrDetailPenjualan {
	private String detailId;
	private Integer qty;
	private Integer subTotal;
	private Integer diskon;
	private Integer hargaSatuan;
	private MstBarang barangId;
	private TrHeaderPenjualan noNota;
	
	public String getDetailId() {
		return detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}
	public Integer getDiskon() {
		return diskon;
	}
	public void setDiskon(Integer diskon) {
		this.diskon = diskon;
	}
	public Integer getHargaSatuan() {
		return hargaSatuan;
	}
	public void setHargaSatuan(Integer hargaSatuan) {
		this.hargaSatuan = hargaSatuan;
	}
	public MstBarang getBarangId() {
		return barangId;
	}
	public void setBarangId(MstBarang barangId) {
		this.barangId = barangId;
	}
	public TrHeaderPenjualan getNoNota() {
		return noNota;
	}
	public void setNoNota(TrHeaderPenjualan noNota) {
		this.noNota = noNota;
	}
	
	
	
}
