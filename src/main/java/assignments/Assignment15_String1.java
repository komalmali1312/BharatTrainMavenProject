package assignments;

public class Assignment15_String1 {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
//1. Count the total number of words in the sentence.
		String[] splittedsentense = sentence.split(" ");
		// Simple way to count total number of words in the sentence
		System.out.println("total number of words in the sentence:" + splittedsentense.length);
		int Totalwordscount = 0;
		for (int i = 0; i < splittedsentense.length; i++) {
			Totalwordscount++;
		}
		System.out.println("total number of words in the sentence:" + Totalwordscount);
//Print the sentence words in reverse order.

		String result = "";
		for (int i = 0; i < splittedsentense.length; i++) {
			String Seprevword = "";
			for (int j = splittedsentense[i].length() - 1; j >= 0; j--) {
				Seprevword = Seprevword + splittedsentense[i].charAt(j);
			}
			result = result + Seprevword;

			if (!result.isEmpty())
				result = result + " ";
		}
		System.out.println(result);

//Convert the first character of each word to uppercase and print original sentence	
		String result2 = "";
		for (int i = 0; i < splittedsentense.length; i++) {
			String word = "";

			char c = splittedsentense[i].charAt(0);
			if (c >= 'a' && c <= 'z') {
				c = Character.toUpperCase(c);

			}
			word = word + c;
			for (int j = 1; j <= splittedsentense[i].length() - 1; j++) {
				word = word + splittedsentense[i].charAt(j);
			}
			result2 = result2 + word;
			if (!result2.isEmpty())
				result2 = result2 + " ";
		}
		System.out.println(result2);
	}
}

