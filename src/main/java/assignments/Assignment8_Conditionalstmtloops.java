package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_Conditionalstmtloops {

	public static void main(String[] args) {
//1.Create List collection to store all bank Transactions.
		List<Integer> Transactions = new ArrayList<>();
		Transactions.add(50000);
		Transactions.add(-2000);
		Transactions.add(3000);
		Transactions.add(-15000);
		Transactions.add(-200);
		Transactions.add(-300);
		Transactions.add(4000);
		Transactions.add(-3000);
		System.out.println(Transactions);

//1. Print total number of credit and debit transactions completed
//Print the total amount credited and debited in account		
		int creditTransactions = 0;
		int debitTransactions = 0;
		int Totalcreditedamount = 0;
		int Totaldebitedamount = 0;
		int TotalAmount = 0;
		int susptrancount = 0;
		for (int i = 0; i < Transactions.size(); i++) {
			if (Transactions.get(i) > 0)
			{
				creditTransactions++;
				Totalcreditedamount += Transactions.get(i);
				//Transaction with Amount and also print total number of suspicious transactions
				if (Transactions.get(i) > 10000) {
					System.out.println("Suspicious credit Transaction with Amount:" + Transactions.get(i));
					susptrancount++;
				}	
			}
			else
			{
				debitTransactions++;
				Totaldebitedamount += Transactions.get(i);
				//Transaction with Amount and also print total number of suspicious transactions
				if (Transactions.get(i) < -10000) {
					System.out.println("Suspicious debit Transaction with Amount:" + Transactions.get(i));
					susptrancount++;
				}
			}
			//Print total amount remaining at the end in Bank Account
			TotalAmount += Transactions.get(i);
		}
		System.out.println("total number of credit transactions completed:" + creditTransactions);
		System.out.println("total number of debit transactions completed:" + debitTransactions);
		System.out.println("total amount credited in account:" + Totalcreditedamount);
		System.out.println("total amount debited in account:" + Totaldebitedamount);
		System.out.println("Print total amount remaining at the end in Bank Account is: " + TotalAmount);
		System.out.println("print total number of suspicious transactions are:" + susptrancount);

	}
}
