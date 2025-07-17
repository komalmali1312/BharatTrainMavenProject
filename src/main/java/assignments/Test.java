package assignments;

import java.util.HashMap;

public class Test {
public static void main(String args[])
{
//Palindrome String
	/*String S="Sir".toLowerCase();
	String Rev="";
	for(int i=S.length()-1;i>=0;i--)
	{
	Rev=Rev+S.charAt(i);	
	}
	System.out.println(Rev);
	if(Rev.equals(S))
		System.out.println("String is Palindrome");
	else
		System.out.println("String is Not Palindrome");
	
	String S="KomalMali".toLowerCase();
	HashMap<Character,Integer> map1=new HashMap<>();
	for(int i=0;i<S.length();i++)
	{
	if(!map1.containsKey(S.charAt(i)))
	{
		map1.put(S.charAt(i), 1);
	}
	else
	{
		map1.put(S.charAt(i), map1.get(S.charAt(i))+1);
	}
	}
	System.out.println(map1);*/
	
	String S="I Love Java Python Java Love";
	String Sep[]=S.split(" ");
	String Unique="";
	for(int i=0;i<Sep.length;i++)
	{
	if(!Unique.contains(Sep[i]))
	{
		Unique=Unique+Sep[i];	
	}
	if(!Unique.isEmpty())
		Unique=Unique+" ";
	}
	System.out.println(Unique);
}


}