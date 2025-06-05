package com.javaAdvance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccuranceAndDuplicates {
	
	public static void main(String[] args) {
		Occurance();
	}
	
	public static void Occurance() {
		String n="YesuRajae".toLowerCase();
		
		Map<Character,Integer> result = new HashMap<>();
		Map<Character,Integer> duplicateMap = new HashMap<>();
		
		for(char c:n.toCharArray()) {
			
			result.put(c, result.getOrDefault(c, 0)+1);
		}
		
		List<Character> duplicate = new ArrayList<>();
		for(Entry<Character, Integer> d:result.entrySet()) {
			
			if(d.getValue()>1) {
				duplicateMap.put(d.getKey(), d.getValue());
				duplicate.add(d.getKey());
			}
		}
		//System.out.println(duplicateMap);
		
		
		Map<Object, Long> mp=n.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(f->f,Collectors.counting()));
		Map<Object, Object> v=mp.entrySet().stream().filter(f->f.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(v);
	}

}
