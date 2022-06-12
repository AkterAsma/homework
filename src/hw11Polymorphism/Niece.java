package hw11Polymorphism;

public class Niece extends Sister{
	
	@Override
	// void type method-1
		public void sister() {
			System.out.println("This is a void type method from Niece class.");
		}
	@Override
		// Void type parameterized method-2
		public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
			int total1 = age1 + age2 *5 + age3 + Integer.parseInt(age4) + age5*5+ age6;
			System.out.println("Total age of sister from Niece class: " + total1);
		}
	@Override
		// Return type parameterized method-3
		public int sister(int age1, int age2, int age3, String age4, int age5) {
			int total2 = age1/1 + age2 + age3 + Integer.parseInt(age4) + age5+2;
			System.out.println("Total age of sister Niece class : " + total2);
			return total2;
		}
		/*
		 * I couldn't override Static and final method, Because these two methods cannot be overridden.
		 * Method overriding-When different methods exist with the same method name with same parameters or signature 
		 * But with different syntax or logic, it is called method overriding. 
		 * Method Overriding occurs during run time.
	     */
}