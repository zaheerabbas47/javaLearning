import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		/*
		 * //Create scanner object Scanner input = new Scanner(System.in);
		 * 
		 * //Output the Prompt System.out.println("nter your input: ");
		 * 
		 * //Take user input String line = input.nextLine();
		 * 
		 * //Print your input System.out.println("You entered : " + line);
		 * 
		 * Scanner input1 = new Scanner(System.in);
		 * 
		 * System.out.println(" Enter an integer : ");
		 * 
		 * int value = input1.nextInt();
		 * 
		 * System.out.println("you entered : " + value);
		 * 
		 * Scanner input3 = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a floaing point: ");
		 * 
		 * double value1 = input3.nextDouble();
		 * 
		 * System.out.println("You entered this floating point : " + value1);
		 */

		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter an integer: ");
		if (input.hasNextInt()) {
			a = input.nextInt();
			System.out.println("You entered an integer: " + a);
		}
		else {
			System.out.println("!!!! You did not enter an integer. I am exiting");
		}
	}
}