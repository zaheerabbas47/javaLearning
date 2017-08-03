
public class Application {
	public static void main(String[] args) {
		Person Person1 = new Person("Bob");
		Machine Machine1 = new Machine();
		Machine1.start();
		
		Info Info1 = new Machine();
		Info1.showInfo();
		
		Info Info2 = Person1;
		Info2.showInfo();
		
		System.out.println();
		
		outputInfo(Person1);
		outputInfo(Machine1);
	}
	
	public static void outputInfo(Info info) {
		info.showInfo();
	}
}
