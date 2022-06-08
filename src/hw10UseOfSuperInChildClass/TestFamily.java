package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("*****Default constructor initialized from Daughter class*****");
		Daughter daughter = new Daughter();

		System.out.println("*****Parameterized constructor initialized from Daughter Class*****");
		Daughter daughter2 = new Daughter("November", 25);

		System.out.println("*****Void type method initialized from Daughter Class*****");
		daughter.daughter();

		System.out.println("*****Parameterized method initialized from Daughter Class*****");
		daughter.daughterInfo("November", 25);

		System.out.println("*****Default constructor initialized from Father class*****");
		Father father = new Father();

		System.out.println("*****Parameterized constructor initialized from Father Class*****");
		Father father2 = new Father("Anizul", 55, 'M', false);

		System.out.println("*****Void type method initialized from Father Class*****");
		father.father();

		System.out.println("*****Parameterized method initialized from Father Class*****");
		father.fatherInfo("Anizul", 50, 'M', false);
	}

}