/*
27. Print Message Based on Character (A–E)
Scenario: Take a character (A–E) and print a specific message using switch-case.
Input:
Enter a character: B
Output:
You selected option B
*/

import java.util.Scanner;

public class Assign27
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		char ch;
		System.out.print("Enter a character:");
		ch=sc.next().charAt(0);
		char choice=Character.toUpperCase(ch);
		
		switch(choice){
			
			case 'A':
				System.out.println("You selected option A");
				break;
			case 'B':
				System.out.println("You selected option B");
				break;
			case 'C':
				System.out.println("You selected option C");
				break;
			case 'D':
				System.out.println("You selected option D");
				break;
			
			default:
				System.out.println("Error..");
				break;
				
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign27.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign27
Enter a character:c
You selected option C

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign27
Enter a character:b
You selected option B
*/