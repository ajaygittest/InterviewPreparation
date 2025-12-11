package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Codings.Employee;

public class InterviewCodingHandson {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 8, 8);
		
		List<String> intString=Arrays.asList("123","abc","938","kido");

		List<String> strings = Arrays.asList("dehe", "uehaaaa", "jdjeyeaa", "djdjdjd");
		List<Employee> employees = Arrays.asList(new Employee(1, "Alice", "HR", "Manager", 70000, "Female", 6),
				new Employee(2, "Bob", "IT", "Developer", 80000, "Male", 4),
				new Employee(3, "Charlie", "Finance", "Analyst", 60000, "Male", 5),
				new Employee(4, "Kani", "IT", "OverThinking", 95000, "Female", 7),
				new Employee(5, "Eve", "HR", "Executive", 45000, "Male", 3),
				new Employee(6, "Frank", "Finance", "Manager", 85000, "Male", 10),
				new Employee(7, "Grace", "IT", "Manager", 100000, "Female", 9),
				new Employee(8, "Hank", "HR", "Executive", 40000, "Male", 2));

		data.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());

		strings.stream().map(f -> f.toUpperCase()).collect(Collectors.toList());

		employees.stream().filter(f -> f.getDesignation().equalsIgnoreCase("Manager")).mapToDouble(f -> f.getSalary())
				.sum();
		data.stream().distinct().collect(Collectors.toList());
		employees.stream().filter(f -> f.getName().length() > 5).sorted().collect(Collectors.toList());

		employees.stream().map(f -> f.getName()).collect(Collectors.toList());

		strings.stream().collect(Collectors.groupingBy(String::length));

		Map<Boolean, List<Integer>> l = data.stream().collect(Collectors.partitioningBy(f -> f % 2 == 0));
		String name = "LoveInsuranceCompany";
		name.chars().mapToObj(f -> (char) f).collect(Collectors.groupingBy(f -> f, Collectors.counting()));

		Optional<Integer> k = data.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(k);
		name.chars().mapToObj(f -> (char) f).collect(Collectors.groupingBy(f -> f, Collectors.counting())).entrySet()
				.stream().filter(f -> f.getValue() > 1).map(f -> f.getKey()).collect(Collectors.toList());

		employees.stream().collect(Collectors.groupingBy(f->f.getDepartment(),Collectors.maxBy(Comparator.comparing(f->f.getSalary()))));
		int j=data.stream().max(Comparator.comparing(f->f)).get();
		employees.stream().collect(Collectors.averagingDouble(f->f.getSalary()));
		String p=strings.stream().collect(Collectors.joining(","));
		
		String input = "Hello World";
		
		List<Character> kk=input.chars().mapToObj(c->(char)c).filter(f->"AEIOUaeiou".indexOf(f)!=-1).collect(Collectors.toList());
		System.out.println(kk);
	}

}
