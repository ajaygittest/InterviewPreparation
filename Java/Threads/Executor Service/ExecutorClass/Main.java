package ExecutorClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> evenNumbers = Collections.synchronizedList(new ArrayList<>());

		ExecutorService service = Executors.newFixedThreadPool(4);

		int max = 500;
		int chunkSize = 250;

		for (int start = 0; start < max; start += chunkSize) {

			int end = Math.min(start + chunkSize, max);

			service.submit(new OddEvenCalculation(start, end, evenNumbers));

		}
		service.shutdown();
		service.awaitTermination(5, TimeUnit.SECONDS);
		System.out.println(evenNumbers);

	}

}
