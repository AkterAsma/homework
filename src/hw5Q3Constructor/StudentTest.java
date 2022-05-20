package hw5Q3Constructor;
/* Create another class StudentTest. Create object as many as you want under the main method. 
 * Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. 
 * in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade: <your grade> and Java Programmer? Ans: true.
 *  Organize the code. Push in the github. Paste your github link below.
 */

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		Student student02 = new Student("Asma Akter", 222, 'F', true, 3.5f);
		Student student03 = new Student("Raihan", 200, 'M', true, 4.5f);
	}

}
