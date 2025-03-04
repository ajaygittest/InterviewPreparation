package Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPrimeNumber {

	
	
	public static void main(String args[]) {
		FindPrimeNumber prime = new FindPrimeNumber();
		prime.primeNumbers();
	}
	
	private void primeNumbers() {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		
		List<Integer> value=numbers.stream().filter(this::isPrime).collect(Collectors.toList());
		System.out.println(value);
	}
	
	
	public boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
