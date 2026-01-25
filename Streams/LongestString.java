package Preparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
	
	
	public static void main(String args[]) {
		LongestString() ;
	}
	//
	public static void LongestString() {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		
		Optional<String> result=strings.stream().max(Comparator.comparingInt(String::length));
		System.out.println(result);
		
	
	}

}
