class Robot {
	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping " + height + " meters");
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + direction + " " + distance + " meters");
	}
}

public class Application {
	public static void main(String[] args) {
		Robot robot1 = new Robot();
		robot1.speak("Hi I am sam");
		robot1.jump(32);
		robot1.move("West", 350.45);
		robot1.speak("Hello Hello Hello");
		String str1 = "Hello there";
		robot1.speak(str1);
		int number = 45;
		robot1.jump(number);
		System.out.println("This is WOKE Change");
	}
}
