/*
32. Positive, Negative, or Zero (Ternary)
Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator.
Input:
Enter a number: -12
Output:
Number is Negative
*/

import java.util.Scanner;

public class Assign32
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.print("Enter a number:");
		n=sc.nextInt();
		//Ternary Operators
		// variable = (condition) ? expressionTrue :  expressionFalse;
		
		
		String g = (n>0) ? "Number is Positive" : "Number is Negative";
		System.out.println(g);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign32
Enter a number:-12
Number is Negative

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign32
Enter a number:5
Number is Positive
*/