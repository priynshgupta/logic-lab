package day4.MathUtil;

public class MathUtil {
	
	public static int max(int a, int b) {
		if (a > b) return a;
		return b;
	}
	
	public static int clamp(int v, int min, int max) {
		if (v < min) return min;
		if (v > max) return max;
		return v;
	}
	
}
