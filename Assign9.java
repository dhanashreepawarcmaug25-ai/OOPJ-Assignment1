/*
9. Employee Bonus Eligibility
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and
years of service as input and print bonus amount.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus amount: 2500

*/

import java.util.Scanner;

public class Assign9
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int sal,y;
		
		System.out.print("Enter salary: ");
		sal=sc.nextInt();
		
		System.out.print("Enter years of service: ");
		y=sc.nextInt();
		
		if(y>5){
			float bonus;
			bonus=sal*0.05f;
			System.out.println("Bonus Amount: "+ bonus);
		}
		else{
			System.out.println("No Bonus..");
		}
	}
}

/*
>java Assign9
Enter salary: 50000
Enter years of service: 6
Bonus Amount: 2500.0
*/