public class Rectangle {
	private double width;
	private double length;


	Rectangle() {
		// we refer to instances poperties by saying this.property
		this.width = 1.0;
		this.length = 1.0;
	}

	Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}

	public double getArea() {
		return this.width * this.length;
	}

	public double getPerimeter() {
		return this.width*2 + this.length*2;
	}

	public String toString() {
		return "Rectangle of length: " + this.length + " and width: " + this.width;
	}
}