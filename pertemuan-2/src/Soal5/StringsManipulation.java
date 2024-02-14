package Soal5;

import java.util.Scanner;

public class StringsManipulation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word per line: ");
		// ambil kata ke 1
		String a = input.nextLine();
		// ambil kata ke 2
		String b = input.nextLine();

		// jumlahkan panjang a dan b
		System.out.println(sumStringsLength(a, b));
		// cek lexicographically
		System.out.println(isAGreaterThanB(a, b));
		// capitalize huruf pertama
		System.out.println(capitalizeFirstLetter(a) + " " + capitalizeFirstLetter(b));

	}

	/**
	 * Method untuk menjumlahkan panjang kedua string.
	 *
	 * @param a String pertama
	 * @param b String kedua
	 * @return {integer} jumlah panjang kedua string.
	 */
	public static int sumStringsLength(String a, String b){
		return a.length() + b.length();
	}

	/**
	 * Method untuk membandingkan huruf pertama dari kedua string.
	 * <br>
	 * <br>
	 * Mengembalikan Yes/True ketika huruf pertama string pertama lebih besar dari huruf pertama string kedua.
	 *
	 * @param a String pertama
	 * @param b String kedua
	 * @return String
	 */
	public static String isAGreaterThanB(String a, String b){
		return a.charAt(0) > b.charAt(0) ? "Yes" : "No";
	}

	/**
	 * Method untuk mengubah huruf pertama pada string menjadi huruf kapital.
	 *
	 * @param word String
	 * @return String
	 */
	public static String capitalizeFirstLetter(String word){
		return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	}
}