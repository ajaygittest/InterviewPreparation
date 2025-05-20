package Codings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		System.out.println(getList());
	}
	
	
	public static List<Integer> getList(){
		  int[] arr1 = {1, 3, 5};
	        int[] arr2 = {2, 4, 6};
	      
	       List<Integer> result= Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).sorted().collect(Collectors.toList());
	       
	      int out= result.stream().min(Integer::compareTo).get();
	      System.out.println(out);
	       
	      String s ="Thangakani";
	      
	  Map<Character, Long> va= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	      System.out.println(va);
	      return result;
	}

}
