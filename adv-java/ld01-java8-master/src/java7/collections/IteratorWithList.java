package java7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorWithList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Volvo");
		list.add("Mercedez");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
