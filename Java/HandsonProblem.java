package Own2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HandsonProblem {
	
	public static void main(String[] args) {
		String name="Yesu Rajae";
		name=name.replace(" ", "");
		Map<Character,Integer> result=new HashMap<>();
		
		for(char c:name.toCharArray()) {
			
			result.put(c, result.getOrDefault(c, 0)+1);
		}
		List<Integer> q1=new ArrayList<>(Arrays.asList(1,3,5,7,8));
		
		
		int max=Integer.MIN_VALUE;
		int SMax=Integer.MIN_VALUE;
		
		for(int n:q1) {
			
			if(n>max) {
				SMax=max;
				max=n;
			}else if(SMax<n&&max>n) {
				SMax=n;
			}
			
		}
		q1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	
		for(Entry<Character, Integer> t :result.entrySet()) {
			
			if(t.getValue()>1) {
				System.out.println(t.getKey());
			}
		}
		
		 String input = "aabbcc";
		 
		 StringBuilder sb =new StringBuilder();
		 int count=1;
		 for(int i=0; i<input.length(); i++) {
			
			 if(i+1<input.length() && input.charAt(i) ==input.charAt(i+1)) {
				 count++;
			 }else {
				 sb.append(count).append(input.charAt(i));
				 count=1;
			 }
			 
		 }
		
		 
		 String s1="Anagram";
		 String s2="Anagram";
		 
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		Arrays.equals(c1, c2);
		
		String subString="abckkdkac";
		
		Set<Character> set=new HashSet<>();
		
		int ans=0;
		int left=0;
		
		for(int right=0; right<subString.length(); right++) {
			
			while(set.contains(subString.charAt(right))){
				
				set.remove(subString.charAt(left));
				left++;
			}
			
			set.add(subString.charAt(right));
			ans=Math.max(ans, right-left+1);
			
		}
		System.out.println(ans);
	
	}
	
	

}
