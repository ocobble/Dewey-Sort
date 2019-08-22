import java.util.Scanner;
public class BookSort {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Get input, separated by commas
		String[] callNumbers = keyboard.nextLine().split(",");
		
		// Sort the inputs
		for (int i = 1; i < callNumbers.length; ++i) {
			String key = callNumbers[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && key.compareTo(callNumbers[j]) < 0) { 
                callNumbers[j + 1] = callNumbers[j]; 
                j = j - 1; 
            } 
            callNumbers[j + 1] = key; 
		}
		
		// Print sorted list
		for (int i = 0; i < callNumbers.length; ++i) {
			System.out.println(callNumbers[i]);
		}
	}
	
	public static int bookComparator(String book1, String book2) {
		
		// Tokenize pieces of call numbers
		
		String[] callNumber1 = book1.split(" ");
		String[] callNumber2 = book2.split(" ");
		
		
		return 0;
	}
}
