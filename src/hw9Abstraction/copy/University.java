package hw9Abstraction.copy;
/*
 * This is an Interface.
 * Only one keyword (extends) is used for the inheritance in Interface.
 * An Interface can only inherit other Interface.it can not inherit regular class or abstract class.
 * One Interface can inherit one or more than one Interface in Java.
 */

public interface University extends College {

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