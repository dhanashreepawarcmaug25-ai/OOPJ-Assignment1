/*
33. Even or Odd (Ternary)
Scenario: Take a number and check if it is even or odd using ternary operator.
Input:
Enter a number: 17
Output:
Number is Odd

*/

import java.util.Scanner;

public class Assign33
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.print("Enter a number:");
		n=sc.nextInt();
		//Ternary Operators
		
		String g = (n%2==0) ? "Number is Even" : "Number is Odd";
		System.out.println(g);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign33.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign33
Enter a number:17
Number is Odd
*/