package kasus3;

// ******************************************************************
// WeeklySales.java
//
// Sorts the Sales staff in descending oreder by sales.
// ******************************************************************

import java.util.Scanner;

public class WeeklySales {
	public static void main(String[] args) {
		// Salesperson[] salesStaff = new Salesperson[10];
		
		// salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
		// salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
		// salesStaff[2] = new Salesperson("James", "Jones", 3000);
		// salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
		// salesStaff[4] = new Salesperson("Don", "Trump", 1570);
		// salesStaff[5] = new Salesperson("Jane", "Black", 3000);
		// salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
		// salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
		// salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
		// salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
		
		Salesperson[] salesStaff;
		int size;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("\nHow many employee (sales person) do you want to sort? ");
		size = scan.nextInt();
		salesStaff = new Salesperson[size];

		for (int i = 0; i < size; i++) {
			System.out.println("# Employee (sales person) No. " + (i+1));
			scan.nextLine();

			// first name
			System.out.println("Enter the first name...");
			String first = scan.nextLine();

			// last name
			System.out.println("Enter the last name...");
			String last = scan.nextLine();

			// total sales
			System.out.println("Enter total sales: ");
			int totalSales = scan.nextInt();

			// assign to object
			salesStaff[i] = new Salesperson(first, last, totalSales);
		}

		// sort
		Sorting.insertionSort(salesStaff);
		
		// print
		System.out.println("\nRanking of Sales for the Week\n");
		for (Salesperson s : salesStaff)
			System.out.println(s);
		
		scan.close();
	}
}
