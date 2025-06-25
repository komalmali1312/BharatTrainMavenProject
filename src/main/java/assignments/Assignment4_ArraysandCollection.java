package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_ArraysandCollection {

	public static void main(String[] args) {
//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
	ArrayList<Integer> mylist=new ArrayList<>();
	mylist.add(5000);
	mylist.add(45000);
	mylist.add(15000);
	mylist.add(95000);
	mylist.add(25000);
	int area3=mylist.get(2);
	int area4=mylist.get(3);
	int Totalarea=area3+area4;
	System.out.println("total area of the 3rd and 4th cities is:"+Totalarea);
//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
	Set myset=new HashSet();
	myset.add("The Great Wall of China");
	myset.add("Taj Mahal");
	myset.add("Mini Kashmir");
	myset.add("Mahabaleshwar");
	myset.add("Gate Of India");
	myset.add("Ajantha Caves");
	myset.add("Dubai");
	myset.add("Paris Musiam");
	myset.add("CharMinar");
	myset.add("Ram Mandir");
	System.out.println(myset);
	System.out.println(myset.size());
//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and6th Value.
	int[] numbers= {23,11,44,55,2,0,9,54,66,10};
	int avg=(numbers[4]+numbers[5])/2;
	System.out.println(avg);
//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
    List movies=new ArrayList();
    movies.add("Avtar");
    movies.add("Avengers");
    movies.add("Star Wars- The Force Awakens");
    movies.add(" Infinity War");
    movies.add("Titanic");
    System.out.println("Third movie from lit is:"+movies.get(2));
	}

}
