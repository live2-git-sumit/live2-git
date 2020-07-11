package java7.fundamentals;

public class Debugging {

	public static String teString = "Hello";

	public static void main(String[] args) {
		int i = 10;
		m1(i);
	}

	public static void m1(int i) {
		System.out.println(i * i);
		m2(i);
		System.out.println("m1 completion");
	}

	public static void m2(int i) {
		System.out.println(i + i);
		System.out.println("m2 completion");
	}
}
