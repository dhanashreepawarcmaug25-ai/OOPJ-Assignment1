/*
16. Vowel or Consonant Checker
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid input.
Input:
Enter a character: e
Output:
Vowel
*/
import java.util.Scanner;

public class Assign16
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		char ch;
		System.out.print("Enter a character: ");
		ch=sc.next().charAt(0);
		
		
		if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' 
			|| ch == 'I' || ch == 'O' || ch == 'U' )
		{
			System.out.println("Vowel");
		}
		
		else if(Character.isLetter(ch))
		{ 
			System.out.println("Consonant");
		}
		
		else{
			System.out.println("Error");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign16
Enter a character: a
Vowel
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign16
Enter a character: v
Consonant
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign16
Enter a character: u
Vowel
*/