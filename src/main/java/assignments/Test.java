package assignments;




public class Test {
static boolean isPrime(int n)
{
if(n<2)
	return false;
for(int i=2;i*i<=n;i++)
{
	if(n%i==0)
		return false;
}
return true;
}
	public static void main(String[] args) {
	//Fibbonnacy series 
	int a=0,b=1,fiboutput=0,count=10;
	for(int i=0;i<count;i++)
	{
		fiboutput=a+b;
		a=b;
		b=fiboutput;
	
System.out.print(fiboutput+" ");
	}
	//prime number
		if(isPrime(12))
				System.out.println("Yes it is prime");
		else
			System.out.println("Yes it is not prime");
		
		//Palindrome string check
		String s="Madam".toLowerCase();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
		reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		if(reverse.equals(s))
			System.out.println("It is Palindrome");
		else
			System.out.println("It is Not Palindrome");
		
	}

}
