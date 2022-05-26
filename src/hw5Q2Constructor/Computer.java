package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() { // default constructor declared
		System.out.println("This is from default Constructor of Computer class.");
	}

	// parameterized constructor declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + brand + "\nModel: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice: " + price + "\nGrade: " + grade + "\nMade in USA: " + madeInUSA);
	}

	public Computer(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
}