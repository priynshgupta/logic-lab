package day4.SingletonLogger;

public class SingletonLoggerTest {

	public static void main(String[] args) {
		
		SingletonLogger l1 = SingletonLogger.getInstance();
		SingletonLogger l2 = SingletonLogger.getInstance();
		
		System.out.println(l1 == l2);
		
		l1.log("Started");
		l2.log("Running");

	}

}
