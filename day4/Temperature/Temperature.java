package day4.Temperature;

public class Temperature {
	
	private final double celsius;
	
	public Temperature(double celsius) {
		this.celsius = celsius;
	}
	
	public double toFahrenheit() {
		return (celsius * 9 / 5) + 32;
	}
	
	public Temperature withCelsius(double c) {
		return new Temperature(c);
	}

}
