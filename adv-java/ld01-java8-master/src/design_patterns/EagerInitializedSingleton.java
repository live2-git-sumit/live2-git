package design_patterns;

public class EagerInitializedSingleton {
	public static void main(String[] args) throws ClassNotFoundException {
//THE DEVELOPER DOES NOT HAVE A CHOICE TO CREATE A NEW INSTANCE.
//SingletonEx singletonEx = new SingletonEx();

//DEVELOPER HAS TO USE AN EXISTING INSTANCE
		
		  SingletonEx singletonEx = SingletonEx.getInstance();
		  singletonEx.testingSingleton(); System.out.println(singletonEx);
		 

		
		  SingletonEx singletonEx1 = SingletonEx.getInstance();
		  singletonEx1.testingSingleton(); System.out.println(singletonEx1);
		 

		// System.out.println("Application startup!");
		// DYNAMICALLY LOAD A CLASS DURING RUNTIME
		// Class.forName("design_patterns.SingletonEx");
	}
}

class SingletonEx {
//SINGLE TO N (A SINGLE OBJECT SHOULD BE USED IN MANY PLACES (APPLICATION)
//Step 1 : create a variable which is 1. private, 2. static, 3. which is final
	private final static SingletonEx INSTANCE_SINGLETON = new SingletonEx();

//Step 2 : create a private constructor
	private SingletonEx() {

	}

// Step 3 : accessor to access the instance
	public static SingletonEx getInstance() {
		return INSTANCE_SINGLETON;
	}

// step 4 : write any business logic method
	public void testingSingleton() {
		System.out.println("Only a single instance is created!");
	}
}
