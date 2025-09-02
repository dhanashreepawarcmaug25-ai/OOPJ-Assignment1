/*
46. Character Type Checker
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character.
Input:
Enter character: %
Output:
Special Character
*/

import java.util.Scanner;

public class Assign46
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		char ch;
		System.out.print("Enter character: ");
		ch=sc.next().charAt(0);
		
		if(ch=='0'|ch=='1'|ch=='2'|ch=='3'|ch=='4'|ch=='5'|ch=='6'|ch=='7'|ch=='8'|ch=='9'){
			System.out.println("Digit");
		}
		
		else if(ch=='@' | ch=='#' | ch=='$'| ch=='%' | ch=='^'| ch=='&'|ch=='*'){
			System.out.println("Special Character");
		}
		
		else{
			System.out.println("Alphabet");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign46.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign46
Enter character: a
Alphabet

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign46
Enter character: %
Special Character

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign46
Enter character: 5
Digit
*/