/*
11. Grade Based on Percentage
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade:
● 90+ → A+
● 76–89 → A
● 66–75 → B+
● 51–65 → B
● 36–50 → C
● Below 35 → Fail
Input:
Enter percentage marks: 82
Output:
Grade: A
*/

import java.util.Scanner;

public class Assign11
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		float marks;
		System.out.print("Enter percentage marks: ");
		marks=sc.nextFloat();
		
		if(marks>90)
		{
			System.out.println("Grade: A+");
		}
	
		else if(marks>76 && marks<89)
		{System.out.println("Grade: A");}
		
		else if(marks>66 && marks<75)
		{System.out.println("Grade: B+");}
	
		else if(marks>51 && marks<65)
		{System.out.println("Grade: B");}
		else if(marks>36 && marks<50)
		{System.out.println("Grade: C");}
	
		else{
			System.out.println("Fail");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign11.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign11
Enter percentage marks: 91
Grade: A+

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign11
Enter percentage marks: 35
Fail

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign11
Enter percentage marks: 85
Grade: A
*/