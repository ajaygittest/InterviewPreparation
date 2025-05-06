package Codings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap {
	
	public static void main(String[] args) {
		int arr[] = {2,6,5,8,11};
			int 	target = 14;
        System.out.println(Arrays.toString(twoSum(arr,target)));
	}
	
	
	
	public static int[] twoSum(int[] arr,int target) {
		Map<Integer,Integer> map= new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			int a=target-arr[i];
			
			if(map.containsKey(a)) {
				return new int[] {map.get(a),i};
			}
			map.put(arr[i],i);
		}
		return new int[] {-1,-1};
		
	}

}
