/*
25. Message Based on Number (1–5)
Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu
selection.
Input:
Enter a number: 3
Output:
You selected option 3.

*/

import java.util.Scanner;

public class Assign25
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.print("Enter a number:");
		n=sc.nextInt();
		
		switch(n)
		{			
			case 1:
				System.out.println("You selected option 1");
				break;
			case 2:
				System.out.println("You selected option 2");
				break;
			case 3:
				System.out.println("You selected option 3");
				break;
			case 4:
				System.out.println("You selected option 4");
				break;
			case 5:
				System.out.println("You selected option 5");
				break;
			
			default:
				System.out.println("Not in 1 to 5!");
		}
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign25.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign25
Enter a number:5
You selected option 5
*/