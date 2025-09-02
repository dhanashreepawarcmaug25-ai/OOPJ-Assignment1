/*
34. Voting Eligibility (Ternary)
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator.
Input:
Enter age: 20
Output:
Eligible to vote

*/

import java.util.Scanner;

public class Assign34
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int age;
		System.out.print("Enter age:");
		age=sc.nextInt();
		//Ternary Operators
		
		String g = (age>=18) ? "Eligible to vote" : "Not Eligible to vote";
		System.out.println(g);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign34
Enter age:40
Eligible to vote

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign34
Enter age:12
Not Eligible to vote
*/