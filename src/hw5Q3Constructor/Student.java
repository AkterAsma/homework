package hw5Q3Constructor;
/*Create a package name "hw5Q3Constructor" in your Home Work project. Inside the package, a) Create a class "Student". 
 * Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade (as float). 
 * Declare default constructor and only one parameterized constructor (use select variables--right click--source to create it). 
 * Use only one System.out.println() in parameterized constructor to declare the above variables. 
 * Create another class StudentTest. Create object as many as you want under the main method. 
 * Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. 
 * in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade: <your grade> and Java Programmer? Ans: true.
 *  Organize the code. Push in the github. Paste your github link below. 
 */

public class Student {
	public String stNameString;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor of Student class.");
	}

	public Student(String stNameString, int stID, char sex, boolean isProgrammer, float grade) {
		this.stNameString = stNameString;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stNameString + "\nID: " + stID + "\nSex: " + sex + "\nGrade: " + grade
				+ "\nJava Programmer: " + isProgrammer);
	}

}
