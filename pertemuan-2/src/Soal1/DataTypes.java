package Soal1;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		// max total number
		Scanner maxInput = new Scanner(System.in);
		System.out.println("Enter max value: ");
		int max = maxInput.nextInt();


		// input actual number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		// input 1 by 1
		for (int i = 0; i < max; i++) {
			try {
				long data = input.nextLong();
				checkIntegerTypes(data);
			} catch (Exception e) {
				// ambil error message; Pecah error message menjadi array berdasarkan spasi; ambil index/kata terakhir
				String[] errInput = e.toString().split("\\s");
				System.out.println(errInput[errInput.length - 1] + " can't be fitted anywhere.");
			}
		}

	}

	/**
	 * Method untuk mengecek jenis tipe data dan menampilkan pada console/terminal.
	 *
	 * @param data nilai yang dicek
	 */
	public static void checkIntegerTypes(long data){
		System.out.println(data + " can be fitted in:");
		if (data >= Byte.MIN_VALUE && data <= Byte.MAX_VALUE) {
			System.out.println("\t* byte");
		}
		if (data >= Short.MIN_VALUE && data <= Short.MAX_VALUE) {
			System.out.println("\t* short");
		}
		if (data >= Integer.MIN_VALUE && data <= Short.MAX_VALUE) {
			System.out.println("\t* int");
		}
		System.out.println("\t* long");
	}

}