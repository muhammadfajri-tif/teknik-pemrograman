package exercise2;

public class Circle extends Shape {
	private double radius;
	
	/**
	 * Constructs a Circle instance with default value for radius, color and has a fill.
	 */
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	/**
	 * Constructs a Circle instance with the given radius and default color and has a fill.
	 *
	 * @param radius radius of the circle
	 */
	public Circle(double radius) {
		super();
		setRadius(radius);
	}
	
	/**
	 * Constructs a Circle instance with the given radius, color and fill.
	 *
	 * @param radius radius of the circle
	 * @param color color of the shape circle
	 * @param fill fill of the shape
	 */
	public Circle(double radius, String color, boolean fill) {
		setRadius(radius);
		setColor(color);
		setFilled(fill);
	}
	
	/**
	 * Setter for field radius.
	 *
	 * @param radius radius of the circle
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Returns the radius */
	public double getRadius() {
		return radius;
	}
	
	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	/** Returns the perimeter of this Circle instance */
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	/**
	 * Convert circle information to human-readable text.
	 *
	 * @return circle information
	 */
	@Override
	public String toString() {
		return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
	}
}
