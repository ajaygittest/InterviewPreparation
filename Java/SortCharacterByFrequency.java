package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {

	public static void main(String[] args) {
		System.out.println(sortCharacter("tree"));

	}
	
	public static String sortCharacter(String input) {
		
		StringBuilder sb = new StringBuilder();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c: input.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		List<Character> list = new ArrayList<>(map.keySet());
		list.sort((o1,o2)->o1-o2);
		
		for(char d:list) {
			for(int i=0;i<map.get(d);i++) {
				sb.append(d);
			}
		}

		System.out.println(list);
		return sb.toString();
		
	}

}
