package ThreadLock;

public class Counter {
	
	int counter=0;
	
	
	public synchronized void increment() {
		counter++;
	}
	
	public synchronized int getCount() {
		return counter;
	}

}
