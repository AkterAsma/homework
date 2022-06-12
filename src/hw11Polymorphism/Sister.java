package hw11Polymorphism;

public class Sister {
	
	

	// void type method-1
	public void sister() {
		System.out.println("This is a void type method.");
	}

	// Void type parameterized method-2
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age of sister: " + total1);
	}

	// Return type parameterized method-3
	public int sister(int age1, int age2, int age3, String age4, int age5) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Total age of sister: " + total2);
		return total2;
	}

	// Static type parameterized method-4
	public static int sister(int age1, int age2, int age3, int age5, int age6) {
		int total3 = age1 + age2 + age3 + age5 + age6;
		System.out.println("Total age of sister: " + total3);
		return total3;

	}

	// final type parameterized method-5
	public final int sister(int age1, int age2, int age3, int age5, int age6, String age4) {
		int total4 = age1 + age2 + age3 + age5 + age6 + Integer.parseInt(age4);
		System.out.println("Total age of sister: " + total4);
		return total4;

	}
	/*
	 * Method overloading- When different methods exist with the same method name
	 * but with different parameters or signatureit is called method overloading.
	 * Method Overloading occurs during compile time. Method overloading has
	 * Different name: Early binding or static binding or compile time polymorphism
	 */
}