/*
1. Greatest of Two Test Scores
Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print
which test the friend scored higher in.
Input:
Enter score for Test 1: 78
Enter score for Test 2: 85
Output:
Test 2 has higher score.
*/

import java.util.Scanner;

public class Assign1{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b;
		
		System.out.print("Enter score for Test 1: ");		
		a=sc.nextInt();
		
		System.out.print("Enter score for Test 2: ");	
		b=sc.nextInt();
		
		if(a>b){
			System.out.println("Test 1 score is higher");
		}
		else{
			System.out.println("Test 2 score is higher");
		}
	}
}

/*
C:\Users\Lenovo>cd "C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1"

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign1.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign1
Enter score for Test 1: 20
Enter score for Test 2: 25
Test 2 score is higher
*/