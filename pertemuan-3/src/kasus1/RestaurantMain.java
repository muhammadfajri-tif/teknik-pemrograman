package kasus1;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		System.out.println("=== Hasil yang belum dikurangi ===");
		menu.tampilMenuMakanan();
		
		menu.kurangStock("Gehu", 3);
		menu.kurangStock("Tahu", 3);
		
		System.out.println("\n\n=== Hasil setelah dikurangi ===");
		menu.tampilMenuMakanan();
		
	}
}
