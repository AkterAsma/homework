package hw9Abstraction.copy;
/*
 * In Java only one keyword (extends) is used for the inheritance for Abstract Class.
 *An Abstract class can inherit other Abstract class or a regular class.
 *An Abstract class cannot inherit an Interface.
 *An Abstract class, we can inherit only one abstract class or a regular class.
 */

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("biochemistrylab is a non abstract method, we can also call it Implementated  ");
	}

	// Default constructor
	public MedicalSchool() {

	}
}