package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class MapFilterReduce {
	public static void main(String[] args) {
		// oldStyleIteration();
//		mapping_operation();
		filter_operation();
//		reduction_operation();
	}

	private static void reduction_operation() {
		// traditonal way of doing the reduction operation....
		int playersSalary1[] = { 70000, 100, 20000 };
		// int playersSalary1[] = {};
		int sum = 0;
		for (int i = 0; i < playersSalary1.length; i++) {
			sum = sum + playersSalary1[i];
		}
		System.out.println(sum);

		// modern way of performing reduction using stream api
//		int sum1 = Arrays.stream(playersSalary1).sum();
//		System.out.println(sum1);
		System.out.println(Arrays.stream(playersSalary1).sum());
		System.out.println(Arrays.stream(playersSalary1).min());
		System.out.println(Arrays.stream(playersSalary1).max());
		OptionalInt optionalInt = Arrays.stream(playersSalary1).max();
		int value = optionalInt.getAsInt();
		System.out.println(value);
		System.out.println(Arrays.stream(playersSalary1).count());
	}

	private static void mapping_operation() {
		// A simple array
		String[] players = new String[] { "sam", "peter", "billy", "lilly" };
		// A stream is a sequence of elements supporting sequential and parallel
		// aggregate operations.
		Stream<String> playerStream = Arrays.stream(players);
		// Map takes each element, modifies them (using lambda expression [Function])
		// and returns the modified data
//	    Stream<String>upperCaseStream = playerStream.map(player -> (player.length()> 3 ? "Mr. " + player.toUpperCase():  "Mrs. " + player.toLowerCase()));
		Stream<String> upperCaseStream = playerStream.map(player -> player.toUpperCase());
		// Converting the stream to array.
		String[] tempStrings = new String[100];
		String[] newPlayers = upperCaseStream.toArray(String[]::new);

		for (Object playerObject : newPlayers) {
			System.out.println(playerObject);
		}
	}

	private static void filter_operation() {
		// A simple array
		String[] players = new String[] { "sam", "peter", "billy", "lilly" };
		// A stream is a sequence of elements supporting sequential and parallel
		// aggregate operations.
		Stream<String> playerStream = Arrays.stream(players);
		// Provides a subset based on a condition
		Stream<String> filteredStream = playerStream.filter(player -> player.length() > 3);
		// Converting the stream to array.
		String[] newPlayers = filteredStream.toArray(String[]::new);

		for (Object playerObject : newPlayers) {
			System.out.println(playerObject);
		}
	}

	private static void oldStyleIteration() {
		ArrayList integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(6);
		integerList.add(10);
		// oldest form of iteration
//		for (int i = 0; i < integerList.size(); i++) {
//			Integer integer = (Integer) integerList.get(i);
//			System.out.println(integer);
//		}
		// enhanced for loop
//		for (Object object : integerList) {
//			Integer number = (Integer) object;
//			System.out.println(number);
//		}

// using iterator
//		Iterator<Integer> iterator = integerList.iterator();
//		// Iterate it manually
//		while (iterator.hasNext()) {
//			int value = iterator.next();
//			System.out.println(value);
//			// iterator.remove();
//		}
//		System.out.println(integerList);

		int sum = 0;
		// Find the sum of all numbers greater than 5
		Iterator<Integer> iterator = integerList.iterator();
		// Iterate it manually
		while (iterator.hasNext()) {
			int value = iterator.next();
			// check number greater than 5
			if (value > 5) {
				sum = sum + value;
			}
		}
		System.out.println(sum);

		// drawbacks
//		1. external iteration
//		2. sequential in nature 
//		3. too much code for a simple task.
	}
}
