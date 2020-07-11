package java7.fundamentals;

import java.util.Arrays;

public class ComparableComparator {
	public static void main(String[] args) {

		// The Integer class implements the Comparable Interface
		// The compareTo() method
		Integer[] intArray = { 566, 67, 78, 99 };
		Arrays.sort(intArray);
		for (int i : intArray) {
			System.out.println(i);
		}

		Integer integer = new Integer(566);
		int status = integer.compareTo(67);
		System.out.println(status);
	}
}
