package Preparation;

import java.util.Arrays;

public class RotateArray {
	
	
	public static void main(String args[]) {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        rotateArray(arr,k);
	        System.out.println(Arrays.toString(arr));
	}

	public static void reverseArray(int[] arr, int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void rotateArray(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		
		reverseArray(arr,0,n-1);
		reverseArray(arr,0,k-1);
		reverseArray(arr,k,n-1);
	}
}
