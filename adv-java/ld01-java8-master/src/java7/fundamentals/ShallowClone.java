package java7.fundamentals;

import java.util.Arrays;

public class ShallowClone {
public static void main(String[] args) {
ObjectToBeCloned.cloneTest();
}
}

class ObjectToBeCloned implements Cloneable{
	// THE INT ARRAY IS SHALLOW CLONED AS ONLY THE ADDRESS IS COPIED AND THE VALUES
	// ARE NOT COPIED
	public int[] numbers;
	public String nameString = "Rambo";
	public float value = 5.5f;
	public Float floatWrapper = 55.55f;
	public Test test = new Test();

	public ObjectToBeCloned(int size) {
		numbers = new int[size];
	}
	
	static void cloneTest() {
		ObjectToBeCloned originalObject = new ObjectToBeCloned(2);
		originalObject.numbers[0] = 100;
		
		try {
			ObjectToBeCloned clonedObject = (ObjectToBeCloned)originalObject.clone();
			System.out.println("Original      " + originalObject);
			System.out.println("Cloned      " + clonedObject);
			
			clonedObject.nameString = "John";
			clonedObject.floatWrapper = 789.987f;
			clonedObject.test.nameString = "Virus!";
			clonedObject.value = 500.500f;
			//originalObject.value = 500.500f;
			clonedObject.numbers[1] = 5000;
			
//			// AFTER CLONING
			System.out.println("Original      " + originalObject);
			System.out.println("Cloned      " + clonedObject);
			
		} catch (CloneNotSupportedException e) {
			System.out.println("You cannot clone this object!" + e);
		}

	}

	@Override
	public String toString() {
		return "ObjectToBeCloned [numbers=" + Arrays.toString(numbers) + ", nameString=" + nameString + ", value="
				+ value + ", floatWrapper=" + floatWrapper + ", test=" + test + "]";
	}
}
class Test {
	String nameString = "Tester";

	@Override
	public String toString() {
		return "Test [nameString=" + nameString + "]";
	}

}