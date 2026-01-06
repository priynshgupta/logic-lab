package day4.RectangleWithEncapsulation;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setWidth(10);
		r.setHeight(5);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		r.setHeight(0);
		System.out.println(r.getHeight());

	}

}
