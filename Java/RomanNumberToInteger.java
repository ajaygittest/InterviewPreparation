package Practice;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanInt("IV"));
	}
	
	
	public static int romanInt(String input) {
		
		Map<Character,Integer> hm=new HashMap<>();
		
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('C', 100);
		hm.put('M', 1000);
		hm.put('D', 500);
		
		
		int result =hm.get(input.charAt(input.length()-1));
		for(int i=input.length()-2; i>=0; i--) {
			
			if(hm.get(input.charAt(i))>input.charAt(i+1)) {
				result-=hm.get(input.charAt(i));
			}else {
				result+=hm.get(input.charAt(i));
			}
		}
		return result;
		
	
	}

}
