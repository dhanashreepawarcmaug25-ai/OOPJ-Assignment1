/*
47. Even/Odd Status of Two Numbers
Scenario: Take two numbers and print if both are even, both odd, or mixed.
Input:
Enter first number: 12
Enter second number: 17
Output:
Numbers are mixed (one even, one odd)
*/

import java.util.*;

class Assign47 {
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int num1,num2;
		System.out.print("Enter first number : ");				
		num1=sc.nextInt();
		System.out.print("Enter second number : ");				
		num2=sc.nextInt();
		
		if(num1%2==0 && num2%2==0){
			System.out.println("Both Are Even ");
		}
		else if(num1%2!=0 && num2%2!=0){
			System.out.println("Both Are Odd ");
		}
		else{
			System.out.println("Numbers Are Mixed ");
		}
			
	}
	
}
/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign47
Enter first number : 49
Enter second number : 24
Numbers Are Mixed

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign47
Enter first number : 22
Enter second number : 48
Both Are Even
*/