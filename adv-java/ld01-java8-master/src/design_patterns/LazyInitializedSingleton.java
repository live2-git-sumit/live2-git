package design_patterns;

public class LazyInitializedSingleton {
	public static void main(String[] args) {
		// THE DEVELOPER DOES NOT HAVE A CHOICE TO CREATE A NEW INSTANCE.
		// SingletonEx singletonEx = new SingletonEx();

		// DEVELOPER HAS TO USE AN EXISTING INSTANCE
		SingletonEx1 singletonEx = SingletonEx1.getInstance();
		singletonEx.testingSingleton();
		System.out.println(singletonEx);

		SingletonEx1 singletonEx1 = SingletonEx1.getInstance();
		singletonEx1.testingSingleton();
		System.out.println(singletonEx1);
	}
}

class SingletonEx1 {
	// SINGLE TO N (A SINGLE OBJECT SHOULD BE USED IN MANY PLACES (APPLICATION)
	// Step 1 : create a variable which is 1. private, 2. static
	private static SingletonEx1 INSTANCE_SINGLETON;

	// Step 2 : create a private constructor
	private SingletonEx1() {

	}

	// Step 3 : accessor to access the instance
	public static SingletonEx1 getInstance() {
		if (INSTANCE_SINGLETON == null) {
			INSTANCE_SINGLETON = new SingletonEx1();
		}
		return INSTANCE_SINGLETON;
	}

	// step 4 : write any business logic method
	public void testingSingleton() {
		System.out.println("Only a single instance is created!");
	}
}
