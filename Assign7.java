/*
7. Exam Pass or Fail
Scenario: A student gives an exam. Take marks (0–100) as input and print whether the student has passed
(>=35) or failed.

*/

import java.util.Scanner;

public class Assign7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int marks;
		System.out.print("Enter Marks : ");
		marks=sc.nextInt();
		
		if(marks>=35){
			System.out.print("Student is Passed..");
		}
		
		else{
			System.out.print("Student has Failed");
		}
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign7.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign7
Enter Marks : 42
Student is Passed..
*/