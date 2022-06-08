package hw10Abstraction;
/*
 * This is an Interface.
 * Only one keyword (extends) is used for the inheritance in Interface.
 * An Interface can only inherit other Interface.it can not inherit regular class or abstract class.
 * One Interface can inherit one or more than one Interface in Java.
 *We cannot use implements keyword in Interface 
 */

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();
	/*
	 * public University();{ }
	 * "We cannot create Constructor in Interface, also Interface cannot be instantiated."
	 */

	public default void gymnasium() {
	}

	public static void library() {
	}

}