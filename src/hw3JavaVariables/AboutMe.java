package hw3JavaVariables;

/*Create a package name "hw3JavaVariables" inside the Home work project, Create a Class name "AboutMe". 
 Declare one type of variable(only one, so you know declare vs initialize), 
 and initialize String and other 8 types of variable (you can try to give a different name from mine).
 Instantiate AboutMe class under main method and call few variables (not all) by object
  (you can use String concatenation to make it more meaningful outcome).
 Give a single line comment where a variable is declared and where initialized (Example: // Variable declared).
 Follow indentation by Organizing the code and paste below.
 */

public class AboutMe {
	public String declare;// variable declared
	public String myName = "Asma akter";// variable initialized
	public byte age = 25;
	public short mySalary = 32200;
	public int myAcoountNumber = 222555888;
	public long myBankBalance = 1234567891011121314l;
	public float myHeight = 5.213456f;
	public double myGrade = 4.73123456789141516;
	public char sex = 'F';
	public boolean allInfo = false;

	public static void main(String[] args) {
		AboutMe object = new AboutMe();
		System.out.println(
				"In this class we are learning about variables, How to call them inside main method by creating an object. \n\bMy name is: "
						+ object.myName + "\n\bMy age: " + object.age + "\n\bMy height: " + object.myHeight
						+ "\n\bMy sex: " + object.sex + "\n\bAll the information: " + object.allInfo);

	}

}
