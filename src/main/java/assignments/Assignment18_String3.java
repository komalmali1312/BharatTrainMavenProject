package assignments;

public class Assignment18_String3 {
	//Separatly created method to check palindrome status of multiple strings just by passing string input
	public static boolean CheckPalindrome(String s) {
		//Here removing all non-alphanumeric(alphanumeric means Alphabets and Numbers)
		String Updated = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		//System.out.println(Updated);
		//For loop upto half length of string
		for (int i = 0; i < Updated.length() / 2; i++) {
			if (Updated.charAt(i) != (Updated.charAt(Updated.length() - i - 1))) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String Input1 = "A man, a plan, a canal: Panama";
		String Input2 = "race a car";
		System.out.println("String Input1 Palindrome Status is:" + CheckPalindrome(Input1));
		System.out.println("String Input2 Palindrome Status is:" + CheckPalindrome(Input2));
	}

}
