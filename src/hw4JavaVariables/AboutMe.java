package hw4JavaVariables;

/*	Create a package name "hw4JavaVariables" inside the HW project. Create a Class name "AboutMe". 
 * Declare String and other 8 types of variable. 
 * Create a constructor and Give a sysout inside Constructor which will print "This is all about us: ". 
 * Then Create a method name aboutMe. Inside the method -use String and other 8 types of variables inside sysout to define a person's meaningful info. 
 */
public class AboutMe {
	public String declare;// variable declared
	public String myName;
	public byte age;
	public short mySalary;
	public int myAcoountNumber;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean allInfo;

//constructor declared
	public AboutMe() {
		System.out.println("\nThis is all about us");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("My name is " + myName + "\nMy age: " + age + "\nMy salary: " + mySalary
				+ "\nMy account number: " + myAcoountNumber + "\nMy bank balance:" + myBankBalance + "\nMy height: "
				+ myHeight + "\nMy grade: " + myGrade + "\nMy sex: " + sex + "\nAbove all info: " + allInfo);

	}

}
