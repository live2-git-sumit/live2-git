package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {
		long time1 = sequentialStream();
		long time2 = parallelStream();
		System.out.println("Wow... time cut down by .." + (time1-time2));
	}

	private static long sequentialStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
        System.out.println("BEFORE PROCESSING " + productList);
		System.out.println("Input List ---> " + productList);

		List serialList = new ArrayList();
		long started = System.nanoTime();
		// Returns a sequential Stream with this collection as its source.
		// A sequence of elements supporting sequential and parallel aggregate
		// operations.
		// Returns a stream consisting of the elements of this stream that match the
		// given predicate.

		productList.stream()
		.filter(element -> (element > 5000 && element < 10000))
		.forEach(element -> {System.out.println(Thread.currentThread().getName() + " seq > " + element); serialList.add(element);});

		long finished = System.nanoTime();
		long timeElapsed = finished - started;
		System.out.println("Serial List ---> " + serialList);	
		System.out.println("Sequential : " + timeElapsed);
		// productList.stream().filter(element -> (element > 5000 && element <
		// 10000)).forEach(System.out::println);
		// productList.stream().filter(element -> element > 5000).filter(element ->
		// element < 10000)
		// .forEach(System.out::println);
        System.out.println("AFTER PROCESSING " + productList);
		return timeElapsed;
	}
	private static long parallelStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 10; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}

		System.out.println("Input List ---> " + productList);

		List parallelList = new ArrayList();
		long started = System.nanoTime();
		// Returns a sequential Stream with this collection as its source.
		// A sequence of elements supporting sequential and parallel aggregate
		// operations.
		// Returns a stream consisting of the elements of this stream that match the
		// given predicate.

		productList.parallelStream()
		.filter(element -> (element > 5000 && element < 10000))
		.forEach(element -> {
			System.out.println(Thread.currentThread().getName() + " par > " + element); 
		parallelList.add(element);
		});


		long finished = System.nanoTime();
		long timeElapsed = finished - started;
		System.out.println("Parallel List ---> " + parallelList);	
		System.out.println("Parallel : " + timeElapsed);
		// productList.stream().filter(element -> (element > 5000 && element <
		// 10000)).forEach(System.out::println);
		// productList.stream().filter(element -> element > 5000).filter(element ->
		// element < 10000)
		// .forEach(System.out::println);
		return timeElapsed;
	}
}
