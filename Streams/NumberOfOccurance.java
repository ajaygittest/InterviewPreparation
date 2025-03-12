package Preparation;

import java.util.Arrays;
import java.util.List;

public class NumberOfOccurance {

	public static void main(String[] args) {
		Occurance();

	}
	
	public static void Occurance() {
		List<String> strings = Arrays.asList("apple", "banana", "orange", 
                "grape", "melon");
		char target='n';
		
		int count=(int) strings.stream().flatMapToInt(CharSequence::chars).filter(f->f==target).count();
		System.out.println(target+":"+count);
		
	}

}
