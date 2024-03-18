package kasus2;

public class Rectangle extends Shape {
	// A rectangle is defined by its length and width
	private double length;
	private  double width;
	
	public Rectangle(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		// its area is length times width
		return this.length * this.width;
	}
	
	// Define the toString method in a way similar to that for the Sphere class
	@Override
	public String toString() {
		return super.toString() + " of length " + this.length +
				       " and width " + this.width;
	}
}
