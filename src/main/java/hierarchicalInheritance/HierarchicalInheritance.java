package hierarchicalInheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		GermanShepher GS = new GermanShepher();
		GS.name = "Tony";
		GS.Sound = "woof";
		GS.makeSound();
		GS.Bark();
		GS.Run();

		Cat C = new Cat();
		C.makeSound();
	}
}

class Animals {
	String name;
	String Sound;

	void makeSound() {
		System.out.println(Sound + " is the dog's natural voice");
	}
}

class Dogs extends Animals {

	void Bark() {
		System.out.println(name + " bark loudly.");
	}
}

class GermanShepher extends Dogs {

	String Name = "GShepher";

	void Run() {
		System.out.println(Name + " Run faster!");
	}
}

class Cat extends Animals {

	void makeSound() {
		System.out.println("Cat make sound ''Meow!");
	}
}
