package kasus1;

import java.util.Objects;

public class Restaurant {
	private final Product[] products;
	private static byte id = 0;
	
	public Restaurant() {
		this.products = new Product[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.products[id] = new Product(nama, harga, stok);
		// menambah (increment) agar id otomatis bertambah
		nextId();
	}
	
	public void kurangStock(String nama, int jumlah){
		for (int i = 0; i <= id; i++) {
			if (Objects.equals(products[i].getNamaMakanan(), nama)) {
				if (products[i].getStok() > 0 || (products[i].getStok() - jumlah) >= 0) {
					products[i].setStok(products[i].getStok() - jumlah);
				} else {
					System.out.println("Stok tidak dapat dikurangi lagi");
				}
				break;
			}
		}
	}
	
	public void tampilMenuMakanan() {
		for (int i = 0; i <= id; i++) {
			if (!Objects.isNull(products[i]) && !products[i].isOutOfStock())
				System.out.println(products[i].getNamaMakanan() + "[" + products[i].getStok() + "]" + "\tRp. " + products[i].getHargaMakanan());
		}
	}
	
	private static void nextId() {
		id++;
	}
	
	public static byte getId() {
		return id;
	}
}
