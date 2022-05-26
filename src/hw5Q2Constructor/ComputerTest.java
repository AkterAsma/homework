package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// default constructor initialized.
		Computer computer = new Computer();
		// parameterized constructor initialized
		Computer computer02 = new Computer("Apple", "Mackbook Air", "MacOS Mojava", 800, 'A', false);
		Computer computer03 = new Computer("Dell", "Inspiron", "Windows 10 Pro", 900, 'A', true);

	}

}