package assignments;

public class Assignment7_ConditionalStatements {

public static void main(String[] args) {
	String customerName = "John Doe";
	int creditScore = 720;
	double income = 55000.0;
	boolean isEmployed = true;
	double debtToIncomeRatio = 35.0;
	
//If the credit score is above 750, the loan is automatically approved.
if(creditScore>750)
System.out.println("The loan is automatically approved");

//If the credit score is between 650 and 750, additional checks are performed.
     		else if(creditScore>=650 && creditScore<=750)
     		{
     			System.out.println("additional checks are performed");
     			//If the customer’s income is at least 50,000, the system checks whether the customer is employed.
     			if(income>=50000)
     			{
     			System.out.println("The loan to be considered.");
     			if(isEmployed)
     			{
     			System.out.println("The loan to be considered.");
     			//If the customer is employed, the system checks the debt-to-income (DTI) ratio.
     			//If the DTI ratio is less than 40%, the loan is approved.
     			if(debtToIncomeRatio<40)
     			System.out.println("The loan is approved");
     			//If the DTI ratio is 40% or greater, the loan is denied.
     			else
     			System.out.println("The Loan is Denied");		
     			}
     			}
     			//If the customer is unemployed, the loan is denied.
     			else
     			System.out.println("The Loan is Denied");	
              }

//If the credit score is below 650, the loan is denied.	
else
System.out.println("The loan is denied");	
}
}
