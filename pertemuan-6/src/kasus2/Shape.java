package kasus2;

// abstract class Shape
public abstract class Shape {
	/**
	 * An instance variable shapeName of type String.
	 */
	private String name;
	
	public Shape(String name){
		this.name = name;
	}
	
	/**
	 *  abstract method area()
	 */
	public abstract double area();
	
	/**
	 * A toString() method that returns the name of the shape
	 * @return shape name
	 */
	public String toString() {
		return "Shape Name: " + this.name;
	}
}
