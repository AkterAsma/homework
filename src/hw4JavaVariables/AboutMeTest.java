package hw4JavaVariables;
/*Create another class AboutMeTest. Instantiate AboutMe class under main method. 
 * Initialize variables and call the method by object. I expect print outcome for 2 person, one for you and another for your best friend Alex. 
 * give a single line comment where a variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized. 
 * Follow indentation by Organizing the code and paste below. 
 * [Mark distribution (125) : using variable --10, Create a method and constructor - 20, instantiate class - 10, 
 * initialize variables and call methods for you and Alex= 20,  variable is declared and initialized, constructor is declared and initialized, 
 * method is implemented and initialized -- 15, organize code and other-- 30]. push your code to github -- 20. share the package link below.
 */

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe asma = new AboutMe(); // constructor initialized

		asma.myName = "Asma Akter"; // variables initialized
		asma.age = 25;
		asma.mySalary = 20000;
		asma.myBankBalance = 1000000;
		asma.myHeight = 5.2f;
		asma.myGrade = 3.2;
		asma.myAcoountNumber = 2222222;
		asma.sex = 'F';
		asma.allInfo = false;
		asma.aboutMe(); // method initialized

		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.age = 27;
		alex.mySalary = 2000;
		alex.myBankBalance = 1200000;
		alex.myHeight = 5.7f;
		alex.myGrade = 2.2;
		alex.myAcoountNumber = 233333;
		alex.sex = 'M';
		alex.allInfo = false;
		alex.aboutMe();

	}
}