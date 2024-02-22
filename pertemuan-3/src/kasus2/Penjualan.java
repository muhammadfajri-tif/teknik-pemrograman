package kasus2;

public class Penjualan {
	private String namaProduk;
	private int qty;
	private int hargaTotal;
	
	public Penjualan(String namaProduk, int hargaSatuan, int qty) {
		setNamaProduk(namaProduk);
		setQty(qty);
		setHargaTotal(hargaSatuan);
	}
	
	public void tampilPesanan() {
		System.out.printf("[x%d] %-15s = Rp %-5d%n", getQty(), getNamaProduk(), getHargaTotal());
	}
	
	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}
	
	public String getNamaProduk() {
		return namaProduk;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setHargaTotal(int hargaSatuan) {
		this.hargaTotal = this.qty * hargaSatuan;
	}
	
	public int getHargaTotal() {
		return hargaTotal;
	}
}
