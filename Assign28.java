/*
28. Traffic Signal Instruction
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction.
Input:
Enter traffic light color: Green
Ootput:
Go
*/

import java.util.Scanner;

public class Assign28
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		String str;
		System.out.print("Enter traffic light color:");
		str=sc.nextLine();
		
		switch(str){
			
			case "Red":
				System.out.println("STOP");
				break;
			case "Green":
				System.out.println("GO");
				break;
			case "Yellow":
				System.out.println("WAIT ! Pedestrians first");
				break;
			
			default:
				System.out.println("Error..");
				break;
				
		}
	}
}
/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign28.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign28
Enter traffic light color:red
Error..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign28
Enter traffic light color:Red
STOP
*/