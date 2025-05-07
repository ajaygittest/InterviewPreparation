package Practice;

public class secondLargestElement {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 7,6,5,8};
		
		System.out.println(getSecondLargest(arr));
	}

    public static  int getSecondLargest(int[] arr) {
        // code here
         int second_largest=0;
         int large=0;
         
         for(int i=0; i<arr.length; i++) {
        	 
        	 if(arr[i]>large) {
        		 second_largest=large;
        		 large=arr[i];
        	 }else if(arr[i]>second_largest&& large !=arr[i]) {
        		 second_largest=arr[i];
        	 }
         }
         return second_largest;
    }

}
