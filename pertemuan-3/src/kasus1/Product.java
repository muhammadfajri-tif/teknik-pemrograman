package kasus1;

public class Product {
	private String namaMakanan;
	private double hargaMakanan;
	private int stok;
	
	public Product(String nama, double harga, int stok){
		setNamaMakanan(nama);
		setHargaMakanan(harga);
		setStok(stok);
	}
	
	public boolean isOutOfStock() {
		return getStok() == 0;
	}
	
	public void setNamaMakanan(String namaMakanan) {
		this.namaMakanan = namaMakanan;
	}
	
	public String getNamaMakanan() {
		return namaMakanan;
	}
	
	public void setHargaMakanan(double hargaMakanan) {
		this.hargaMakanan = hargaMakanan;
	}
	
	public double getHargaMakanan() {
		return hargaMakanan;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public int getStok() {
		return stok;
	}
}
