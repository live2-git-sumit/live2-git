package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("java","jAva","JAVA","100","sql","50");		
//		List<String> list = Arrays.asList("java");
		//Natural sorting
//		Collections.sort(list);
//		System.out.println(list);
		
		//Custom sorting
		//Override the compare method of the comparator interface
		Comparator<String> comparatorLambda = (string1, string2) -> Integer.compare(string1.length(), string2.length());
		//use the compartor for sorting the collection
//		Collections.sort(list,comparatorLambda);
//		System.out.println(list);

		//ascending order
		Collections.sort(list,(string1, string2) -> Integer.compare(string1.length(), string2.length()));
		System.out.println(list);
		
		//descending order
		Collections.sort(list,(string1, string2) -> Integer.compare(string2.length(), string1.length()));
		System.out.println(list);
	}
}
