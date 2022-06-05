package hw9Abstraction.copy;
/*
 *In Java only one keyword (extends) is used for the inheritance for a regular Class.
 *A regular class can inherit other regular class or an abstract class.
 *A regular class can not inherit an Interface.
 * A regular class can inherit only one regular class or an abstract class.
 */

public class ColumbiaUniversity extends MedicalSchool {
	// public abstract void chemistry (); (we cannot create an abstract method in a
	// regular class)
	public void biology() {
		System.out.println("Biology is a non abstract method");
	}

	// Default Constructor
	public ColumbiaUniversity() {

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}
}