
public class Application {
	public static void main(String[] args) {

		Machine Machine1 = new Machine();
		Machine1.start();
		Machine1.stop();
		Car Car1 = new Car();
		System.out.println(Car1.toString());
		Car1.stop();
		Car1.start();
		Car1.showInfo();
	}
}
