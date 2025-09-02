/*
50. Divisibility by 2, 3, 5 with Custom Messages
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each.
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5
*/

import java.util.Scanner;

public class Assign50
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.print("Enter number: ");
		a=sc.nextInt();
		
		if(a==0){
			System.out.print("Number is zero");
		}
		
		else
		{
			
			if(a%2==0)
			{
				System.out.println("Divisible by 2");
			}
			if(a%3==0)
			{
				System.out.println("Divisible by 3");
			}
			if(a%5==0)
			{
				System.out.println("Divisible by 5");					
			}
			
		}		
	}
}
/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign50
Enter number: 30
Divisible by 2
Divisible by 3
Divisible by 5
*/