import java.util.Scanner;
public class BookSort {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get input, separated by commas
		String[] callNumbers = keyboard.nextLine().split(",");
		
		// Sort the inputs
		
		// Print sorted list
		for (int i = 0; i < callNumbers.length; ++i) {
			System.out.println(callNumbers[i]);
		}
	}
}
