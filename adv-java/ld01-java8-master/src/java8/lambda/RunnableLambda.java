package java8.lambda;

public class RunnableLambda {
	public static void main(String[] args) throws InterruptedException {
		traditionalThreading();
		// threadingWithAnonymousClass();
		// threadUsingRunnable();
		// PROBLEM : One issue with anonymous classes is that
		// if the implementation of your anonymous class is very simple,
		// such as an interface that contains only one method,
		// then the syntax of anonymous classes may seem unwieldy and unclear.
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Thread created using anonymous class!");
//			}
//		};
//		new Thread(runnable).start();

		Runnable runnable2 = () -> System.out.println("This is a lambda thread");
		new Thread(runnable2).start();

		Runnable runnable3 = () -> {
			System.out.println("lambda statement 1");
			System.out.println("lambda sstatement 2");
		};
		new Thread(runnable3).start();

		new Thread(() -> System.out.println("Thread using Lambda!")).start();

	}

	private static void threadUsingRunnable() {
		TestThread1 testThread1 = new TestThread1();
		Thread thread = new Thread(testThread1);
		thread.start();
	}

	private static void threadingWithAnonymousClass() {
		// thread implemented using an anonymous class
		// anonymous class : a class instance which does not have a name.

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread created using anonymous class!");
			}
		};
		thread.start();

		new Thread() {
			@Override
			public void run() {
				System.out.println("Thread created using anonymous class!");
			}
		}.start();
	}

	private static void traditionalThreading() {
		// The main method runs on a main thread.
		String threadNameString = Thread.currentThread().getName();
		System.out.println("S1 execution : " + threadNameString);
		// Child Thread 1
		TestThread testThread1 = new TestThread();
		// testThread1.someOtherOperation1();
		// TestThread.someOtherOperation1();
		// change the name of the testThread
		testThread1.start();
		testThread1.someOtherOperation();
		// Thread.currentThread().sleep(1000);
		testThread1.setName("C1");
		// Child Thread 2
		TestThread testThread2 = new TestThread();
		testThread2.setName("C2");
		testThread2.start();

	}
}

//Creating a child thread using the Thread Class
class TestThread extends Thread {
	@Override
	public void start() {
		System.out.println("Test this....");
		run();
	}

	@Override
	public void run() {
		String threadNameString = Thread.currentThread().getName();
		System.out.println("S2 execution : " + threadNameString);
	}

	public void someOtherOperation() {
		System.out.println("Some other operation");
	}

	public static void someOtherOperation1() {
		System.out.println("Some other operation");
	}
}

class TestThread1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread implemented using Runnable will not run....");

	}

}