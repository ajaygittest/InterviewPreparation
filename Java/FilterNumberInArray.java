package Own2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNumberInArray {
	
	public static void main(String[] args) {
		
		List<String> value=new ArrayList<>(Arrays.asList("Aja","123","345"));
		List<Integer> result=new ArrayList<>();
		for(String s:value) {
			
			if(s.matches("\\d+")) {
				result.add(Integer.parseInt(s));
			}
			
		}
		
		System.out.println(result);
		
	}

}
