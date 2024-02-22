package kasus2;

import java.util.Objects;
import java.util.Scanner;

public class Utama {
	public static final int MAX_PRODUK = 10;
	private static Produk[] listMenu;
	
	/**
	 * Method untuk menginisialisasi item makanan yang dapat dipesan.
	 */
	private static void initializeProduk(){
		listMenu = new Produk[MAX_PRODUK];
		
		listMenu[0] = new Produk("Batagor", 5_000, 99);
		listMenu[1] = new Produk("Roti Bakar", 12_000, 99);
		listMenu[2] = new Produk("Indomie+Telor", 10_000, 99);
		listMenu[3] = new Produk("Kwetiaw", 12_000, 99);
		listMenu[4] = new Produk("Nasi Goreng", 12_000, 99);
		listMenu[5] = new Produk("Air Mineral", 3_000, 99);
		listMenu[6] = new Produk("Teh Manis", 4_000, 99);
		listMenu[7] = new Produk("Jus Alpukat", 8_000, 99);
		listMenu[8] = new Produk("Teh Botol", 5_000, 99);
		listMenu[9] = new Produk("Kopi", 3_000, 99);
	}
	
	public static void main(String[] args) {
		initializeProduk();
		tampilMenuPesanan();
		
		Penjualan[] pesanan = new Penjualan[MAX_PRODUK];
		tambahPesanan(pesanan);
		tampilPesanan(pesanan);
	}
	
	/**
	 * Method untuk menampilkan menu produk yang tersedia dan dapat dipesan.
	 */
	public static void tampilMenuPesanan(){
		System.out.println("Daftar Menu Makanan");
		System.out.println("=======================");
		for (int i = 0; i < listMenu.length; i++) {
			System.out.printf("%-2d. %-15s = Rp %-5d%n", i+1, listMenu[i].getNamaProduk(), listMenu[i].getHarga());
		}
	}
	
	/**
	 * Method untuk menambah pesanan berdasarkan user input.
	 * @param pesanan daftar pesanan
	 */
	public static void tambahPesanan(Penjualan[] pesanan) {
		Scanner input = new Scanner(System.in);
		int kodeProduk;
		int qty;
		String multiProduk;
		boolean multiProdukStatus;
		
		int i = 0;
		do {
			multiProdukStatus = false;
			
			// Pemilihan produk yang tersedia akan ditambahkan kedalam pesanan
			System.out.println("\nPilih Produk yang Mau di Pesan: ");
			kodeProduk = input.nextInt();
			while (kodeProduk < 0 || kodeProduk > MAX_PRODUK){
				System.out.println("[WARN] Produk tidak ditemukan!");
				System.out.println("Pilih Produk yang Mau di Pesan: ");
				kodeProduk = input.nextInt();
			}
			
			// Pengisian jumlah produk yang akan dipesan
			System.out.println("Masukan jumlah item: ");
			qty = input.nextInt();
			while (qty <= 0){
				System.out.println("[ERR] jumlah tidak valid!");
				System.out.println("Masukan jumlah item: ");
				qty = input.nextInt();
			}
			
			// Pengecekan untuk menambah produk lain kedalam pesanan
			System.out.println("Pesan produk lain? [Y/n] ");
			multiProduk = input.next();
			if (multiProduk.equals("y") || multiProduk.equals("Y"))
				multiProdukStatus = true;
			
			// tambahkan pesanan ke array of objek penjualan
			pesanan[i] = new Penjualan(listMenu[kodeProduk-1].getNamaProduk(), listMenu[kodeProduk-1].getHarga(), qty);
			i++;
		}while (i < pesanan.length && multiProdukStatus);
	}
	
	/**
	 * Method untuk menampilkan produk yang telah dipesan beserta total bayar.
	 *
	 * @param pesanan daftar pesanan
	 */
	public static void tampilPesanan(Penjualan[] pesanan){
		int totalBayar = 0;
		
		System.out.println("\t\t\t\t\tDaftar Pesanan");
		System.out.println("====================================");
		
		for (Penjualan item : pesanan){
			if (!Objects.isNull(item)){
				item.tampilPesanan();
				totalBayar += item.getHargaTotal();
			}
		}
		
		System.out.println("====================================");
		System.out.println("Total Bayar\t\t\t\t\t = Rp " + totalBayar);
	}
	
}
