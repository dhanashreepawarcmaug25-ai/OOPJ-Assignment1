/*
21. Day of the Week (Ternary)
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
Input:
Enter day number: 3
Output:
Day is Wednesday
*/

import java.util.Scanner;

public class Assign21
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.print("Enter day number:");
		n=sc.nextInt();
		
		//Ternary Operators
		// variable = (condition) ? expressionTrue :  expressionFalse;
		//String result = (n < 7) ? "" : "";
		
		String result = (n==1) ? "Monday" :
						(n==2) ? "Tuesday" :
						(n==3) ? "Wednesday" :
						(n==4) ? "Thursday" :
						(n==5) ? "Friday" :
						(n==6) ? "Saturday" :
						(n==7) ? "Sunday" : "ERROR" ;
						
		System.out.println("Day is " + result);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign21.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign21
Enter day number:2
Day is Tuesday

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign21
Enter day number:6
Day is Saturday

*/