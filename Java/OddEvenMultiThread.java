package Sample;

public class OddEvenMultiThread {

	public int number = 1;

	private int limit;

	public OddEvenMultiThread(int n) {
		this.limit = n;
	}

	public synchronized void printOdd() {

		while (number <= limit) {

			if (number % 2 == 0) {

				try {
					wait();
				} catch (Exception e) {
					Thread.currentThread().interrupt();
				}
			} else {
				System.out.println("Odd Number " + number);
				number++;
				notify();
			}

		}
	}

	public synchronized void printEven() {

		while (number <= limit) {

			if (number % 2 != 0) {

				try {
					wait();
				} catch (Exception e) {
					Thread.currentThread().interrupt();
				}
			} else {
				System.out.println("Even Number " + number);
				number++;
				notify();
			}

		}
	}

}
