/*
36. Smallest of Three Numbers (Nested Ternary)
Scenario: Take three numbers as input and print the smallest using nested ternary operator.
Input:
Enter numbers: 12, 8, 19
Output:
Smallest number: 8
*/

import java.util.Scanner;
public class Assign36
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		System.out.print("Enter 3 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		String g= (a<b && a<c) ? ("Smallest: " + a)
				 :(b<a && b<c) ? ("Smallest: " + b)
				 :("Smallest: " + c);
				  
		System.out.println(g);
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign36
Enter 3 numbers: 10 
20 
30
Smallest: 10

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign36
Enter 3 numbers: 58
54
12
Smallest: 12
*/