/*
44. Reverse 4-Digit Number and Palindrome Check
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
Input:
Enter 4-digit number: 1221
Output:
Reversed number: 1221
Palindrome: Yes
*/

import java.util.Scanner;
public class Assign44
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int num;
		int rem=0,rev=0;
		
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		
		int temp=num;
		
		for(int i=0;i<4;i++)
		{
			rem=num%10;
			System.out.println(rem);
			rev=(rev*10)+rem;
			System.out.println(rev);
			num/=10;
			System.out.println(num);
			
		}
		System.out.println("Reversed:" + rev);
		
		if(rev == temp){
			System.out.println("Palindrome: Yes");
		}
		else{
			System.out.println("Palindrome: No");
		}
		
	}
}
/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign44
Enter a number: 1221
1
1
122
2
12
12
2
122
1
1
1221
0
Reversed:1221
Palindrome: Yes
*/