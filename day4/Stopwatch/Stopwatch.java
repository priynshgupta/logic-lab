package day4.Stopwatch;

public class Stopwatch {
	
	private boolean running;
	private int ticks;
	
	
	public void start() {
		running = true;
	}
	
	public void stop() {
		running = false;
	}
	
	public void reset() {
		ticks = 0;
	}
	
	public int elapsed() {
		return ticks;
	}
	
	public void incrementTick() {
		if (running) {
			ticks++;
		}
	}
	
	public boolean isRunning() {
		return running;
	}
	
	
}
