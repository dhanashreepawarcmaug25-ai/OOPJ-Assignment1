/*
22. Month Name from Number
Scenario: Take month number (1–12) and print the month name using ternary operators or if-else.
Input:
Enter month number: 8
Output:
Month is August
*/

import java.util.Scanner;

public class Assign22
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.print("Enter month number:");
		n=sc.nextInt();
		
		
		String month = (n==1) ? "January" :
						(n==2) ? "February" :
						(n==3) ? "March" :
						(n==4) ? "April" :
						(n==5) ? "May" :
						(n==6) ? "June" :
						(n==7) ? "July" : 
						(n==8) ? "August" :
						(n==9) ? "September" :
						(n==10) ? "October" :
						(n==11) ? "November" :
						(n==12) ? "December" :"ERROR" ;
						
		System.out.println("Day is " + month);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign22.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign22
Enter month number:5
Day is May

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign22
Enter month number:11
Day is November

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign22
Enter month number:9
Day is September
*/