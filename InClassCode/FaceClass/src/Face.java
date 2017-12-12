
public class Face implements Comparable<Face> {
	private Edge e1;
	private Edge e2;
	private Edge e3;
	
	public Face(Edge e1, Edge e2, Edge e3) {
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}

	public Face(double x1, double y1, double z1, 
				double x2, double y2, double z2, 
				double x3, double y3, double z3) {
		
		Vertex v1 = new Vertex(x1, y1, z1);
		Vertex v2 = new Vertex(x2, y2, z2);
		Vertex v3 = new Vertex(x3, y3, z3);
		
		this.e1 = new Edge(v1, v2);
		this.e2 = new Edge(v2, v3);
		this.e3 = new Edge(v1, v3);
	}
	
	public Edge getE1() {
		return e1;
	}

	public void setE1(Edge e1) {
		this.e1 = e1;
	}

	public Edge getE2() {
		return e2;
	}

	public void setE2(Edge e2) {
		this.e2 = e2;
	}

	public Edge getE3() {
		return e3;
	}

	public void setE3(Edge e3) {
		this.e3 = e3;
	}

	public int compareTo(Face that) {
		Double thisD = this.getArea();
		Double thatD = that.getArea();
		return thisD.compareTo(thatD);
	}
	
	@Override
	public String toString() {
		return "Perimeter  " + getPerimiter() + " Area: " + getArea();
	}
	
	public double getArea() {
		double hp = getPerimiter()/2.0;
		return Math.sqrt(hp*(hp-e1.getLength())*(hp-e2.getLength())*(hp-e3.getLength()));
	}
	
	public double getPerimiter() {
		return this.e1.getLength() + this.e2.getLength() + this.e3.getLength();
	}
	
	

	
}
