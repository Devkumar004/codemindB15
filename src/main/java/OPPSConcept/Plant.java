package OPPSConcept;

class Plant {

	String Name;
	String Use;
	int Age;

	public Plant(String Name, String Use, int Age) {
		this.Name = Name;
		this.Use = Use;
		this.Age = Age;
	}

	void Growth() {
		System.out.println(Name + " plant growth very slowly.");
	}

	void Life() {
		System.out.println(Name + " plant use for " + Use + " use, and age is " + Age + " Years");
	}

	public static void main(String[] args) {

		Plant P1 = new Plant("Tulsi", "Medicinal", 50);
		System.out.println("Plant name : " + P1.Name);
		System.out.println("Plant use : " + P1.Use);
		System.out.println("Plant age : " + P1.Age);
		P1.Growth();
		P1.Life();
	}
}
