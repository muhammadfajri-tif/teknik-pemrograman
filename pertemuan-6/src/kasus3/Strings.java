package kasus3;

import java.util.Scanner;

/**
 * Write a program Strings.java, similar to Numbers.java, that reads in an array of String objects and sorts them.
 */
public class Strings {
	// ----------------------------------------------------------------
	// Reads in an array of Strings, sorts them,
	// then prints them in sorted order.
	// ----------------------------------------------------------------
	public static void main(String[] args) {
		String[] stringList;
		int size;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many strings do you want to sort? ");
		size = scan.nextInt();
		stringList = new String[size];
		
		System.out.println("\nEnter the words or strings...");
		for (int i = 0; i < size; i++)
			stringList[i] = scan.nextLine();
		
		Sorting.insertionSort(stringList);
		
		System.out.println("\nYour strings in sorted oreder...");
		for (int i = 0; i < size; i++)
			System.out.print(stringList[i] + " ");
		System.out.println();
		
		scan.close();
	}
}
