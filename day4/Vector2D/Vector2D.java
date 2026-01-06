package day4.Vector2D;

public class Vector2D {
	
	private final double x;
	private final double y;
	
	public static final Vector2D ZERO = new Vector2D(0, 0);
	public static final Vector2D UNIT_X = new Vector2D(1, 0);
	public static final Vector2D UNIT_Y = new Vector2D(0, 1);
	
	
	private Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static Vector2D fromPolar(double r, double theta) {
		double x = r * Math.cos(theta);
		double y = r * Math.sin(theta);
		return new Vector2D(x, y);
	}
	
	public Vector2D add(Vector2D other) {
		return new Vector2D(this.x + other.x, this.y + other.y);
	}
	
	public Vector2D scale(double s) {
		return new Vector2D(this.x * s, this.y * s);
	}
	
	public double magnitude() {
		return Math.sqrt(x * x + y * y);
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
} 
