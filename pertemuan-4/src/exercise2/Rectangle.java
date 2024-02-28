package exercise2;

public class Rectangle extends Shape {
	private double width;
	private  double length;
	
	
	/**
	 * Constructs a Rectangle instance with default value for width, length, color and has a fill.
	 */
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	
	/**
	 * Constructs a Rectangle instance with the given width, length, color and fill.
	 *
	 * @param width width of the rectangle
	 * @param length length of the rectangle
	 */
	public Rectangle(double width, double length) {
		super();
		setWidth(width);
		setLength(length);
	}
	
	/**
	 * Constructs a Rectangle instance with the given width, length, color and fill.
	 *
	 * @param width width of the rectangle
	 * @param length length of the rectangle
	 * @param color color of the rectangle
	 * @param fill fill of the shape rectangle
	 */
	public Rectangle(double width, double length, String color, boolean fill) {
		super(color, fill);
		setWidth(width);
		setLength(length);
	}
	
	/**
	 * Setter for field width
	 *
	 * @param width width of the rectangle
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Returns the width */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Setter for field length
	 *
	 * @param length length of the rectangle
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/** Returns the length */
	public double getLength() {
		return length;
	}
	
	/** Returns the area of this Rectangle instance */
	public double getArea() {
		return length*width;
	}
	
	/** Returns the perimeter of this Rectangle instance */
	public double getPerimeter() {
		return  2*(length + width);
	}
	
	/**
	 * Convert Rectangle information to human-readable text.
	 *
	 * @return rectangle information
	 */
	@Override
	public String toString() {
		return "A Rectangle with width=" + getWidth() + " and length=" + getLength()
				       + ", which is a subclass of " + super.toString();
	}
}
