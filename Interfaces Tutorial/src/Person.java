
public class Person implements Info{
	private String name;
	
	
	
	public Person(String name) {
		this.name = name;
		System.out.println(name);
	}

	public void greet() {
		System.out.println("Hello");
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("The name of the Person is: " + name);
	}
}
