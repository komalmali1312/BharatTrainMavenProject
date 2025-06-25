package assignments;

public class Assignment10_SortingArrays {

	public static void main(String[] args) {

//Given values are 12 ,34,11,36,87,98,93. Store the values in Array and Print second and third largest number.
		int[] numbers = { 12, 34, 11, 36, 87, 98, 93 };
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		// Print second and third largest number.
		System.out.println("second and third largest numbers are:");
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
	}

}
