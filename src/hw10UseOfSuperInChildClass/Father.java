package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is from Default constructor");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nName: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUsCitizen: " + usCitizen);
	}

	public void father() {
		System.out.println("This is a void type method");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nName: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUsCitizen: " + usCitizen);

	}

}