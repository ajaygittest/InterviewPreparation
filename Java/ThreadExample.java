package com.javaAdvance;


class ExampleA extends Thread{
	
	public void run() {
		for(int i=0; i<=100; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ExampleB extends Thread{
	
	public void run() {
		for(int i=0; i<=100; i++) {
			System.out.println("Hi");
		}
	}
}



public class ThreadExample {
	
	public static void main(String args[]) {
	
		Runnable obj1 =()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable obj2 =()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Hii");
			}
		};
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.run();
		t2.run();
	}

}
