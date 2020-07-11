package java7.collections;

import java.util.HashMap;
import java.util.Map;

public class MapMaster {
	public static void main(String[] args) {
		Map map = new HashMap();
		// Map map = new LinkedHashMap();
		map.put(2, "integer");
		map.put("p1", "Rich");
		map.put("p2", "Haley");
		map.put("p2", "Smiley");
		map.put(null, "Test This!");
		map.put(null, "Test This Now!");
		map.put("null", "Test This Again!");
		map.put(1, "integer");
		System.out.println(map);

	}
}
