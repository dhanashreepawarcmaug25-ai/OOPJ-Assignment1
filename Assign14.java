/*
14. Reverse a 4-Digit Number
Scenario: Take a 4-digit number and print its reverse.
Input:
Enter 4-digit number: 1234
Output:
Reversed number: 4321
*/
import java.util.Scanner;

public class Assign14
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("Enter 4-digit number:");
		n=sc.nextInt();
		int rem=0;
		int rev=0;
		
		
		for(int i=0;i<4;i++){
			rem=n%10;			
			n/=10;
			rev=(rev*10)+rem;
			System.out.println(rev);
		}
		
		
		System.out.print("Reversed number:" + rev);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign14.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign14
Enter 4-digit number:8754
4
45
457
4578
Reversed number:4578
*/