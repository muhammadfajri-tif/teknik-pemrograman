package kasus2;

public class Produk {
	private String namaProduk;
	private int harga;
	private int qty;
	
	public Produk(String nama, int harga, int qty) {
		setNamaProduk(nama);
		setHarga(harga);
		setQty(qty);
	}
	
	public boolean isOutOfStock() {
		return getQty() == 0;
	}
	
	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}
	
	public String getNamaProduk() {
		return namaProduk;
	}
	
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getQty() {
		return qty;
	}
}
