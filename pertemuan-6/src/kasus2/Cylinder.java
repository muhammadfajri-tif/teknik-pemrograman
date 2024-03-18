package kasus2;

public class Cylinder extends Shape {
	// A cylinder is defined by a radius and height
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double area() {
		// its area (surface area) is PI*radius^2*height
		return Math.PI * this.radius * this.radius * this.height;
	}
	
	// Define the toString method in a way similar to that for the Sphere class
	@Override
	public String toString() {
		return super.toString() + " of radius " + this.radius +
							 " and height " + this.height;
	}
}
