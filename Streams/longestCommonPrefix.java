package Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class longestCommonPrefix {

	public static void main(String[] args) {
		
		 commonPrefix();
		
	}
	
	public static void commonPrefix() {
		
		
		List<String> strings = Arrays.asList("flower", "flow", "floght");
		
		String output=strings.stream().reduce((s1,s2)->{
			int length=Math.min(s1.length(),s2.length());
			int i=0;
			while(i<length&&s1.charAt(i)==s2.charAt(i)) {
				i++;
			}
			return s1.substring(0,i);
		}
			).orElse("");
		
		System.out.println(output);
	}

}
