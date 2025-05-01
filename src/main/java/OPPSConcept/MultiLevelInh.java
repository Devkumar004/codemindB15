package OPPSConcept;

public class MultiLevelInh {

	public static void main(String[] args) {
		GermanShepher GS = new GermanShepher();
	GS.name = "Tony";
		GS.Sound = "woof";
		GS.makeSound();
		GS.Bark();
		GS.Run();
	}
}
class Animals {
	String name;
	String Sound;

	void makeSound() {
		System.out.println(Sound + " is the dog's natural voice");
	}
}
class Dogs extends Animal {

	void Bark() {
		System.out.println(name + " bark loudly.");
	}
}
class GermanShepher extends Dog {
  
	String Name="GShepher";
    void Run() {
        System.out.println(Name+" Run faster!");
    }
}