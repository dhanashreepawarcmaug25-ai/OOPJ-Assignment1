/*
30. Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction,
Multiplication, Division) and prints result.
Input:
Select operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Output:
Result: 50

*/

import java.util.Scanner;

public class Assign30
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
				
		int num1,num2;
		System.out.print("Enter first number:");
		num1=sc.nextInt();
		System.out.print("Enter second number:");
		num2=sc.nextInt();
		
		int ch;
		
		do
		{
			System.out.print("Select operation (1-Addition, 2-Subtraction , 3-Multiplication , 4-Division): ");			
			System.out.println("Press 0 to exit");
			ch=sc.nextInt();
			
			if(ch>=1 && ch<=4){
			switch(ch)
			{
				case 1:
					int sum=num1+num2;
					System.out.println("Addition: " + sum );
					break;
				case 2:
					int sub=num1-num2;
					System.out.println("Subtraction: " + sub);
					break;
				case 3:
					int mul=num1*num2;
					System.out.println("Multiplication: " + mul);
					break;
				case 4:
					int div=num1/num2;
					System.out.println("Division: " + div);
					break;
			}	
			}
			else {
				System.out.println("Invalid Choice..");
			}
			
		}while(ch!=0);
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign30.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign30
Enter first number:25
Enter second number:50
Select operation (1-Addition, 2-Subtraction , 3-Multiplication , 4-Division): Press 0 to exit
1
Addition: 75
Select operation (1-Addition, 2-Subtraction , 3-Multiplication , 4-Division): Press 0 to exit
2
Subtraction: -25
Select operation (1-Addition, 2-Subtraction , 3-Multiplication , 4-Division): Press 0 to exit
3
Multiplication: 1250
Select operation (1-Addition, 2-Subtraction , 3-Multiplication , 4-Division): Press 0 to exit
4
Division: 0
Select operation (1-Addition, 2-Subtraction , 3-Multiplication , 4-Division): Press 0 to exit


*/