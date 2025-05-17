package ThreadLock;

public class ExampleThreadLockk {
	
	public static void main(String[] args) {
		
		Counter count = new Counter();
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<1000; i++) {
				count.increment();
				System.out.println("Thread 1");
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0; i<1000; i++) {
				count.increment();
				System.out.println("Thread 2");
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t1.join();
		}catch (InterruptedException e) {
            e.printStackTrace();
        }
		 System.out.println("Final count: " + count.getCount());
	}

}
