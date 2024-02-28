package exercise2;

public class Square extends Rectangle {
	/**
	 * Constructs a Square instance with default value for side, color and has a fill.
	 */
	public Square() {
		super();
	}
	
	/**
	 * Constructs a Rectangle instance with the given side and default value for color and fill.
	 *
	 * @param side length of the side of the square
	 */
	public  Square(double side) {
		super(side, side);
	}
	
	/**
	 * Constructs a Rectangle instance with the given side, color and fill.
	 *
	 * @param side length of the side of the square
	 * @param color color of the square
	 * @param fill fill of the shape square
	 */
	public Square(double side, String color, boolean fill) {
		super(side,side,color,fill);
	}
	
	/** Returns the length of the side of the square */
	public double getSide() {
		if (getWidth() != getLength())
			setSide(getLength());
		return getLength();
	}
	
	/**
	 * Setter to make width and length same
	 *
	 * @param side length of the side of the square
	 */
	public void setSide(double side) {
		setWidth(side);
	}
	
	/** Returns the area of this Square instance */
	@Override
	public double getArea() {
		return getSide()*getSide();
	}
	
	/** Returns the perimeter of this Square instance */
	@Override
	public double getPerimeter() {
		return 4 * getSide();
	}
	
	/**
	 * Convert Square information to human-readable text.
	 *
	 * @return square information
	 */
	@Override
	public String toString() {
		return "A Rectangle with side=" + getSide()
				       + ", which is a subclass of " + super.toString();
	}
}
