/*
48. Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
Input:
Enter marks: 78
Output:
Grade: A−
*/

import java.util.Scanner;

public class Assign48{
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		int marks;
		
		System.out.print("Enter Marks: ");
		marks=sc.nextInt();
		
		if(marks>=85 && marks<=100){
			System.out.println("Grade: A");
		}
		else if(marks>=75 && marks<85){
			System.out.println("Grade: A-");
		}
		else if(marks>=65 && marks<75){
			System.out.println("Grade: B");
		}
		else if(marks>=55 && marks<65){
			System.out.println("Grade: B-");
		}
		else if(marks>=50 && marks<55){
			System.out.println("Grade: C");
		}
		else if(marks>=40 && marks<50){
			System.out.println("Grade: C-");
		}
		else{
			System.out.println("Grade: F");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign48.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign48
Enter Marks: 78
Grade: A-

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign48
Enter Marks: 85
Grade: A
*/