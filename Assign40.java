/*
40. Discount on Purchase (Ternary)
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total
cost using ternary.
Input:
Enter purchase amount: 1200
Output:
Total cost after discount: 1080
*/

import java.util.Scanner;
public class Assign40
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int amount;
		System.out.print("Enter purchase amount: ");
		amount=sc.nextInt();
		float discount=amount*0.1f;
		float cost=amount-discount;
		
		String str= (amount>1000) ? ("Total cost after discount: " + cost)
		: "No Discount ";

		System.out.println(str);
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign40.java
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign40
Enter purchase amount: 1200
Total cost after discount: 1080.0
*/