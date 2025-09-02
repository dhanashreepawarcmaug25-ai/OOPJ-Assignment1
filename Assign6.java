/*
6. Leap Year Check for a Birthday
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input
and check if it’s a leap year.
Input:
Enter year: 2024
Output:
2024 is a leap year
*/
import java.util.*;

public class Assign6
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int year;
		System.out.print("Enter year: ");
		year = sc.nextInt();
		
		if(year%4==0){
			System.out.print(year + " Is a Leap Year");
		}
		
		else{
			System.out.print(year + " Is Not a Leap Year");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign6.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign6
Enter year: 2000
2000 Is a Leap Year
*/