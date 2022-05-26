package hw4JavaVariables;

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