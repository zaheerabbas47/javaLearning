
public class Car extends Machine {
	public void windshield() {
		System.out.println("Wiping windscreen");
	}

	
	@Override
	public void start() {
		System.out.println("Car started");
	}


	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
