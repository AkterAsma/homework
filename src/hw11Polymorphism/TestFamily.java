package hw11Polymorphism;
/*
 initialize all the methods in TestFamily class. Create another class Niece and inherit (extends) Sister. 

 */

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n^^^^^^From sister class^^^^^^");
		Sister sister = new Sister();
		sister.sister(); // void type method initialized here
		sister.sister(10, 20, 30, "4", 50, 60); // Void type parameterized method initialized here
		sister.sister(15, 25, 35, "5", 65); // Return type parameterized method initialized here
		Sister.sister(20, 40, 60, 80, 100); // Static type parameterized method initialized here
		sister.sister(11, 22, 33, 44, 55, "66"); // final type parameterized method initialized here
		
		
		
		System.out.println("\n^^^^^^From niece class^^^^^^");
		Niece niece =  new Niece();
		niece.sister();//void type method initialized here
		niece.sister(10, 20, 30, "4", 50, 60);// Void type parameterized method initialized here
		niece.sister(15, 25, 35, "5", 65);// Return type parameterized method initialized here

	
	
	
	
	
	}

}