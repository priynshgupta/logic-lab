package day4.Vector2D;

public class Vector2DTest {

	public static void main(String[] args) {
		Vector2D v = Vector2D.fromPolar(2, Math.PI / 2);
		Vector2D w = Vector2D.UNIT_X.add(v);
		
		System.out.println(v);
		System.out.println(w);
		System.out.println(w.magnitude());
		

	}

}
