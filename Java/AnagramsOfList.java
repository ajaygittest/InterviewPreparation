package Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramsOfList {

	public static void main(String[] args) {
		AnagramList() ;

	}
	
	public static void AnagramList() {
		List<String> words = Arrays.asList("listen", "silent", "hello",
                "world", "night", "thing");
		Map<Object, List<String>> anagram=words.stream().collect(Collectors.groupingBy(str -> {
			char[] c = str.toCharArray();
			Arrays.sort(c);
			return new String(c);
		}));
		System.out.println(anagram);
	}

}
