package assignments;

public class Assignment17_patterncode {

	public static void main(String[] args) {
		// This for loop is for Rows
		for (int i = 0; i < 5; i++) {
			// For loop for spaces
			for (int j = 5; j > i + 1; j--) {
				System.out.print(" ");
			}

			// For loop for * printing
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			// Move to the next line after each row

			System.out.println();
		}
	}
}