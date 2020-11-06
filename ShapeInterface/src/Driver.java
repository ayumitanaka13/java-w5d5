import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		Square s = new Square(9.9);
		Circle c = new Circle(5.5);

		c.setRadius(6.6);
		
		shapes.add(s);
		shapes.add(c);
		
		for (Shape shape : shapes) {
			System.out.println(shape.getArea());
		}

	}

}
