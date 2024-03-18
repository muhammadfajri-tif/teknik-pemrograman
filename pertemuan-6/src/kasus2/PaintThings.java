package kasus2;

// *********************************************************
// PaintThings.java
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
// *********************************************************

import java.text.DecimalFormat;

public class PaintThings {
	// ------------------------------------------
	// Creates some shapes anf a paint object
	// and prints the amount of paint needed
	// to paint each shape.
	// ------------------------------------------
	public static void main(String[] args) throws Exception {
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		Shape[] shapes = new Shape[3];
		// Instantiate the shape object: deck to be a 20 by 35 foot rectangle
		shapes[0] = new Rectangle(20, 35);
		
		// Instantiate the shape object: big ball to be a sphere of radius 15
		shapes[1] = new Sphere(15);
		
		// Instantiate the shape object: tank to be a cylinder of radius 10 and height 30
		shapes[2] = new Cylinder(10, 30);
		
		
		// Make the appropriate method calls to assign the correct values to the three
		// amount variables.
		double deckAmount, ballAmount, taskAmount;
		
		// Instantiate the three shapes to paint
		// Compute the amount of paint needed for each shape
		deckAmount = paint.amount(shapes[0]); // deck
		ballAmount = paint.amount(shapes[1]); // big ball
		taskAmount = paint.amount(shapes[2]); // tank
		
		// Print the amount of paint for each.
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("\nNumber of gallons of paint needed...");
		System.out.println("Deck " + fmt.format(deckAmount));
		System.out.println("Big Ball " + fmt.format(ballAmount));
		System.out.println("Tank " + fmt.format(taskAmount));
	}
}
