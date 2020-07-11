package java7.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
	public static void main(String[] args) {
		// primitive type holds only values
		int i = 10;
		// the primitive data type is wrapped
		// primitive is converted to a reference type (boxing)
		Integer integer = i;
		System.out.println(i + i);
		System.out.println(integer.toString() + integer.toString());

		// the primitive type is unwrapped
		// reference type is converted into a prmitive type (unboxing)
		int x = integer;

		// List <Integer>list = new ArrayList<Integer>();
		List list = new ArrayList();
		list.add(x);
		list.add((Integer) x);
		list.add("Test");
		list.add(new Thread());
		System.out.println(list);

		List<Number> numbers = new ArrayList<Number>();
		numbers.add(10);
		numbers.add(50.50);
		byte b = 100;
		numbers.add(b);
		int i1 = 'a';
		numbers.add((int) 'a');
		System.out.println(numbers);
	}
}
