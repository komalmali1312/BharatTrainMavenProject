package assignments;

public class Assignment16_String2 {

	public static void main(String[] args) {
//Write a program to search for all occurrences of a “Java” word in the paragraph and print their indexes.		
//1. Divide into multiple words
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String[] sepwords=paragraph.split(" ");
		int javaocccount=0;
//2. Find total number of occurrences		
		for(int i=0;i<sepwords.length;i++)
		{
			if(sepwords[i].equalsIgnoreCase("java"))
				javaocccount++;
		}
		System.out.println("Total number of occurrences of Java word:"+javaocccount);
//3. Print count and Indexes of the word
		for(int i=0;i<sepwords.length;i++)
		{
			if(sepwords[i].equalsIgnoreCase("java"))
				System.out.println("Indexes of the word java is:"+i);	
		}
	}

}
