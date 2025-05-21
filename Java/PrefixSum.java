package Codings;

import java.util.Arrays;

public class PrefixSum {
	
	
	public static void main(String[] args) {
		System.out.println(preFix());
	}

	
	
	public static int preFix() {
		int[] arr = {2, 4, 1, 3, 5};
		
		int[] prefix=new int[arr.length];
		
		prefix[0]=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			prefix[i]=prefix[i-1]+arr[i];
		}
		
		int i=1; 
		int j=3;
		System.out.println(Arrays.toString(prefix));
		int sum=prefix[j]-(i>0?prefix[i-1]:0);
		return sum;
	}
}
