package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
	
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,3,3};
		
		System.out.println(Arrays.toString(oldapprach(arr)));
	}
	
	public static int[] removeDuplicate(int[] arr) {
		
		int i=0;
		
		for(int j=1; j<arr.length; j++) {
			
			if(arr[i] !=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		int[] result=Arrays.copyOf(arr, i+1);
		return result;
	}
	
	
	////brute force approach
	
	
	public static int[] oldapprach(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		int[] result = new int[set.size()];
		
		int index=0;
		for(int n:set) {
			result[index++]=n;
		}
		return result;
	}

}
