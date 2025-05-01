package abstraction;

abstract class AbstractionExample {
	public static void main(String[] args) {
		Dog myDog = new Dog();
	}
}
abstract class Animal {
	abstract void makeSound();

	{
		System.out.println("Animal walk slowy");
	}

	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal {

	@Override
	void makeSound() {
		System.out.println("Woof!");
	}

	void walk() {
		System.out.println("These are the domestic animals");
	}

	public Dog() {
		super();
		System.out.println("Child class dog");
	}

}
