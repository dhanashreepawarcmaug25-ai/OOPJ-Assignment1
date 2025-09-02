/*
10. Exam Attendance Eligibility
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as
input, print allowance.
Input:
Enter total classes held: 100
Enter classes attended: 78
Output:
Student is allowed to sit for exam
*/

import java.util.Scanner;

public class Assign10
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int held,attended;
		
		System.out.print("Enter total classes held: ");
		held=sc.nextInt();
		System.out.print("Enter classes attended: ");
		attended=sc.nextInt();
		
		double min=((double) attended/held)*100;
		
		System.out.println("Attendance: " + min);
		
		if(min >= 75){
			System.out.println("Student is allowed to sit for exam..");
		}
		
		else{
			System.out.println("Student is not allowed to sit for exam..");
		}
		
        sc.close();
	}
}

/*
>java Assign10
Enter total classes held: 150
Enter classes attended: 25
Attendance: 16.666666666666664%
Student is not allowed to sit for exam..

>java Assign10
Enter total classes held: 100
Enter classes attended: 76
Attendance: 76.0%
Student is allowed to sit for exam..
*/