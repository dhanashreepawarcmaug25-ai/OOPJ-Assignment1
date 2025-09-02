/*
13. Exam Eligibility with Medical Cause
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and
medical cause (Y/N) as input and decide if the student can sit in exam.
Input:
Classes held: 100
Classes attended: 60
Medical cause (Y/N): Y
Output:
Student is allowed to sit for the exam.

*/

import java.util.Scanner;

public class Assign13
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int held,attended;
		
		System.out.print("Enter total classes held: ");
		held=sc.nextInt();
		System.out.print("Enter classes attended: ");
		attended=sc.nextInt();
		
		char medical;
		System.out.print("Medical cause (Y/N): ");
		medical=sc.next().charAt(0);
		
		if(medical == 'Y' || medical == 'y'){
			System.out.println("Student is allowed to sit for exam..");
		}
		
        sc.close();
	}
}

/*

*/