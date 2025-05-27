package Striver;

import java.util.Arrays;

public class SwapArraySequence {
	
	
	
	public static void main(String[] args) {
		int[] arr= {1,3,4,5,6};
		swap(arr);
		System.out.println(Arrays.toString(arr));
	}

	
	public static void swap(int[] arr) {
		
		for(int i=0; i<arr.length-1; i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
}
