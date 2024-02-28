package exercise1;

public class Cylinder extends Circle{
	private double height; // private variable
	
	/**
	 * Constructor with default color, radius and height
	 */
	public Cylinder() {
		super(); // call superclass no-arg constructor Circle()
		this.height = 1.0;
	}
	
	/**
	 * Constructor with default radius, color but given height
	 *
	 * @param height height of cylinder
	 */
	public Cylinder(double height) {
		super(); // call superclass no-arg constructor Circle()
		setHeight(height);
	}
	
	/**
	 * Constructor with default color, but given radius, height
	 *
	 * @param radius radius of cylinder
	 * @param height height of cylinder
	 */
	public Cylinder(double radius, double height) {
		super(radius, "black"); // call superclass constructor Circle(r,c)
		this.height = height;
	}
	
	/**
	 * Task 1.2
	 * <br>
	 * Calculate area of cylinder.
	 *
	 * @return Area of Cylinder
	 */
	@Override
	public double getArea() {
		return 2*Math.PI*getRadius()*(getRadius() + getHeight());
	}
	
	/**
	 * Task 1.3
	 * <br>
	 * Convert Cylinder information to human-readable text.
	 *
	 * @return cylinder information
	 */
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() // use Circle's toString()
				       + " height=" + height;
	}
	
	/**
	 * Task 1.2
	 * <br>
	 * A public method for computing the volume of cylinder
	 * use superclass method getArea() to get the base area
	 *
	 * @return volume of cylinder
	 */
	public double getVolume() {
		return super.getArea()*height;
	}
	
	/**
	 * Task 1.2
	 * <br>
	 * Setter for field height.
	 *
	 * @param height Height of the cylinder
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	// A public method for retrieving the height
	public double getHeight() {
		return height;
	}
}
