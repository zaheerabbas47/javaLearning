class Machine {

	private String name;
	private int code;

	public Machine() {
		this("Bernee", 67); // calling complex constructor from another constructor. This has to be the
							// first line
		System.out.println("Constructor Running");
	}

	public Machine(String name) {
		System.out.println("2nd Constructor Running");
		this.name = name;
	}

	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("3rd Constructor running");
	}
}

public class Application {
	public static void main(String[] args) {
		Machine newMachine = new Machine();
		Machine newMachine2 = new Machine("Bertie");
		Machine newMachine3 = new Machine("Bertie", 34);
	}

}
