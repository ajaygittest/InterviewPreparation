package MathDsa;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumberRange {

	
	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>();
		
		for(int i=2; i<40; i++) {
			if(isPrime(i)) {
				result.add(i);
				
			}
				
		}
		System.out.println(result);
		
	}
	
	public static boolean isPrime(int n) {
		
		if(n<=1) {
			return false;
		}
		int c=2;
		
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}
}
