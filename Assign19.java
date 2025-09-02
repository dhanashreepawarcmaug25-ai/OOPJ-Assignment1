/*
19. Days in a Month
Scenario: Take month number (1–12) and print number of days in that month.
Input:
Enter month: 2
28 or 29 days
*/
import java.util.Scanner;

public class Assign19
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.print("Enter month:");
		n=sc.nextInt();
		
		switch(n){
			case 1:
				System.out.println("January"+ "\n 31 Days");
				break;
			case 2:
				System.out.println("February" + "\n 28 or 29 Days");
				break;
			case 3:
				System.out.println("March" + "\n 30 Days" );
				break;
			case 4:
				System.out.println("April" + "\n 31 Days");
				break;
			case 5:
				System.out.println("May" + "\n 30 Days");
				break;
			case 6:
				System.out.println("June"+ "\n 31 Days");
				break;
			case 7:
				System.out.println("July" + "\n 30 Days");
				break;
			case 8:
				System.out.println("August"+ "\n 31 Days");
				break;
			case 9:
				System.out.println("September"+ "\n 30 Days");
				break;
			case 10:
				System.out.println("October"+ "\n 31 Days");
				break;
			case 11:
				System.out.println("November"+ "\n 30 Days");
				break;
			case 12:
				System.out.println("December"+ "\n 31 Days");
				break;
				
			default:
				System.out.println("Not a number!");
		}
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign19.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign19
Enter month:2
February
 28 or 29 Days

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign19
Enter month:8
August
 31 Days
*/