/*
49. Days in Month Considering Leap Year
Scenario: Take a year and month number, print days in that month considering leap years.
Input:
Enter year: 2024
Enter month number: 2
Output:
29 days
*/



import java.util.Scanner;

public class Assign49
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int y;
		System.out.print("Enter year: ");
		y = sc.nextInt();
		int n;
		System.out.print("Enter month:");
		n=sc.nextInt();
		
		switch(n){
			case 1:
				System.out.println("January"+ "\n 31 Days");
				break;
			case 2:
				if(y%4==0){
					System.out.print(y + " Is a Leap Year");
					if(n==2){
						System.out.println("\nFebruary" +" 29 Days");
					}
				}
				else{
					System.out.println("\nFebruary" + " 28 Days");				
				}
				break;
			case 3:
				System.out.println("March" + "\n 30 Days" );
				break;
			case 4:
				System.out.println("April" + "\n 31 Days");
				break;
			case 5:
				System.out.println("May" + "\n 30 Days");
				break;
			case 6:
				System.out.println("June"+ "\n 31 Days");
				break;
			case 7:
				System.out.println("July" + "\n 30 Days");
				break;
			case 8:
				System.out.println("August"+ "\n 31 Days");
				break;
			case 9:
				System.out.println("September"+ "\n 30 Days");
				break;
			case 10:
				System.out.println("October"+ "\n 31 Days");
				break;
			case 11:
				System.out.println("November"+ "\n 30 Days");
				break;
			case 12:
				System.out.println("December"+ "\n 31 Days");
				break;
				
			default:
				System.out.println("Not a number!");
		}
		
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign49.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign49
Enter year: 2024
Enter month:2
2024 Is a Leap Year
February 29 Days
*/