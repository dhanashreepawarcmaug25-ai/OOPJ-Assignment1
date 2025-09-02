/*
38. Vowel or Consonant (Ternary)
Scenario: Take a character and check if it is a vowel or consonant using ternary operator.
Input:
Enter character: i
Output:
Vowel

*/

import java.util.Scanner;
public class Assign38
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.print("Enter a character: ");
		ch=sc.next().charAt(0);
		ch=Character.toLowerCase(ch);
		
		String vowel= (ch=='a' | ch=='e' | ch=='i' | ch=='o'| ch=='u') ? "Vowel" :"Consonant";

		System.out.println(vowel);
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign38
Enter a character: A
Vowel

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign38
Enter a character: B
Consonant

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign38
Enter a character: e
Vowel

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign38
Enter a character: O
Vowel
*/