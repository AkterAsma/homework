package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	// Declared variables
	public String birthMonth;
	public int age;

	// Default constructor
	public Daughter() {

		super("Anizul", 55, 'M', false);
		super.fatherInfo("Anizul", 50, 'M', false);
		super.familyName = "Haque";

		System.out.println("The family name is: " + familyName);
		System.out.println("This is default constructor from Daughter class");
	}

	// Parameterized constructor
	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth: " + birthMonth + "\nAge: " + age);
	}

	// Void type method
	public void daughter() {
		super.father();
		System.out.println("This is from void method of daughter class");
	}

	// Parameterized method
	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nBirthMonth: " + birthMonth + "\nAge: " + age);

	}

}