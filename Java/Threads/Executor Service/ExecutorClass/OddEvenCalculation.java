package ExecutorClass;

import java.util.List;

public class OddEvenCalculation implements Runnable {
	
	private int start;
	
	private int end;
	
	 private List<Integer> result;
	
	
	public OddEvenCalculation(int start, int end, List<Integer> result) {
		 this.start = start;
	        this.end = end;
	        this.result = result;
	}
	@Override
	public void run() {
	
		  for (int i = start; i <= end; i++) {
	            if (i % 2 == 0) {
	                result.add(i);
	            }
	        }
		
	}

}
