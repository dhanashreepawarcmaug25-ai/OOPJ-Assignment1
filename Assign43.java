/*
43. Sum of Digits of a Number
Scenario: Take a number as input and print the sum of its digits.
Input:
Enter number: 482
Output:
Sum of digits: 14
*/
import java.util.Scanner;
public class Assign43
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int a;
		int l=0,sum=0;
		
		System.out.print("Enter a number: ");
		a=sc.nextInt();
		
		for(int i=0;i<4;i++)
		{
			l=a%10;   //i=0 l=2,  i=1 l=8,  i=2 l=4
			System.out.println(" l = "+l);
			sum=sum+l;//sum=0+2,  sum=2+8,  sum=2+8+4
			a/=10; //remove 2 ,8 ,4
			
			System.out.println("Sum of Digits:" + sum);
		}
		
		System.out.println("Sum of Digits:" + sum);
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign43
Enter a number: 482
 l = 2
Sum of Digits:2
 l = 8
Sum of Digits:10
 l = 4
Sum of Digits:14
 l = 0
Sum of Digits:14
Sum of Digits:14
*/