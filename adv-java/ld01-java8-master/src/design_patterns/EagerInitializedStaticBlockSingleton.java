package design_patterns;

public class EagerInitializedStaticBlockSingleton {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// THE DEVELOPER DOES NOT HAVE A CHOICE TO CREATE A NEW INSTANCE.
		// SingletonEx singletonEx = new SingletonEx();

		// DEVELOPER HAS TO USE AN EXISTING INSTANCE
		/*
		 * SingletonEx2 singletonEx = SingletonEx2.getInstance();
		 * singletonEx.testingSingleton(); System.out.println(singletonEx);
		 * 
		 * SingletonEx2 singletonEx1 = SingletonEx2.getInstance();
		 * singletonEx1.testingSingleton(); System.out.println(singletonEx1);
		 */
		System.out.println("Application startup!");
		// DYNAMICALLY LOAD A CLASS DURING RUNTIME
		Class.forName("design_patterns.SingletonEx2");
		// Class.forName("design_patterns.SingletonEx2").newInstance();
		System.gc();
		Runtime.getRuntime().gc();
	}
}

class SingletonEx2 {
	// SINGLE TO N (A SINGLE OBJECT SHOULD BE USED IN MANY PLACES (APPLICATION)
	// Step 1 : create a variable which is 1. private, 2. static
	private static SingletonEx2 INSTANCE_SINGLETON;

	// Step 2 : create a private constructor
	private SingletonEx2() {

	}

	// Step 2.1 : add a static block to initialize and handle exception
	static {
		try {
			INSTANCE_SINGLETON = new SingletonEx2();
			System.out.println("Static Block executed and instance created!");
		} catch (Exception exception) {
			throw new RuntimeException("ERROR CREATING INSTANCE OF SINGLETON!");
		}
	}

	// Step 3 : accessor to access the instance
	public static SingletonEx2 getInstance() {
		return INSTANCE_SINGLETON;
	}

	// step 4 : write any business logic method
	public void testingSingleton() {
		System.out.println("Only a single instance is created!");
	}
}
