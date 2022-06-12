package hw11Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This is a default method morgue from hospital interface");
	}

	public static void pharmacy() {
		System.out.println("This is a static method pharmacy from hospital interface");

	}
}