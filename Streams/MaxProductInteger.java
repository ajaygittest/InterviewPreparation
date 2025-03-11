package Preparation;

import java.util.stream.IntStream;

public class MaxProductInteger {
	
	public static void main(String args[]) {
		MaxProduct();
	}
	
	public static void MaxProduct() {
		int[] array = {1, 4, 3, 6, 2, 7, 8};
		
		int maxProduct=IntStream.range(0, array.length).mapToObj(
				i->IntStream.range(i+1, array.length).map(j->array[i]*array[j])
				.max().orElse(Integer.MIN_VALUE)
				).max(Integer::compare).orElse(Integer.MIN_VALUE);
		System.out.println(maxProduct);
	}

}
