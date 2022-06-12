package hw11Abstraction;
/*
 *In Java only one keyword (extends) is used for the inheritance for a regular Class.
 *A regular class can inherit other regular class or an abstract class.
 *A regular class can not inherit an Interface.
 * A regular class can inherit only one regular class or an abstract class.
 *  A regular class can inherit one or more than one interface by using Implements keyword.
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
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

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commomRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	public static void Columbia () {
		
	}
}