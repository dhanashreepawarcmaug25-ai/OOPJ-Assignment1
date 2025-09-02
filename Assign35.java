/*
35. Pass/Fail Check (Ternary)
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35).
Input:
Enter marks: 28
Output:
Fail
*/

import java.util.Scanner;

public class Assign35
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int marks;
		System.out.print("Enter marks:");
		marks=sc.nextInt();
		//Ternary Operators
		
		String g = (marks>=36) ? "Pass" : "Fail";
		System.out.println(g);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign35
Enter marks:82
Pass

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign35
Enter marks:32
Fail
*/