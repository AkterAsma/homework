package hw8Inheritance;

//Animal class is the parent class
public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

//		Mammal, Reptile and Birds classes are the child class of the Animal class
		System.out.println("*********************");
		Mammal mammal = new Mammal();
		mammal.mamalInfo();
		mammal.animalInfo();

		System.out.println("*********************");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		// More than one derived class created from a single base class is called
		// Hierarchical Inheritance.
		System.out.println("*********************");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		/*
		 * Since Mammal, Reptile & Birds are extended to Animal class(Parent Class) So
		 * that we can call it single Inheritance.
		 */

		System.out.println("*********************");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mamalInfo();
		dog.animalInfo();

		System.out.println("*********************");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("*********************");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		/*
		 * Robin extends to Birds and Birds extends to Animal. Here one extended class
		 * created from another extended class. So we can call it multilevel Inheritance
		 */

		System.out.println("*********************");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mamalInfo();
		bullDog.animalInfo();

		System.out.println("*********************");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}

}