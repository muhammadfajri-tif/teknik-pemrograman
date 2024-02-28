package exercise2;

public class Shape {
	private  String color;
	private boolean filled;
	
	/**
	 * Constructs a Shape instance with default value for color and has a fill.
	 */
	public Shape() {
		color = "red";
		filled = true;
	}
	
	/**
	 * Constructs a Shape instance with the given color and fill.
	 *
	 * @param color color of the shape
	 * @param filled weather give a fill to the shape or not
	 */
	public Shape(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}
	
	/**
	 * Setter for field color
	 *
	 * @param color color of the shape
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/** Return color of the shape */
	public String getColor() {
		return color;
	}
	
	/**
	 * Setter for field filled
	 *
	 * @param filled weather give a fill to the shape or not
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/** Return fill of the shape */
	public boolean isFilled() {
		return filled;
	}
	
	/**
	 * Convert shape information to human-readable text.
	 *
	 * @return shape information
	 */
	public String toString() {
		return "A Shape with color of " + color +  " and " + (isFilled() ? "filled" : "not filled");
	}
}
