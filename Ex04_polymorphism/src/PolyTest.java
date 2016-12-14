
public class PolyTest {
	int count = 0;
	public static int testNumber = 1;

	public static void makeSoundTest(Animal animal){
		animal.makeSound();
	}
	public static void main(String[] args) {
		Cat catInstance = new Cat();
		Dog dog = new Dog();

//		makeSoundTest(cat);
		makeSoundTest(dog);
		Animal a = new Cat();
		a.makeSound();
		
		Animal a1 = new Animal();
	}

}
