package exercise1;

public class Circle {
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;
	
	// Constructor
	/**
	 * Constructs a Circle instance with default value for radius and color
	 */
	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}
	
	/**
	 * Constructs a Circle instance with the given radius and default color.
	 */
	public Circle(double r) { // 2nd constructor
		this.radius = r;
		color = "red";
	}
	
	/**
	 * Task 1.1
	 * <br>
	 * Constructs a Circle instance with the given radius and color.
	 */
	public Circle(double r, String c) {
		setRadius(r);
		setColor(c);
	}
	
	/**
	 * self-descriptive string of this instance in the form of
	 * 	 Circle[radius=?,color=?]
	 *
	 * @return circle information
	 */
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
	
	/**
	 * Setter for field radius
	 *
	 * @param radius radius of circle
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Returns the radius */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Setter for field color.
	 * <br>
	 * Task 1.1
	 *
	 * @param color circle color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	/** Returns the color this Circle instance */
	public String getColor() {
		return color;
	}
	
	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
