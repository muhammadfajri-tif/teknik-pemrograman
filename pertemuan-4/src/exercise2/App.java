package exercise2;

public class App {
	public static void main(String[] args) {
		// Test Shape
		Shape sh = new Shape();
		System.out.println("Shape:"
				                   + " color=" + sh.getColor()
				                   + " fill=" + sh.isFilled());
		System.out.println(sh.toString());
		
		// Test Circle
		Circle c1 = new Circle(7);
		System.out.println("Circle:"
				                   + " radius=" + c1.getRadius()
				                   + " base area=" + c1.getArea()
				                   + " perimeter=" + c1.getPerimeter());
		System.out.println(c1.toString());
		
		// Test Rectangle
		Rectangle rec1 = new Rectangle(3, 5);
		System.out.println("Rectangle:"
				                   + " width=" + rec1.getWidth()
				                   + " length=" + rec1.getLength()
				                   + " base area=" + rec1.getArea()
				                   + " perimeter=" + rec1.getPerimeter());
		System.out.println(rec1.toString());
		
		// Test Square
		Square sq1 = new Square();
		System.out.println("Square:"
				                   + " side=" + sq1.getSide()
				                   + " base area=" + sq1.getArea()
				                   + " perimeter=" + sq1.getPerimeter());
		System.out.println(sq1.toString());
	}
}
