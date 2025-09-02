/*
5. Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden
*/
import java.util.*;

public class Assign5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int length,breadth;
		
		System.out.print("Enter the length of garden : ");
		length = sc.nextInt();
		
		System.out.print("Enter the breadth of garden : ");		
		breadth = sc.nextInt();
		
		if(length == breadth){
			System.out.println("Square garden.");
		}
		
		else{
			System.out.println("Rectangle garden.");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign5.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign5
Enter the length of garden : 12
Enter the breadth of garden : 12
Square garden.
*/