/*
31. Greatest of Two Numbers (Ternary)
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest
using a ternary operator.
Input:
Enter first number: 45
Enter second number: 30
Output:
Greatest number: 45
*/

import java.util.Scanner;

public class Assign31
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int n,m;
		System.out.print("Enter first number:");
		n=sc.nextInt();
		System.out.print("Enter second number:");
		m=sc.nextInt();
		//Ternary Operators
		// variable = (condition) ? expressionTrue :  expressionFalse;
		
		
		String g = (n>m) ? ("Greatest number: " + n) : ("Greatest number: " + m);
		System.out.println(g);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign31.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign31
Enter first number:45
Enter second number:30
Greatest number: 45
*/