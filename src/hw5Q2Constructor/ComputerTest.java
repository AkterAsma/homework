package hw5Q2Constructor;
/*b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. 
 * Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class.
 *  Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in USA? Ans: false.
 *   I want the third outcome in console for your configuration.  (Assume you are a Windows user even you are not). 
 *   Organize your code. Push in the github. Paste your github link below.50 points
 */

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Computer();// default constructor initialized
		Computer computer02 = new Computer("Apple", "Mackbook Air", "MacOS Mojava", 800, 'A', false);//parameterized constructor initialized
		Computer computer03 = new Computer("Dell", "Inspiron", "Windows 10 Pro", 900, 'A', true);

	}

}
