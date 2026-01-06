package day4.SingletonLogger;

public class SingletonLogger {
	
	private static SingletonLogger instance;
	private static final String PREFIX = "[APP] ";

	public SingletonLogger() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonLogger getInstance() {
		if (instance == null) {
			instance = new SingletonLogger();
		}
		return instance;
	}
	
	public void log(String msg) {
		System.out.println(PREFIX + msg);
	}

}
