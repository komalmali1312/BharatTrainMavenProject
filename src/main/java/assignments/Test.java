package assignments;

import java.util.HashMap;

public class Test {
public static void main(String args[])
{
/*int a=10;
int b=20;
int temp=0;
System.out.println("Value of a before swapping are"+a);
System.out.println("Value of a before swapping are"+b);
temp=b;
a=a+b;
b=a-b;
a=temp;
System.out.println("Value of a before swapping are"+a);
System.out.println("Value of a before swapping are"+b);*/
	String s="Komal";
	String rev = null;
	
	for(int i=s.length()-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}


