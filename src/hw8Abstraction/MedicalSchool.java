package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("biochemistrylab is a non abstract method, we can also call it Implementated  ");
	}

	// Default constructor
	public MedicalSchool() {

	}
}