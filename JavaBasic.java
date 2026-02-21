package Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class JavaBasic {
	
	public static void main(String args[]) {
//		  int[] arr = {1,3, 4, 5, 6,7,8,9};  // Suppose N is 6, and 3 is missing
//	        int N = 9;
//		System.out.println(missingNumber(arr,N));
		int[] arr = {0, 5, 5, 2, 3};
		//mergeArray();
		
		//longestSubArray();
		nonRepeating();
	}
	//
	public static int missingNumber(int[] arr, int n) {
		int totalSum=n*(n+1)/2;
		
		int actualSum=0;
		
		for(int num:arr) {
			actualSum+=num;
		}
		
		return totalSum-actualSum;
	}
	
	public static int largest2Number(int arr[]) {
		
		int[] sorted=Arrays.stream(arr).sorted().toArray();
		
		int product1 = sorted[sorted.length-1]*sorted[sorted.length-2];
		int product2 = sorted[0]*sorted[1];
		
		return Math.max(product1, product2);
	}
	
	public static void mergeArray() {
		int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
		int[] result= IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
		System.out.println(Arrays.toString(result));
	}
	
	
	public static void longestSubArray() {
		int sum=0;
		int maxlength=0;
		int[] arr = {1, 2, -3, 3, 1, -1, 1, -1, 1, -1};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0 ;i<arr.length; i++) {
			sum+=arr[i];
		
		if(sum==0) {
			maxlength=i+1;
		}
		if(map.containsKey(sum)) {
			int length = i-map.get(sum);
			maxlength=Math.max(maxlength, length);
		}else {
			map.put(sum, i);
		}
		
		}
		System.out.println(maxlength);
		
		
	}
	
	
	public static void nonRepeating() {
		
		String s1 ="YesuRaja";
		List<Character> result = new ArrayList();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		
		for(int i=0; i<s1.length(); i++) {
			char c =s1.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			
			if(map.get(c)==1) {
				result.add(c);
			}
		}
		
		
		System.out.println(result);
		
		
	}
	

}
