
public class Square implements Shape {

	private double side;
	
	/*
	 * constructor
	 */
	public Square(double side) {
		setSide(side);
	}
	
	/*
	 * @return side
	 */
	public double getSide() {
		return side;
	}
	
	/*
	 * @param side
	 */
	public void setSide(double side) {
		if (side > 0) {
			this.side = side;
		} else {
			this.side = 1;
		}
	}

	
	@Override
	public double getArea() {
		return side * side;
	}

}
