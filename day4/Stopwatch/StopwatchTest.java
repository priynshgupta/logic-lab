package day4.Stopwatch;

public class StopwatchTest {

	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		for (int i=0; i<1000; i++) {
			if (sw.isRunning()) {
				sw.incrementTick();
			}
		}
		sw.stop();
		System.out.println(sw.elapsed());
		sw.reset();

	}

}
