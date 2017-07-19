class Person {

	// private makes these variables hidden to outside or to be used by any other
	// class
	// Normally in a class the methods are exposed to outside and not the internal
	// variables
	// We can use the setters (methods setName and setAge) to set the variables
	private int age;
	private String name;

	public void setName(String name) {
		// name = newName;
		this.name = name;
	}

	public void setAge(int age) {
		// age = newAge;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	public void setInfo(int age, String name) {
		setName(name);
		setAge(age);
	}
}

public class Application {
	public static void main(String[] args) {

		Person person1 = new Person();
		// person1.name = "Zaheer";
		// person1.age = 33;

		person1.setName("Zaheer");
		person1.setAge(35);

		System.out.println(person1.getAge());
		System.out.println(person1.getName());

		person1.setInfo(46, "Hussnain");

		System.out.println(person1.getAge());
		System.out.println(person1.getName());
	}

}
