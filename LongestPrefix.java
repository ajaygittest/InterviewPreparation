package Preparation;

import java.util.HashMap;
import java.util.Objects;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"fllower", "fllow", "fllight"};
		
		String input = "aabcccccaaa";
		//System.out.println(longestPrefix(strs));
		System.out.println(StringCompression(input));
	}
	//
	
	public static String longestPrefix(String[] s1) {
		
		if(Objects.isNull(s1)) {
			return "";
		}
		
		String prefix=s1[0];
		for(int i=0; i<s1.length; i++) {
			
			while(s1[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
				
				if(Objects.isNull(prefix))
				{
					return "";
				}
			}
			
		}
		return prefix;
	}
	
	
	public static String StringCompression(String s1) {
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<s1.length();i++) {
			char c = s1.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
				
			}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s1.length();i++) {
			char c = s1.charAt(i);
			
			if(map.containsKey(c)) {
				int count = map.get(c);
				sb.append(c).append(count);
				map.remove(c);
			}
		}
		return sb.length()<s1.length()?sb.toString():s1;
	}

}
