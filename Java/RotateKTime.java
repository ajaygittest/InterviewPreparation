package Practice;

import java.util.Arrays;

public class RotateKTime {
	
	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5,6,7};
		 System.out.println(Arrays.toString(rotateArray(arr,4)));
	}
	
	public static int[] rotateArray(int[] arr, int k) {
		int n=arr.length;
		reverseArray(arr,0,n-k-1);
		reverseArray(arr,n-k,n-1);
		reverseArray(arr,0,n-1);
		
		return arr;
	}

	private static void reverseArray(int[] arr, int start, int end) {
		
		while(start<=end) {
			
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
