package Threads;

public class MultiThread {

	
	public static void main(String[] args) {
		
		
		
	
		
		
		
		int n=20;
		for(int i=0; i<=n; i++) {
			myThread obj = new myThread();
			//Thread t = new Thread(obj);
			obj.start();
			System.out.println(i);
		}
	}
}
