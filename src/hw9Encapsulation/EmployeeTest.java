package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Anannya");
		employee.setAge(25);
		employee.setSex('M');
		employee.setUsCitizen(false);

		System.out.println("Employee Info \n\bEmployee name :" + employee.getName() + "\n\bEmployee age: " + employee.getAge() + "\n\bEmployee sex: "
				+ employee.getSex() + "\n\bEmployee citizenship: " + employee.isUsCitizen());

	}

}
