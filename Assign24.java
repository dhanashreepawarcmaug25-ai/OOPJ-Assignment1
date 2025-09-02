/*
24. Grade Using Switch (Ranges)
Scenario: Take marks (0–100) and print grade using switch-case grouping:
● 0–24 → F
● 25–44 → E
● 45–54 → D
● 55–69 → C
● 70–84 → B
● 85–100 → A
Input:
Enter marks: 78
Output:
Grade: B
*/

import java.util.Scanner;

public class Assign24
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int marks;
		
		System.out.print("Enter marks:");
		marks=sc.nextInt();
		String grade;
        
        if(marks < 0 || marks > 100) {
            grade = "Invalid";
        } 
		else if(marks <= 24) {
            grade = "F";
        } 
		else if(marks <= 44) {
            grade = "E";
        } 
		else if(marks <= 54) {
            grade = "D";
        } 
		else if(marks <= 69) {
            grade = "C";
        } 
		else if(marks <= 84) {
            grade = "B";
        } 
		else {
            grade = "A";
        }
		
        switch(grade) {
            case "A":
                System.out.println("Grade: A");
                break;
            case "B":
                System.out.println("Grade: B");
                break;
            case "C":
                System.out.println("Grade: C");
                break;
            case "D":
                System.out.println("Grade: D");
                break;
            case "E":
                System.out.println("Grade: E");
                break;
            case "F":
                System.out.println("Grade: F");
                break;
				
            default:
                System.out.println("Invalid Marks");
        }
		/*
		switch(ch){
			case 0:
				System.out.println("Grade:");
				break;
			case 1:
				System.out.println("Grade:");
				break;
			case 2:
				System.out.println("Grade:");
				break;
			case 3:
				System.out.println("Grade:" );
				break;
			case 4:
				System.out.println("Grade:");
				break;
			case 5:
				System.out.println("Grade:");
				break;
			case 6:
				System.out.println("Grade:");
				break;
			case 7:
				System.out.println("Grade:");
				break;
			case 8:
				System.out.println("Grade:");
				break;
			case 9:
				System.out.println("Grade:");
				break;
				
			default:
				System.out.println("Error..");
			
		}*/
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>javac Assign24.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign24
Enter marks:28
Grade: E

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign24
Enter marks:78
Grade: B

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign24
Enter marks:85
Grade: A

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments\OOPJ-Assignment1>java Assign24
Enter marks:54
Grade: D
*/