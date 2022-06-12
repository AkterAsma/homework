package hw11Abstraction;

public interface College {
	public void commomRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This is a default method dorm from college interface");
	}

	public static void studyRoom() {
		System.out.println("This is a static method studyRoom from college interface");

	}
}