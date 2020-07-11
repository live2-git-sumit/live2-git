package java8.newfeatures;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Counter {
	int count(Object[] objArray);

//	int count(Object[] objArray) {
//		int count = Utils.countElement(objArray);
//		return count;
//	}
}

public class MethodReference {

	public static void main(String[] args) {
		// objectInstanceMethodReference();
		// staticMethodReference();
		objectInstanceMethodReference1();
	}

	private static void objectInstanceMethodReference() {
		// :: the method reference operator
		// stores elements in insertion order
		// it allows duplicates
		List<String> namesList = new ArrayList<String>();
		namesList.add("Tony");
		namesList.add("Robbins");

		// Iterate the java 8 way
		// DIGGING INTO THE SOURCE CODE
//	@FunctionalInterface
//	public interface Consumer<T>
// 	void accept(T t)

//	void accept(String item)	{
//		System.out.println(item);
//	}
		namesList.forEach(item -> System.out.println(item));

		// Iterate the java 8 way
		namesList.forEach(item -> {
			if (item.length() > 4)
				System.out.println("Condition : " + item);
		});
		// Filtering the results

		// Iterating an array with method reference
		namesList.forEach(System.out::println);
//	    default void forEach(Consumer<? super T> action) {
//	        Objects.requireNonNull(action);
//	        for (T t : this) {
//	            action.accept(t);
//	        }
//	    }
	}

	private static void objectInstanceMethodReference1() {
		// using instance method reference
		Integer[] intArray = { 5, 6, 7, 8 };

//		Utils utils = new Utils();
//		Counter counter2 = utils::countElementsInstance;

		Counter counter2 = new Utils()::countElementsInstance;
		System.out.println(counter2.count(intArray));

	}

	private static void staticMethodReference() {
		// use a lambda expression to call a static method of a class.
		Integer[] intArray = { 5, 6, 7, 8 };
		Counter counter = array -> Utils.countElements(array);
		System.out.println(counter.count(intArray));

		// using a static method reference
		Counter counter2 = Utils::countElements;
		System.out.println(counter2.count(intArray));
	}
}

class Utils {
	public static int countElements(Object[] array) {
		return array.length;
	}

	public int countElementsInstance(Object[] array) {
		return array.length;
	}
}