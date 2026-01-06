package day4.InstanceCounter;

public class Counter {
	
	private int value;
	public static int instance = 0;
	
	public Counter() {
		instance++;
	}
	
	public void increment() {
		value++;
	}
	
	public void decrement() {
		value--;
	}
	
	public int getValue() {
		return value;
	}

}
