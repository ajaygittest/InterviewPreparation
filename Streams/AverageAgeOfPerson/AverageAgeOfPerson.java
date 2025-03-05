package Preparation;

import java.util.Arrays;
import java.util.List;

public class AverageAgeOfPerson {

	public static void main(String[] args) {
		 AverageAge();

	}
	
	public static void AverageAge() {
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
		
		double average=persons.stream().mapToInt(Person::getAge).average().orElse(0);
		System.out.println(average);
	}

}
