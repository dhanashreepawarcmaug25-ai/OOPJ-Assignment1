/*
3. Bank Transaction Check
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a
deposit (positive) or a withdrawal (negative).
Input:
Enter transaction amount: -2500
Output:
Withdrawal transaction.
*/
import java.util.Scanner;

public class Assign3{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int amount;
		
		System.out.print("Enter transaction amount: ");		
		amount=sc.nextInt();
		
		if(amount<0){
			System.out.println("Withdrawal transaction.");
		}
		else{
			System.out.println("Deposit transaction.");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign3.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign3
Enter transaction amount: -1000
Withdrawal transaction.

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign3
Enter transaction amount: 1000
Deposit transaction.
*/