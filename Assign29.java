/*
29. Day Type Selection
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
Input:
Enter day type (1–Workday, 2–Weekend): 2
Output:
It’s weekend. No work today.

*/
import java.util.Scanner;

public class Assign29
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int day;
		System.out.print("Enter day type (1:Workday, 2:Weekend):");
		day=sc.nextInt();
		
		if(day==1){
			System.out.println("It's a working day");
		}
		else if(day==2){
			System.out.println("It’s weekend. No work today.");
		}
		else{
			System.out.println("Incorrect type");
		}
	}
}
/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign29
Enter day type (1:Workday, 2:Weekend):1
It's a working day

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign29
Enter day type (1:Workday, 2:Weekend):2
It?s weekend. No work today.

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign29
Enter day type (1:Workday, 2:Weekend):0
Incorrect type
*/