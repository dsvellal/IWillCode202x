package gitpacktest;

public class ConstructorsAndMethods {

	// TODO Auto-generated method stub

	private String name;
	private int age;
	private String designation;

	// Default stuff - constructor
	// has access modifier, name - nameOfTheClass (compulsory), arguments - optional
	public ConstructorsAndMethods() {
		name = "Datta";
		age = 34;
		designation = "Competency specialist";
	}

	// Non-default constructor
	public ConstructorsAndMethods(String myName, int myAge, String myDesignation) {
		name = myName;
		age = myAge;
		designation = myDesignation;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getDesignation() {
		return this.designation;
	}
}
