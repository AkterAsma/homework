package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity{
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("ComputerLab is a non abstract/Implemented method");
	}

}