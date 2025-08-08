package Striver;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostFrequentElement {
	public static void main(String[] args) {
		int[] num= {1,1,2,2,2,2,3,3,3,3,3};
		mostFrequentElements(num);
		
	}
	 public static void mostFrequentElements(int[] nums) {
		 
		 
		 Map<Integer,Integer> result=new HashMap<>();
		 
		 for(int n:nums) {
			 
			 result.put(n, result.getOrDefault(n, 0)+1);
		 }
		 
		 int Maxnum=nums[0];
		 int maxCount=0;
		 
		for(Entry<Integer, Integer> n: result.entrySet()) {
			
			int key=n.getKey();
			int count =n.getValue();
			
			if(maxCount<count ||(maxCount==count &&key<Maxnum)) {
				maxCount=count;
				Maxnum=key;
			}
			
			
		}
		
		System.out.println(Maxnum);
	     
	    }
}

