
public class Circle implements Shape {

	private double radius;
	
	/*
	 * constructor
	 */
	public Circle(double radius) {
		setRadius(radius);
	}
	
	/*
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/*
	 * @param radius
	 */
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 1;
		}
	}
	
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
}
