/*
41. Check Armstrong Number (3-Digit)
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits =
number).
Input:
Enter number: 153
Output:
153 is an Armstrong number
*/

import java.util.Scanner;
public class Assign41
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int num;
		int l;
		int cube=0,sum=0;
		
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		int temp=num;
		
		for(int i=0;i<4;i++)
		{
			l=num%10;   
			cube=l*l*l;
			sum=sum+cube;
			num/=10; 
			
		}
		
		if(sum==temp){
			System.out.println("Armstrong number");
		}
		
		else{
			System.out.println("Not an Armstrong number");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign41
Enter a number: 153
Armstrong number

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign41
Enter a number: 236
Not an Armstrong number

*/