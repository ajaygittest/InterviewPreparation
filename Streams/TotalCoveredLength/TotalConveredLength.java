package Preparation;

import java.util.Arrays;
import java.util.List;

public class TotalConveredLength {

	public static void main(String[] args) {
		totalCoveredLength();

	}
	
	public static void totalCoveredLength() {
		List<Interval> intervals = Arrays.asList(new Interval(1, 3),
                new Interval(5, 8), new Interval(10, 12));
		int value=intervals.stream().mapToInt(i->i.getEnd()-i.getStart()).sum();
		System.out.println(value);
	}

}
