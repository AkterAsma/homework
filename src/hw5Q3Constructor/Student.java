package hw5Q3Constructor;

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

	public Student(String stNameString, int stID) {
		this.stNameString = stNameString;
		this.stID = stID;
	}

	public Student(int stID, String stNameString) {
		this.stNameString = stNameString;
		this.stID = stID;
	}

}