package Codings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String args[]) {
		Stream();
	}
	
	public static void Stream() {
		
		List<Integer> data = Arrays.asList(1,2,3,3,4,5,6,8,8);
		
		List<String> strings = Arrays.asList("dehe","uehaaaa","jdjeyeaa","djdjdjd");
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "Alice", "HR", "Manager", 70000,"Female", 6),
			    new Employee(2, "Bob", "IT", "Developer", 80000,"Male", 4),
			    new Employee(3, "Charlie", "Finance", "Analyst", 60000,"Male", 5),
			    new Employee(4, "Kani", "IT", "OverThinking", 95000,"Female", 7),
			    new Employee(5, "Eve", "HR", "Executive", 45000,"Male", 3),
			    new Employee(6, "Frank", "Finance", "Manager", 85000,"Male", 10),
			    new Employee(7, "Grace", "IT", "Manager", 100000,"Female", 9),
			    new Employee(8, "Hank", "HR", "Executive", 40000,"Male", 2)
			);
		
	
		Map<Boolean, List<Integer>> event=data.stream().filter(Objects::nonNull
				).collect(Collectors.partitioningBy(f->f%2==0));
		//System.out.println(event.get(false));
		
		//strings.stream().filter(s->s.length()>3).forEach(System.out::println);
		//strings.stream().map(f->f.toUpperCase()).forEach(System.out::println);
		data.stream().sorted().forEach(System.out::print);
		System.out.println();
		//data.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		String input = "streamexample";
		
		Optional<Character> value=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())
				).entrySet().stream().filter(f->f.getValue()==1).map(c->c.getKey()).findFirst();
		///System.out.println(value);
		Map<Object, List<String>> va=strings.stream().collect(Collectors.groupingBy(f->f.length()));
		//System.out.println(va);
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

		Set<String> set= new HashSet<>();
		List<String> out=items.stream().filter(f->!set.add(f)).collect(Collectors.toList());
		//System.out.println(out);
	Map<String, Long> s=	items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(s);
	   List<List<Integer>> nestedList = Arrays.asList(
	            Arrays.asList(3, 5, 7),
	            Arrays.asList(1, 2, 3),
	            Arrays.asList(4, 5, 6)
	        );
	   
	   List<Integer> m=nestedList.stream().flatMap(l->l.stream()).distinct().sorted(((a,b)->a-b)).collect(Collectors.toList());
	 //  System.out.println(m);
	   
	List<Employee> com=   employees.stream().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).limit(3).collect(Collectors.toList());
	//System.out.println(com);
	Map<Object, Optional<Employee>> mm=employees.stream().collect(Collectors.groupingBy(f->f.getDepartment(),Collectors.maxBy((a,b)->Double.compare(a.getSalary(), b.getSalary()))));
	//System.out.println(mm);
	Map<Object, Map<Object, List<Employee>>> k=employees.stream().collect(Collectors.groupingBy(f->f.getDepartment(),Collectors.groupingBy(f->f.getGender())));
	//System.out.println(k);
	String j=strings.stream().collect(Collectors.joining(","));
	//System.out.println(j);
	Optional<Integer> l=data.stream().max(Integer::compareTo);
	//System.out.println(l);
	List<String> v=strings.stream().sorted((a,b)->a.length()-b.length()).collect(Collectors.toList());
	System.out.println(v);
	//palindrome
	List<String> a=strings.stream().filter(f->f.equals(new StringBuffer(f).reverse().toString())).collect(Collectors.toList());
		System.out.println(a);
	}
	
	
}
