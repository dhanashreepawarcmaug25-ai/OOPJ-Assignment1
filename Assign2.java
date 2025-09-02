/*
2. Highest Salary Among Three Offers
Scenario: You have three job offers. Take the offered salaries as input and print which company is
offering the highest salary.
Input:
Enter salary for Company 1: 45000
Enter salary for Company 2: 52000
Enter salary for Company 3: 50000
Output:
Company 2 offers the highest salary
*/

import java.util.Scanner;

public class Assign2
{	
	public static void main(String args[])
	{		
		Scanner sc=new Scanner(System.in);
		int sal1,sal2,sal3;
		System.out.println("Enter salary for Company 1: ");
		sal1=sc.nextInt();
		System.out.println("Enter salary for Company 2: ");
		sal2=sc.nextInt();
		System.out.println("Enter salary for Company 3: ");
		sal3=sc.nextInt();
		
		if(sal1>sal2 && sal1>sal3){
			System.out.println("Company 1 offers the highest salary");
		}
		
		else if(sal2>sal1 && sal2>sal3){
			System.out.println("Company 2 offers the highest salary");
		}
		
		else{
			System.out.println("Company 3 offers the highest salary");
		}		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign2.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign2
Enter salary for Company 1:
45000
Enter salary for Company 2:
52000
Enter salary for Company 3:
50000
Company 2 offers the highest salary
*/