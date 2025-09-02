/*
37. Leap Year Check (Ternary)
Scenario: Take a year as input and check if it is a leap year using ternary operator.
Input:
Enter year: 2024
Output:
Leap Year
*/

import java.util.Scanner;
public class Assign37
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int y;
		System.out.print("Enter year: ");
		y=sc.nextInt();
		
		String g= (y%4==0) ? "Leap year ":"Non-Leap year ";
		
		System.out.println(g);
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign37.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign37
Enter year: 2024
Leap year
*/