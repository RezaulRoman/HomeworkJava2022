package hw_08Q2Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		//parents class
		Animal animal = new Animal();
		animal.animalInfo(); 
		System.out.println("\n................\n");
		//single Inheritance (child class)
		// here animal is parents class.
		// here mammal is child class.
		// here mammal can inherits animal(parents class) property by extends keyword.
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo(); 
		mammal.animalInfo();
		System.out.println("\n................\n");
		 		
		Dog dog = new Dog();
		dog.dogInfo();     
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("\n.............\n");
		//Multi-Level Inheritance.
		//here bulldog can extends dog,dog can extends mammal,
		//mammal can extends animal its call multi-level inheritance.
		
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();     
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n..................\n");
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n.............\n");
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("\n..............\n");
		
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("\n.................\n");
		
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
        System.out.println("\n...............\n");
        
        Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
	}
}
