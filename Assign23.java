/*
23. Basic Calculator Using Switch-Case
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result.
Input:
Enter first number: 15
Enter second number: 3
Enter operator: /
Output:
Result: 5

*/
import java.util.Scanner;

public class Assign23
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,m,result;
		
		System.out.print("Enter first number:");
		n=sc.nextInt();
		System.out.print("Enter second number:");
		m=sc.nextInt();
		
		char ch;
		System.out.print("Enter operator:");
		ch=sc.next().charAt(0);
		
		
		switch(ch){
			
			case '+':
				result=n+m;
				System.out.println("Addition :" + result);
				break;
			case '-':
				result=n-m;
				System.out.println("Subtraction :" + result);
				break;
			case '*':
				result=n*m;
				System.out.println("Multiplication :" + result);
				break;
			case '/':
				result=n/m;
				System.out.println("Division :"+ result);
				break;
			
			default:
				System.out.println("Error..");
				break;
				
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign20.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign20
Enter first number:5
Enter second number:5
Enter operator:*
Multiplication :25
*/