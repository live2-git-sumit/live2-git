package design_patterns;

public class ThreadSafeLazyInitializedSingleton {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// THE DEVELOPER DOES NOT HAVE A CHOICE TO CREATE A NEW INSTANCE.
		// SingletonEx singletonEx = new SingletonEx();

		// DEVELOPER HAS TO USE AN EXISTING INSTANCE
		/*
		 * SingletonEx3 singletonEx = SingletonEx3.getInstance();
		 * singletonEx.testingSingleton(); System.out.println(singletonEx);
		 */

		/*
		 * SingletonEx3 singletonEx3 = SingletonEx3.getInstance();
		 * singletonEx3.testingSingleton(); System.out.println(singletonEx3);
		 */

	}
}

class SingletonEx3 {
	// SINGLE TO N (A SINGLE OBJECT SHOULD BE USED IN MANY PLACES (APPLICATION)
	// Step 1 : create a variable which is 1. private, 2. static
	private static SingletonEx3 INSTANCE_SINGLETON;

	// Step 2 : create a private constructor
	private SingletonEx3() {

	}

	// Step 3 : accessor to access the instance
	public static synchronized SingletonEx3 getInstance() {
		if (INSTANCE_SINGLETON == null) {
			INSTANCE_SINGLETON = new SingletonEx3();
		}
		return INSTANCE_SINGLETON;
	}

	// step 4 : write any business logic method
	public void testingSingleton() {
		System.out.println("Only a single instance is created!");
	}
}
