package OPPSConcept;

public class SingleInheritance {

	public static void main(String[] args) {
		Dog D = new Dog();
		D.name = "Tony";
		D.Sound = "woof";
		D.makeSound();
		D.Bark();
	}
}
class Animal {
	String name;
	String Sound;

	void makeSound() {
		System.out.println(Sound + " is the dog's natural voice");
	}
}
class Dog extends Animal {

	void Bark() {
		System.out.println(name + " bark loudly.");
	}
}
