package Codings;

public class SlidingWindow {

	public static void main(String[] args) {
		
		System.out.println(slidingWindow());
	}
	
	
	public static int slidingWindow() {
		 int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
	        int k = 4;
	        
	        int window=0;
	        
	        for(int i=0; i<k; i++) {
	        	window+=arr[i];
	        }
	        
	        int max=window;
	        
	        for(int j=k; j<arr.length;j++) {
	        	
	        	window+=arr[j]-arr[j-k];
	        	max=Math.max(max, window);
	        }
	        return max;
	}

}
