package hw10Abstraction;
/*
 * In Java only one keyword (extends) is used for the inheritance for Abstract Class.
 *An Abstract class can inherit other Abstract class or a regular class.
 *An Abstract class cannot inherit an Interface.
 *An Abstract class, we can inherit only one abstract class or a regular class.
 *Abstract class can inherit one or more than one Interface by using implements key word.
 */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("biochemistrylab is a non abstract method, we can also call it Implementated  ");
	}

	// Default constructor
	public MedicalSchool() {

	}
}