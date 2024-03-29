package kasus2;

// *********************************************************
// Spehere.java
//
// Represents a sphere
// *********************************************************

public class Sphere extends Shape {
	private double radius;
	
	// --------------------------------
	// Constructor: sets up the sphere.
	// --------------------------------
	public Sphere(double r) {
		super("Sphere");
		radius = r;
	}
	
	// ---------------------------------------
	// Returns the surface area of the sphere.
	// ---------------------------------------
	@Override
	public double area() {
		return 4 * Math.PI * radius * radius;
	}
	
	// --------------------------------
	// Returns the sphere as a String.
	// --------------------------------
	public String toString() {
		return super.toString() + " of radius " + radius;
	}
}
