/*
8. Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount
as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080

*/

import java.util.Scanner;

public class Assign8
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int amount;
		float cost;
		float discount;
		
		System.out.print("Enter total purchase amount: ");
		amount=sc.nextInt();
		
		discount=amount*0.1f;	
		
		cost=amount-discount;
		
		System.out.print("Final cost after discount: "+ cost);		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign8.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign8
Enter total purchase amount: 1200
Final cost after discount: 1080.0
*/