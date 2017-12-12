
public class Edge {
	private Vertex v1;
	private Vertex v2;
	
	public Edge(Vertex v1, Vertex v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	public Edge(double x1, double y1, double z1, double x2, double y2, double z2) {
		this.v1 = new Vertex(x1, y1, z1);
		this.v2 = new Vertex(x2, y2, z2);
	}
	
	
	public Vertex getV1() {
		return v1;
	}
	public void setV1(Vertex v1) {
		this.v1 = v1;
	}
	public Vertex getV2() {
		return v2;
	}
	public void setV2(Vertex v2) {
		this.v2 = v2;
	}
	
	
	public double getLength() {
		double deltaX = this.v1.getX() - this.v2.getX();
		double deltaY = this.v1.getY() - this.v2.getY();
		double deltaZ = this.v1.getZ() - this.v2.getZ();
		
		return Math.sqrt(Math.pow(deltaX, 2) + 
						Math.pow(deltaY, 2) + 
						Math.pow(deltaZ, 2));
	}
	@Override
	public String toString() {
		return "Edge [" + v1 + "," + v2 + ", len=" + getLength() + "]";
	}
	
	
}
